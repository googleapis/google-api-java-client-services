# Google Play Game Services Client Library for Java

The Google Play games service allows developers to enhance games with social leaderboards, achievements, game state, sign-in with Google, and more.

This page contains information about getting started with the Google Play Game Services
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Play Game Services][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Play Game Services][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-games</artifactId>
      <version>v1-rev20240416-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-games:v1-rev20240416-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-games/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/games/v1/
