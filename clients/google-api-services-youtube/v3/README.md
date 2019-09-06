# YouTube Data API Client Library for Java

Supports core YouTube features, such as uploading videos, creating and managing playlists, searching for content, and much more.

This page contains information about getting started with the YouTube Data API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the YouTube Data API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the YouTube Data API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-youtube</artifactId>
      <version>v3-rev20190827-1.30.1</version>
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
  compile 'com.google.apis:google-api-services-youtube:v3-rev20190827-1.30.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-youtube/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
