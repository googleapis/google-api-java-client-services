# Enterprise License Manager API Client Library for Java

The Google Enterprise License Manager API's allows you to license apps for all the users of a domain managed by you.

This page contains information about getting started with the Enterprise License Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Enterprise License Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Enterprise License Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-licensing</artifactId>
      <version>v1-rev20201116-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-licensing:v1-rev20201116-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-licensing/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/licensing/v1/
