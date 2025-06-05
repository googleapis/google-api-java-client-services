# Notebooks API Client Library for Java

Notebooks API is used to manage notebook resources in Google Cloud.

This page contains information about getting started with the Notebooks API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Notebooks API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Notebooks API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-notebooks</artifactId>
      <version>v2-rev20250528-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-notebooks:v2-rev20250528-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-notebooks/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/notebooks/v1/
