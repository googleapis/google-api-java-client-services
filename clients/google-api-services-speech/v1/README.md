# Cloud Speech-to-Text API Client Library for Java

Converts audio to text by applying powerful neural network models.

This page contains information about getting started with the Cloud Speech-to-Text API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Speech-to-Text API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Speech-to-Text API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-speech</artifactId>
      <version>v1-rev20200824-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-speech:v1-rev20200824-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-speech/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/speech/v1/
