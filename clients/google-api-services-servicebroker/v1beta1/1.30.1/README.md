# Service Broker API Client Library for Java

The Google Cloud Platform Service Broker API provides Google hosted
implementation of the Open Service Broker API
(https://www.openservicebrokerapi.org/).


This page contains information about getting started with the Service Broker API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Service Broker API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Service Broker API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-servicebroker</artifactId>
      <version>v1beta1-rev20190909-1.30.1</version>
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
  compile 'com.google.apis:google-api-services-servicebroker:v1beta1-rev20190909-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-servicebroker/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
