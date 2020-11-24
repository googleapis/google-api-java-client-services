# Cloud Run Admin API Client Library for Java

Deploy and manage user provided container images that scale automatically based on HTTP traffic.

This page contains information about getting started with the Cloud Run Admin API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Run Admin API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Run Admin API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-run</artifactId>
      <version>v1alpha1-rev20201113-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-run:v1alpha1-rev20201113-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-run/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/run/v1/
