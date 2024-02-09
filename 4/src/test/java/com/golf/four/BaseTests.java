package com.golf.four;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.projog.api.Projog;
import org.projog.api.QueryResult;
import org.projog.api.QueryStatement;
import org.projog.core.term.Atom;

import org.projog.tools.ProjogConsole;

class BaseTests {

  /*
    Word to the accepted answer at SO, they're a real one.
    https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
  */

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @BeforeAll
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  static Stream<Arguments> testProgramOutput() throws Exception {
    URL resource = BaseTests.class.getClassLoader().getResource("main.pl");
    File file = Paths.get(resource.toURI()).toFile();
    String absPath = file.getAbsolutePath();
    return Stream.of(
      Arguments.of((Object) new String[]{absPath})
    );
  }

  @MethodSource
  @ParameterizedTest
  void testProgramOutput(String[] args) throws Exception {
    //ProjogConsole.main(args);
    Projog projog = new Projog();
    projog.consultFile(
      Paths.get(
        BaseTests.class.getClassLoader().getResource("main.pl").toURI()
      ).toFile()
    );
    QueryStatement query = projog.createStatement("friend(X, mary).");
    QueryResult result = query.executeQuery();
    String output = "";
    while(result.next()){
      System.out.println(result);
      output += result.getTerm("X");
    }
    assertEquals(
      "annajohnmary",
      output
    );
  }

  @AfterAll
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

}
