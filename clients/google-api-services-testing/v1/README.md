# Cloud Testing API Client Library for Java

Allows developers to run automated tests for their mobile applications on Google infrastructure.

This page contains information about getting started with the Cloud Testing API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Testing API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Testing API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-testing</artifactId>
      <version>v1-rev20201019-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-testing:v1-rev20201019-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-testing/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/testing/v1/
