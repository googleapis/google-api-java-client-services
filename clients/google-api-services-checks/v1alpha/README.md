# Checks API Client Library for Java

The Checks API contains powerful and easy-to-use privacy and compliance APIs that interact with the Checks product and its underlying technology.

This page contains information about getting started with the Checks API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Checks API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Checks API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-checks</artifactId>
      <version>v1alpha-rev20240414-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-checks:v1alpha-rev20240414-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-checks/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/checks/v1/
