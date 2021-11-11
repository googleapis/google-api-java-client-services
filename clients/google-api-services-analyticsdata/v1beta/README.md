# Google Analytics Data API Client Library for Java

Accesses report data in Google Analytics.

This page contains information about getting started with the Google Analytics Data API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Analytics Data API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Analytics Data API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-analyticsdata</artifactId>
      <version>v1beta-rev20211108-1.32.1</version>
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
  compile 'com.google.apis:google-api-services-analyticsdata:v1beta-rev20211108-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-analyticsdata/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/analyticsdata/v1/
