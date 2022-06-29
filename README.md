# Test Framework ![](https://github.com/Premraj1212/testng-allure-framework/workflows/testng%20Allure%20Test%20Framework%20CI/badge.svg)

A test framework for web platform 

## Setup

#### Build Project:
From terminal run
```$xslt
./gradlew build
```
#### Run tests: 

##### UI:

```$xslt
./gradlew runTests
```
##### run with parameters:

```$xslt
./gradlew runTests -Dtags=smoke -Denv=heroku
```
##### UI on firefox:

```$xslt
./gradlew runTests -Dbrowser=firefox
```

##### Headless:

```$xslt
./gradlew runTests -Dtarget=headless
```

##### Headspin:

```$xslt
./gradlew runTests -Dtarget=headspin
```

#### View Report
You can find report in path

`build/reports/allure-report/index.html`

#### View Logs
Logs are captured per test, these can be found in below path
`logs/*.log`

## Stack

| Category       | Value          |
| -------------- | ---------------|
| Language       | Java, Groovy   | 
| BuildTool      | Gradle         | 
| Reporting      | Allure         | 
| DI             | Guice          | 
| TestFramework  | TestNG         | 
| Environments   | dev            | 

## Framework Supports

| OS        | Browsers |Run Modes| Screenshots            |Parallelism|
| --------- | ---------|---------|------------------------|-----------|
| Mac       | Chrome   | UI      | On every click and type| Yes       |
| Linux     | Firefox  | Headless| On Test Failure        | Yes       |
| Windows   |          | Headspin|                        | No        |

## Scenarios Covered
* Login Form

## Approach

Brief description on some of the important packages.

### Clients
This is a pre-check to verify if the site up, we make an api call to get the app state.
This avoids lazy test failures.


### Components
All pages are built as a group of components which are reusable across applications.

* LoginFormComponent : This covers section related to Login Form
    
This approach helps when the site has lot of moving pieces and refactoring is easy.

### Data
All data is modeled as a business entity 

* Site => Global entity, keeps a track of all site details, like title etc
* Customer
* Credentials


### Assertions

All assertions are part of the page itself.

This approach helps in validation business data easily

Eg:

```$java
    public void assertThatSiteIsUp() {
         assertThat(title).startsWith(siteTitle);
     }
```

### Screenshots

Framework captures screenshot on below actions to build test timeline
* Click
* Type

Framework also capture screenshot at the time of test failure


