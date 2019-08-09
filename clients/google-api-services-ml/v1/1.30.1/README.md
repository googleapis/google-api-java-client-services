# Cloud Machine Learning Engine Client Library for Java

An API to enable creating and using machine learning models.

This page contains information about getting started with the Cloud Machine Learning Engine
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Machine Learning Engine][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Machine Learning Engine][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-ml</artifactId>
      <version>v1-rev20190801-1.30.1</version>
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
  compile 'com.google.apis:google-api-services-ml:v1-rev20190801-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-ml/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
