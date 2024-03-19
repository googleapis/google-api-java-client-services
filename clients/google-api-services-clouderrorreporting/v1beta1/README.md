# Error Reporting API Client Library for Java

Groups and counts similar errors from cloud services and applications, reports new errors, and provides access to error groups and their associated errors. 

This page contains information about getting started with the Error Reporting API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Error Reporting API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Error Reporting API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-clouderrorreporting</artifactId>
      <version>v1beta1-rev20240313-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-clouderrorreporting:v1beta1-rev20240313-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-clouderrorreporting/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/clouderrorreporting/v1/
