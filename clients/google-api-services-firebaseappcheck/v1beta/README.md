# Firebase App Check API Client Library for Java

Firebase App Check works alongside other Firebase services to help protect your backend resources from abuse, such as billing fraud or phishing.

This page contains information about getting started with the Firebase App Check API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase App Check API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase App Check API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebaseappcheck</artifactId>
      <version>v1beta-rev20240422-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-firebaseappcheck:v1beta-rev20240422-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebaseappcheck/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebaseappcheck/v1/
