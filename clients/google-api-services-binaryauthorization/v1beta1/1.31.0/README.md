# Binary Authorization API Client Library for Java

The management interface for Binary Authorization, a system providing policy control for images deployed to Kubernetes Engine clusters. 

This page contains information about getting started with the Binary Authorization API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Binary Authorization API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Binary Authorization API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-binaryauthorization</artifactId>
      <version>v1beta1-rev20201113-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-binaryauthorization:v1beta1-rev20201113-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-binaryauthorization/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/binaryauthorization/v1/
