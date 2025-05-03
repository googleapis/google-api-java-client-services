# Cloud Dataplex API Client Library for Java

Dataplex API is used to manage the lifecycle of data lakes.

This page contains information about getting started with the Cloud Dataplex API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Dataplex API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Dataplex API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-dataplex</artifactId>
      <version>v1-rev20250429-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-dataplex:v1-rev20250429-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-dataplex/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/dataplex/v1/
