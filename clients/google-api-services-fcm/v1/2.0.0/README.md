# Firebase Cloud Messaging API Client Library for Java

FCM send API that provides a cross-platform messaging solution to reliably deliver messages.

This page contains information about getting started with the Firebase Cloud Messaging API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase Cloud Messaging API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase Cloud Messaging API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-fcm</artifactId>
      <version>v1-rev20250610-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-fcm:v1-rev20250610-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-fcm/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/fcm/v1/
