# Kubernetes Engine API Client Library for Java

Builds and manages container-based applications, powered by the open source Kubernetes technology.

This page contains information about getting started with the Kubernetes Engine API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Kubernetes Engine API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Kubernetes Engine API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-container</artifactId>
      <version>v1-rev20250318-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-container:v1-rev20250318-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-container/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/container/v1/
