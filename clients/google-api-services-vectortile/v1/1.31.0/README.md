# Semantic Tile API Client Library for Java

Serves vector tiles containing geospatial data. 

This page contains information about getting started with the Semantic Tile API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Semantic Tile API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Semantic Tile API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-vectortile</artifactId>
      <version>v1-rev20210118-1.32.1</version>
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
  compile 'com.google.apis:google-api-services-vectortile:v1-rev20210118-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-vectortile/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/vectortile/v1/
