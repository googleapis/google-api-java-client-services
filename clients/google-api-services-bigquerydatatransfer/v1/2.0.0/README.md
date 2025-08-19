# BigQuery Data Transfer API Client Library for Java

Schedule queries or transfer external data from SaaS applications to Google BigQuery on a regular basis.

This page contains information about getting started with the BigQuery Data Transfer API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the BigQuery Data Transfer API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the BigQuery Data Transfer API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-bigquerydatatransfer</artifactId>
      <version>v1-rev20250813-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-bigquerydatatransfer:v1-rev20250813-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-bigquerydatatransfer/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/bigquerydatatransfer/v1/
