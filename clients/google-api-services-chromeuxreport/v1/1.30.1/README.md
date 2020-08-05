# Chrome UX Report API Client Library for Java

The Chrome UX Report API lets you view real user experience data for millions of websites. 

This page contains information about getting started with the Chrome UX Report API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Chrome UX Report API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Chrome UX Report API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-chromeuxreport</artifactId>
      <version>v1-rev20200803-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-chromeuxreport:v1-rev20200803-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-chromeuxreport/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/chromeuxreport/v1/
