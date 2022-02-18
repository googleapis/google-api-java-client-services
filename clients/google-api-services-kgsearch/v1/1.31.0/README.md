# Knowledge Graph Search API Client Library for Java

Searches the Google Knowledge Graph for entities.

This page contains information about getting started with the Knowledge Graph Search API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Knowledge Graph Search API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Knowledge Graph Search API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-kgsearch</artifactId>
      <version>v1-rev20200809-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-kgsearch:v1-rev20200809-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-kgsearch/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/kgsearch/v1/
