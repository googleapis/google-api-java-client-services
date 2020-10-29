# Service Control API Client Library for Java

Provides control plane functionality to managed services, such as logging, monitoring, and status checks.

This page contains information about getting started with the Service Control API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Service Control API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Service Control API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-servicecontrol</artifactId>
      <version>v2-rev20201025-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-servicecontrol:v2-rev20201025-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-servicecontrol/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/servicecontrol/v1/
