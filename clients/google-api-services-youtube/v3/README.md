# YouTube Data API v3 Client Library for Java

The YouTube Data API v3 is an API that provides access to YouTube data, such as videos, playlists, and channels.

This page contains information about getting started with the YouTube Data API v3
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the YouTube Data API v3][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the YouTube Data API v3][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-youtube</artifactId>
      <version>v3-rev20250422-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-youtube:v3-rev20250422-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-youtube/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/youtube/v1/
