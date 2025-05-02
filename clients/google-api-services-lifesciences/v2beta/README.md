# Cloud Life Sciences API Client Library for Java

Cloud Life Sciences is a suite of services and tools for managing, processing, and transforming life sciences data.

This page contains information about getting started with the Cloud Life Sciences API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Life Sciences API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Life Sciences API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-lifesciences</artifactId>
      <version>v2beta-rev20250411-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-lifesciences:v2beta-rev20250411-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-lifesciences/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/lifesciences/v1/
