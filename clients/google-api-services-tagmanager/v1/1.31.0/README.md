# Tag Manager API Client Library for Java

This API allows clients to access and modify container and tag configuration.

This page contains information about getting started with the Tag Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Tag Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Tag Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-tagmanager</artifactId>
      <version>v1-rev20200826-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-tagmanager:v1-rev20200826-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-tagmanager/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/tagmanager/v1/
