package com.golf.five;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    URL resource = BaseTests.class.getClassLoader().getResource("test.isbns");
    File file = Paths.get(resource.toURI()).toFile();
    String absPath = file.getAbsolutePath();
    List<String> isbns = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new FileReader(absPath));
    String line = reader.readLine();
    while(line != null){
      isbns.add(line);
      line = reader.readLine();
    }
    reader.close();
    return Stream.of(
      Arguments.of((Object) isbns.toArray(new String[0]))
    );
  }

  @MethodSource
  @ParameterizedTest
  void testProgramOutput(String[] args) throws Exception {
    String[] result = {};
    List<String> results = new ArrayList<String>();
    String[] outcomes = {"true", "true", "false", "false", "true"};
    for(int i = 0; i < args.length; i++){
      String[] arg = {args[i]};
      Main.main(arg);
      result = outContent.toString().strip().split(" ");
    }
    results.add(result[result.length - 1]);
    String[] outputs = results.get(0).split("\n");
    for(int i = 0; i < outputs.length; i++){
      assertEquals(
        outcomes[i],
        outputs[i]
      );
    }
  }

  @AfterAll
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

}
