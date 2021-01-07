# Recommendations AI Client Library for Java

Recommendations AI service enables customers to build end-to-end personalized recommendation systems without requiring a high level of expertise in machine learning, recommendation system, or Google Cloud.

This page contains information about getting started with the Recommendations AI
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Recommendations AI][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Recommendations AI][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-recommendationengine</artifactId>
      <version>v1beta1-rev20201212-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-recommendationengine:v1beta1-rev20201212-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-recommendationengine/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/recommendationengine/v1/
