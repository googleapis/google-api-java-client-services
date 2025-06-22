# Network Management API Client Library for Java

The Network Management API provides a collection of network performance monitoring and diagnostic capabilities.

This page contains information about getting started with the Network Management API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Network Management API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Network Management API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-networkmanagement</artifactId>
      <version>v1-rev20250611-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-networkmanagement:v1-rev20250611-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-networkmanagement/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/networkmanagement/v1/
