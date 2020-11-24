# Google Play Game Management Client Library for Java

The Google Play Game Management API allows developers to manage resources from the Google Play Game service.

This page contains information about getting started with the Google Play Game Management
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Play Game Management][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Play Game Management][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-gamesManagement</artifactId>
      <version>v1management-rev20200811-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-gamesManagement:v1management-rev20200811-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-gamesManagement/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/gamesManagement/v1/
