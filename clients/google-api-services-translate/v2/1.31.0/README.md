# Google Cloud Translation API Client Library for Java

The Google Cloud Translation API lets websites and programs integrate with
    Google Translate programmatically.

This page contains information about getting started with the Google Cloud Translation API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Cloud Translation API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Cloud Translation API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-translate</artifactId>
      <version>v2-rev20170525-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-translate:v2-rev20170525-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-translate/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/translate/v1/
