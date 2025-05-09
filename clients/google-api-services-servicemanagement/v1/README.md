# Service Management API Client Library for Java

Google Service Management allows service producers to publish their services on Google Cloud Platform so that they can be discovered and used by service consumers.

This page contains information about getting started with the Service Management API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Service Management API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Service Management API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-servicemanagement</artifactId>
      <version>v1-rev20250502-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-servicemanagement:v1-rev20250502-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-servicemanagement/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/servicemanagement/v1/
