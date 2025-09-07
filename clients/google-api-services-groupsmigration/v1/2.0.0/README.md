# Groups Migration API Client Library for Java

The Groups Migration API allows domain administrators to archive emails into Google groups.

This page contains information about getting started with the Groups Migration API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Groups Migration API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Groups Migration API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-groupsmigration</artifactId>
      <version>v1-rev20250901-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-groupsmigration:v1-rev20250901-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-groupsmigration/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/groupsmigration/v1/
