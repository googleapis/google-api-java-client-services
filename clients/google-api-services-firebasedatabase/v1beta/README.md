# Firebase Realtime Database API Client Library for Java

The Firebase Realtime Database API enables programmatic provisioning and management of Realtime Database instances.

This page contains information about getting started with the Firebase Realtime Database API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase Realtime Database API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase Realtime Database API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebasedatabase</artifactId>
      <version>v1beta-rev20221214-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-firebasedatabase:v1beta-rev20221214-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebasedatabase/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebasedatabase/v1/
