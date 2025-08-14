# Google Play EMM API Client Library for Java

Manages the deployment of apps to Android Enterprise devices.

This page contains information about getting started with the Google Play EMM API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Play EMM API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Play EMM API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-androidenterprise</artifactId>
      <version>v1-rev20250720-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-androidenterprise:v1-rev20250720-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-androidenterprise/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/androidenterprise/v1/
