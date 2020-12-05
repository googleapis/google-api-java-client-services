# Cloud Composer API Client Library for Java

Manages Apache Airflow environments on Google Cloud Platform.

This page contains information about getting started with the Cloud Composer API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Composer API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Composer API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-composer</artifactId>
      <version>v1-rev20201202-1.31.0</version>
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
  compile 'com.google.apis:google-api-services-composer:v1-rev20201202-1.31.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-composer/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/composer/v1/
