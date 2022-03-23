# Cloud Debugger API Client Library for Java

Examines the call stack and variables of a running application without stopping or slowing it down. 

This page contains information about getting started with the Cloud Debugger API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Debugger API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Debugger API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-clouddebugger</artifactId>
      <version>v2-rev20220318-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-clouddebugger:v2-rev20220318-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-clouddebugger/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/clouddebugger/v1/
