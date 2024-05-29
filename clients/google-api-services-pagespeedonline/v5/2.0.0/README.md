# PageSpeed Insights API Client Library for Java

The PageSpeed Insights API lets you analyze the performance of your website with a simple API. It offers tailored suggestions for how you can optimize your site, and lets you easily integrate PageSpeed Insights analysis into your development tools and workflow. 

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
      <version>v5-rev20240509-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-pagespeedonline:v5-rev20240509-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-pagespeedonline/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/pagespeedonline/v1/
