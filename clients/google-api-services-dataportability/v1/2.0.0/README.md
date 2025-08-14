# Data Portability API Client Library for Java

The Data Portability API lets you build applications that request authorization from a user to move a copy of data from Google services into your application. This enables data portability and facilitates switching services.

This page contains information about getting started with the Data Portability API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Data Portability API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Data Portability API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-dataportability</artifactId>
      <version>v1-rev20250715-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-dataportability:v1-rev20250715-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-dataportability/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/dataportability/v1/
