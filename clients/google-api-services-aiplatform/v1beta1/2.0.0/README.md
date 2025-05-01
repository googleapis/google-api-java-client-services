# Vertex AI API Client Library for Java

Train high-quality custom machine learning models with minimal machine learning expertise and effort.

This page contains information about getting started with the Vertex AI API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Vertex AI API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Vertex AI API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-aiplatform</artifactId>
      <version>v1beta1-rev20250422-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-aiplatform:v1beta1-rev20250422-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-aiplatform/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/aiplatform/v1/
