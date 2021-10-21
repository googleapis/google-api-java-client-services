# Analytics Reporting API Client Library for Java

Accesses Analytics report data.

This page contains information about getting started with the Analytics Reporting API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Analytics Reporting API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Analytics Reporting API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-analyticsreporting</artifactId>
      <version>v4-rev20211020-1.32.1</version>
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
  compile 'com.google.apis:google-api-services-analyticsreporting:v4-rev20211020-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-analyticsreporting/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/analyticsreporting/v1/
