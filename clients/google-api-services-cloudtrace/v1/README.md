# Stackdriver Trace API Client Library for Java

Sends application trace data to Stackdriver Trace for viewing. Trace data is collected for all App Engine applications by default. Trace data from other applications can be provided using this API. This library is used to interact with the Trace API directly. If you are looking to instrument your application for Stackdriver Trace, we recommend using OpenCensus.


This page contains information about getting started with the Stackdriver Trace API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Stackdriver Trace API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Stackdriver Trace API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-cloudtrace</artifactId>
      <version>v1-rev20190917-1.30.3</version>
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
  compile 'com.google.apis:google-api-services-cloudtrace:v1-rev20190917-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-cloudtrace/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
