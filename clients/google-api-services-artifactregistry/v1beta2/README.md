# Artifact Registry API Client Library for Java

Store and manage build artifacts in a scalable and integrated service built on Google infrastructure.

This page contains information about getting started with the Artifact Registry API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Artifact Registry API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Artifact Registry API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-artifactregistry</artifactId>
      <version>v1beta2-rev20211029-1.32.1</version>
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
  compile 'com.google.apis:google-api-services-artifactregistry:v1beta2-rev20211029-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-artifactregistry/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/artifactregistry/v1/
