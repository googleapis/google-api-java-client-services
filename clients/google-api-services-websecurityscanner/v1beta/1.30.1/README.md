# Web Security Scanner API Client Library for Java

Scans your Compute and App Engine apps for common web vulnerabilities.

This page contains information about getting started with the Web Security Scanner API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Web Security Scanner API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Web Security Scanner API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-websecurityscanner</artifactId>
      <version>v1beta-rev20190805-1.30.1</version>
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
  compile 'com.google.apis:google-api-services-websecurityscanner:v1beta-rev20190805-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-websecurityscanner/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
