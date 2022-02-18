# Cloud IoT API Client Library for Java

Registers and manages IoT (Internet of Things) devices that connect to the Google Cloud Platform. 

This page contains information about getting started with the Cloud IoT API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud IoT API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud IoT API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-cloudiot</artifactId>
      <version>v1-rev20211108-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-cloudiot:v1-rev20211108-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-cloudiot/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/cloudiot/v1/
