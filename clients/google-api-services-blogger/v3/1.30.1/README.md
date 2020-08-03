# Blogger API v3 Client Library for Java

The Blogger API provides access to posts, comments and pages of a Blogger blog.

This page contains information about getting started with the Blogger API v3
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Blogger API v3][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Blogger API v3][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-blogger</artifactId>
      <version>v3-rev20200801-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-blogger:v3-rev20200801-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-blogger/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/blogger/v1/
