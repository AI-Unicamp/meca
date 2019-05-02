# MECA
This Repository contains the source code of the **Multipurpose Enhanced Cognitive Architecture (MECA)**.

MECA is a Java library to build cognitive architectures / artificial minds for robots and software agents. MECA provides a framework with different capabilities out of the box for artificial minds to be built upon.

MECA has been built on top of the [Cognitive Systems Toolkit (CST)](https://github.com/CST-Group/cst). It is therefore important to know CST's concepts and how to implement cognitive architectures using CST in order to make a better use of MECA.

Note: This library is still under development, and some concepts or features might not be available yet. [Feedback/bug report](https://github.com/CST-Group/meca/issues) and [Pull Requests](https://github.com/CST-Group/meca/pulls) are most welcome!

## Installation

Download the latest [release](https://github.com/CST-Group/meca/releases) and set it as a dependency in your project. (soon to be available in a repository such as MavenCentral).

## Building the source code

This release uses gradle to download the dependencies from MavenCentral. It does not require you to have gradle installed in your system because it uses the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). Depending on your operational system, you might execute the gradlew script or the gradlew.bat script in order to compile the code. You might need the JDK to be properly installed in order to build the code. You should call "gradlew <task>" in order to build the code. Available tasks can be discovered using "gradlew tasks". After calling "gradlew build", the MECA library will be available at build/libs directory.

## Changelog / Migrations

Follow the [release](https://github.com/CST-Group/meca/releases) page to better understand the breaking changes of new versions.

## Requirements

MECA requires at minimum Java 8.

## Example

To get started, you can take a look at our [hands on codelab](https://github.com/CST-Group/codelab-meca) which teaches you how to use MECA's version 0.0.1. (soon we will provide more examples in the library repository).

## Publications

Refer to  MECA's publications to better understand the concepts behind the implemented code structures:

- [An Overview of the Multipurpose Enhanced Cognitive Architecture (MECA)](https://doi.org/10.1016/j.procs.2018.01.025);
- [The Multipurpose Enhanced Cognitive Architecture (MECA)](https://doi.org/10.1016/j.bica.2017.09.006).

&NewLine;

&NewLine;

This Software was developed in a partnership with [Ericsson Research](https://github.com/EricssonResearch).
