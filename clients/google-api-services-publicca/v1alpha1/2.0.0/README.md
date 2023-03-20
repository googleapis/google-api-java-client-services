# Public Certificate Authority API Client Library for Java

The Public Certificate Authority API may be used to create and manage ACME external account binding keys associated with Google Trust Services' publicly trusted certificate authority. 

This page contains information about getting started with the Public Certificate Authority API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Public Certificate Authority API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Public Certificate Authority API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-publicca</artifactId>
      <version>v1alpha1-rev20230227-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-publicca:v1alpha1-rev20230227-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-publicca/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/publicca/v1/
