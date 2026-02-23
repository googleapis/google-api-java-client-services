# Data Manager API Client Library for Java

A unified ingestion API for data partners, agencies and advertisers to connect first-party data across Google advertising products.

This page contains information about getting started with the Data Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Data Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Data Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-datamanager</artifactId>
      <version>v1-rev20260217-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-datamanager:v1-rev20260217-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-datamanager/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/datamanager/v1/
