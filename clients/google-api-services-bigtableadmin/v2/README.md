# Cloud Bigtable Admin API Client Library for Java

Administer your Cloud Bigtable tables and instances.

This page contains information about getting started with the Cloud Bigtable Admin API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Bigtable Admin API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Bigtable Admin API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-bigtableadmin</artifactId>
      <version>v2-rev20250610-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-bigtableadmin:v2-rev20250610-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-bigtableadmin/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/bigtableadmin/v1/
