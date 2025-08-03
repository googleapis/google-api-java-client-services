# BigLake API Client Library for Java

The BigLake API provides access to BigLake Metastore, a serverless, fully managed, and highly available metastore for open-source data that can be used for querying Apache Iceberg tables in BigQuery.

This page contains information about getting started with the BigLake API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the BigLake API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the BigLake API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-biglake</artifactId>
      <version>v1-rev20250722-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-biglake:v1-rev20250722-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-biglake/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/biglake/v1/
