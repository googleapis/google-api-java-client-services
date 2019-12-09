# Replica Pool API Client Library for Java

The Replica Pool API allows users to declaratively provision and manage groups of Google Compute Engine instances based on a common template.

This page contains information about getting started with the Replica Pool API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Replica Pool API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Replica Pool API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-replicapool</artifactId>
      <version>v1beta1-rev20160512-1.30.3</version>
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
  compile 'com.google.apis:google-api-services-replicapool:v1beta1-rev20160512-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-replicapool/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/replicapool/v1/
