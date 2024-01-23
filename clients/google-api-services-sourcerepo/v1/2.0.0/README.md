# Cloud Source Repositories API Client Library for Java

Accesses source code repositories hosted by Google.

This page contains information about getting started with the Cloud Source Repositories API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Source Repositories API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Source Repositories API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-sourcerepo</artifactId>
      <version>v1-rev20240122-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-sourcerepo:v1-rev20240122-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-sourcerepo/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/sourcerepo/v1/
