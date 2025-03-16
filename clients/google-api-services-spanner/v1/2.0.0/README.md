# Cloud Spanner API Client Library for Java

Cloud Spanner is a managed, mission-critical, globally consistent and scalable relational database service.

This page contains information about getting started with the Cloud Spanner API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Spanner API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Spanner API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-spanner</artifactId>
      <version>v1-rev20250304-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-spanner:v1-rev20250304-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-spanner/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/spanner/v1/
