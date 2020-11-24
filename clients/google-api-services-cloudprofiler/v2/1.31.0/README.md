# Stackdriver Profiler API Client Library for Java

Manages continuous profiling information.

This page contains information about getting started with the Stackdriver Profiler API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Stackdriver Profiler API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Stackdriver Profiler API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-cloudprofiler</artifactId>
      <version>v2-rev20200822-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-cloudprofiler:v2-rev20200822-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-cloudprofiler/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/cloudprofiler/v1/
