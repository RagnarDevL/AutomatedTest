# Automated Test Project

This project is a simple automated testing framework using Serenity BDD with Java and Maven.

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6 or higher

## Build

To build the project, run:

```bash
mvn clean install
```

## Run Tests

To execute the automated tests and generate Serenity reports, run:

```bash
mvn cd Test_SQA && mvn clean test-compile
```

## Test Reports

After running the tests, Serenity reports will be generated in the `target/site/serenity` directory. Open the `index.html` file in that directory to view the test results.

## Project Structure

- `src/main/java`: Main application code (if any)
- `src/test/java`: Test code and step definitions
- `src/test/resources/features`: Cucumber feature files
- `serenity.properties`: Serenity configuration file
- `pom.xml`: Maven project configuration
