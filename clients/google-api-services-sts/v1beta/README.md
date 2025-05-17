# Security Token Service API Client Library for Java

The Security Token Service exchanges Google or third-party credentials for a short-lived access token to Google Cloud resources.

This page contains information about getting started with the Security Token Service API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Security Token Service API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Security Token Service API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-sts</artifactId>
      <version>v1beta-rev20250507-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-sts:v1beta-rev20250507-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-sts/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/sts/v1/
