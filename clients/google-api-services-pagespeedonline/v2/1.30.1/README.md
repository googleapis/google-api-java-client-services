# PageSpeed Insights API Client Library for Java

Analyzes the performance of a web page and provides tailored suggestions to make that page faster.

This page contains information about getting started with the PageSpeed Insights API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the PageSpeed Insights API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the PageSpeed Insights API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-pagespeedonline</artifactId>
      <version>v2-rev20180606-1.30.1</version>
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
  compile 'com.google.apis:google-api-services-pagespeedonline:v2-rev20180606-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-pagespeedonline/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
