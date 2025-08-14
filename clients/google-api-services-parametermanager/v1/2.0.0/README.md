# Parameter Manager API Client Library for Java

Parameter Manager is a single source of truth to store, access and manage the lifecycle of your workload parameters. Parameter Manager aims to make management of sensitive application parameters effortless for customers without diminishing focus on security.

This page contains information about getting started with the Parameter Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Parameter Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Parameter Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-parametermanager</artifactId>
      <version>v1-rev20250716-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-parametermanager:v1-rev20250716-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-parametermanager/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/parametermanager/v1/
