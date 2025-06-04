# Android Management API Client Library for Java

The Android Management API provides remote enterprise management of Android devices and apps.

This page contains information about getting started with the Android Management API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Android Management API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Android Management API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-androidmanagement</artifactId>
      <version>v1-rev20250602-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-androidmanagement:v1-rev20250602-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-androidmanagement/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/androidmanagement/v1/
