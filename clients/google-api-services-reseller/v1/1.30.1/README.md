# Enterprise Apps Reseller API Client Library for Java

Perform common functions that are available on the Google Apps Reseller Console at scale like placing orders and viewing customer information

This page contains information about getting started with the Enterprise Apps Reseller API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Enterprise Apps Reseller API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Enterprise Apps Reseller API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-reseller</artifactId>
      <version>v1-rev20200911-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-reseller:v1-rev20200911-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-reseller/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/reseller/v1/
