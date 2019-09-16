# Stackdriver Debugger API Client Library for Java

Examines the call stack and variables of a running application without stopping or slowing it down.


This page contains information about getting started with the Stackdriver Debugger API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Stackdriver Debugger API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Stackdriver Debugger API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-clouddebugger</artifactId>
      <version>v2-rev20181114-1.30.3</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```gradle
repositories {
  mavenCentral()
}
dependencies {
  compile 'com.google.apis:google-api-services-clouddebugger:v2-rev20181114-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-clouddebugger/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
