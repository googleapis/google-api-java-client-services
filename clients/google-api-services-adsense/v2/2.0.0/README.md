# AdSense Management API Client Library for Java

The AdSense Management API allows publishers to access their inventory and run earnings and performance reports.

This page contains information about getting started with the AdSense Management API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the AdSense Management API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the AdSense Management API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-adsense</artifactId>
      <version>v2-rev20250506-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-adsense:v2-rev20250506-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-adsense/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/adsense/v1/
