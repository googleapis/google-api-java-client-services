# Google Keep API Client Library for Java

The Google Keep API is used in an enterprise environment to manage Google Keep content and resolve issues identified by cloud security software.

This page contains information about getting started with the Google Keep API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Keep API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Keep API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-keep</artifactId>
      <version>v1-rev20250318-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-keep:v1-rev20250318-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-keep/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/keep/v1/
