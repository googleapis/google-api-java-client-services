# NetApp API Client Library for Java

Google Cloud NetApp Volumes is a fully-managed, cloud-based data storage service that provides advanced data management capabilities and highly scalable performance with global availability.

This page contains information about getting started with the NetApp API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the NetApp API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the NetApp API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-netapp</artifactId>
      <version>v1-rev20250528-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-netapp:v1-rev20250528-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-netapp/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/netapp/v1/
