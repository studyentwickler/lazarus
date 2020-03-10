# Lazarus Test Framework

This framework is written in Java and based on 

- Maven
- Cucumber
- Rest Assured
- Log4j

## Reports
It is generated the pretty html reports by cucumber reporting plugin.
![Cucumber reports](https://i.imgur.com/zsw8DXI.png)

## Page object model
Furthermore, it contains the page object model to have a nicer code.

## Most used commands:

Start testing a specific feature file by tag
- `mvn test -Dcucumber.filter.tags="@Test"`

Start all tests which you have
- `mvn test`

It will delete all previously compiled Java sources and resources (like .properties) in your project. 
- `mvn clean`

Next command will then compile, test & package your Java project and even install/copy your built .jar/.war file into your local Maven repository.
- `mvn clean install`

## Structure

**Here are steps**

=> src/test/java/lazarus/steps/backend

**Here are Page Object Model files**

=> src/test/java/lazarus/steps/pages

**Here are Steps definitions like e.g. properties for log4j**

=> src/test/java/lazarus/steps/StepDefinitions.java

**Here are initialising of loger and web driver**

=> src/test/java/lazarus/steps/StepHelper.java

**Here is web driver setup**

=> src/test/java/lazarus/steps/DriverCreation.java

**Here are cucumber steps for web**

=> src/test/java/lazarus/steps/web

**Here are drivers for different OS**

=> src/test/resources/driver

**Here are cucumber features files**

=> src/test/resources/features

**Here are utilities classes**

=> src/test/resources/utilities

**Here are HTML Reports**

=> target/cucumber-html-report/cucumber-html-reports
