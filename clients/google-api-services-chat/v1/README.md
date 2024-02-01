# Google Chat API Client Library for Java

Enables apps to fetch information and perform actions in Google Chat. Authentication is a prerequisite for using the Google Chat REST API.

This page contains information about getting started with the Google Chat API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Chat API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Chat API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-chat</artifactId>
      <version>v1-rev20240128-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-chat:v1-rev20240128-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-chat/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/chat/v1/
