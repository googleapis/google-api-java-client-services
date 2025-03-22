# Google Civic Information API Client Library for Java

Provides polling places, early vote locations, contest data, election officials, and government representatives for U.S. residential addresses.

This page contains information about getting started with the Google Civic Information API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Civic Information API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Civic Information API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-civicinfo</artifactId>
      <version>v2-rev20250320-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-civicinfo:v2-rev20250320-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-civicinfo/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/civicinfo/v1/
