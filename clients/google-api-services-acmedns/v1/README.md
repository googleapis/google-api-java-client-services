# ACME DNS API Client Library for Java

Google Domains ACME DNS API that allows users to complete ACME DNS-01 challenges for a domain.

This page contains information about getting started with the ACME DNS API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the ACME DNS API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the ACME DNS API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-acmedns</artifactId>
      <version>v1-rev20230301-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-acmedns:v1-rev20230301-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-acmedns/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/acmedns/v1/
