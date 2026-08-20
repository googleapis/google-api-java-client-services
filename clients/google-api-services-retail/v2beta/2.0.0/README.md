# AI Commerce Search API Client Library for Java

The AI Commerce Search API is made up of Retail Search, Browse and Recommendations. These discovery AI solutions help you implement personalized search, browse and recommendations, based on machine learning models, across your websites and mobile applications. 

This page contains information about getting started with the AI Commerce Search API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the AI Commerce Search API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the AI Commerce Search API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-retail</artifactId>
      <version>v2beta-rev20260813-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-retail:v2beta-rev20260813-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-retail/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/retail/v1/
