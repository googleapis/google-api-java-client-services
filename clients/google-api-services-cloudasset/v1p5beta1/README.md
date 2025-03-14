# Cloud Asset API Client Library for Java

The Cloud Asset API manages the history and inventory of Google Cloud resources.

This page contains information about getting started with the Cloud Asset API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Asset API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Asset API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-cloudasset</artifactId>
      <version>v1p5beta1-rev20250307-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-cloudasset:v1p5beta1-rev20250307-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-cloudasset/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/cloudasset/v1/
