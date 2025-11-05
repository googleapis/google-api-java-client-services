# Cloud Storage for Firebase API Client Library for Java

The Cloud Storage for Firebase API enables programmatic management of Cloud Storage buckets for use in Firebase projects

This page contains information about getting started with the Cloud Storage for Firebase API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Storage for Firebase API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Storage for Firebase API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebasestorage</artifactId>
      <version>v1beta-rev20251031-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-firebasestorage:v1beta-rev20251031-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebasestorage/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebasestorage/v1/
