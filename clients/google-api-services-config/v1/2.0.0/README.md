# Infrastructure Manager API Client Library for Java

Creates and manages Google Cloud Platform resources and infrastructure.

This page contains information about getting started with the Infrastructure Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Infrastructure Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Infrastructure Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-config</artifactId>
      <version>v1-rev20250528-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-config:v1-rev20250528-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-config/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/config/v1/
