![Green square on deep blue background with words "Allegheny Code Golf Association" in foreground, white](https://github.com/allegheny-college-cmpsc-201-spring-2024/golf/assets/1552764/d3ee6a91-74c9-482b-84eb-ec9a2e8dee05)

[![Language: Aya](https://img.shields.io/badge/Language-Aya-gray.svg)](https://aya-readthedocs.readthedocs.io/en/latest/index.html)
![Par: 176 bytes](https://img.shields.io/badge/Par-176_bytes-green)

# ⛳ Code Golf: Hole 9 - It Might Be a Leap Year, But What If It Aya-n't?

Not every year can be special. That's OK! But, that doesn't stop some years from _leaping with joy_ at their own uniqueness. These,
as the Commissioner has learned, are called _leap years_. There are some rules as to what constitutes a leap year. For example:

* 1. the year must be divisble by `4`
  * but _not_ divisible by `100`
* 2. _or_ the year must be divisble by `400`

Why is it important that we keep track of this information? No idea. But the challenge of writing it in a heretofore unknown
language sounds fun. So, we do it. As a wise person once said:
> Anything worth doing is worth doing.
So, we're going to _take it to the max_, and check what years from `1300` to `3100` will be leap years.

This repository uses the Apache Maven build platform to compile the entire interpreter (provided in the `9/src` folder).
The challenge must be completed in the `Aya` file located at:

* [9/src/test/resources/main.aya](9/src/test/resources/main.aya)

### Note to players

The Aya language is a proper golf language _and_ has an expanded real syntax. Once you solve the longer-hand "real" version,
you'll gain extra by trying to golf the solution further by taking advantage of Aya's compressed syntax.

## Tips

Tips for golfing are available as general pointers:

* [General tips for golfing with any language](https://codegolf.stackexchange.com/questions/5285/tips-for-golfing-in-all-languages)

There exists a deep `readthedocs` site for the Aya language, located here:

* [Aya Language docs](https://aya-readthedocs.readthedocs.io/en/latest/index.html)

## Requirements

* this challenge must be completed using the `Aya` language
* the program must be written in the `8/src/test/resources/main.aya` file
* the program's output must span the numbers `1300` to `3100`

## Infrastructure

If you're familiar with running Java programs, you can feel free to `javac` or use your own framework to your heart's content. 
However, this repository leverages the build lifecycle using Apache Maven. Several challenges will require Java, it might be advantageous 
for you to do so.

Given the prevalence of VSCode installs, the league provides the following resources for you should you want to install and use
Maven in VSCode.

### Installing Java resources 

This toolchain uses:

* Java JDK/JRE
* Apache Maven
* Microsoft VSCode

Along with downloading and installing each component piecemeal, VSCode's Marketplace features plugins that accommodate both the Java runtime and Maven integration. After installing VSCode, if not already installed:

* Download the appropriate Java resources from the [VSCode "Java in Visual Studio Code" guide](https://code.visualstudio.com/docs/languages/java), namely:
  * The [Microsoft Build of OpenJDK](https://www.microsoft.com/openjdk)
* The [VSCode Extension Pack for Java](https://code.visualstudio.com/docs/java/java-build) which features the Maven build platform
* Install Apache Maven according to relevant OS instructions below

#### Note for Linux distribution users

Your lives are a bit easier. To download and install the necessary Java development kit and runtime, use the following commands (if using a Debian-derived distribution such as Ubuntu):

* `apt-get install default-jdk`
* `apt-get install default-jre`

### Installing Apache Maven

#### Windows

* Download the [latest `zip` archive of Apache Maven](https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip)
* Create a folder in your `C:` drive partition at `C:\maven`
* Extract the contents of the `zip` file to the `C:\maven` directory

#### Mac OSX

* Use `brew` to install the latest version of Apache Maven: `brew install maven`

#### Debian-based Linux distributions

* Use `apt-get` to install the latest version of Apache Maven: `apt-get install maven`

### Running with Maven

The following lifecycle steps are key to running this project with Maven:

|Lifecycle step |Purpose |
|:--------------|:-------|
|`clean`        |Removes all compiled targets |
|`compile`      |Rebuilds compiled targets|
|`test`         |Runs the test that the evaluator runs|
