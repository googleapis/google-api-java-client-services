# Web Fonts Developer API Client Library for Java

The Google Web Fonts Developer API lets you retrieve information about web fonts served by Google.

This page contains information about getting started with the Web Fonts Developer API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Web Fonts Developer API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Web Fonts Developer API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-webfonts</artifactId>
      <version>v1-rev20250917-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-webfonts:v1-rev20250917-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-webfonts/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/webfonts/v1/
