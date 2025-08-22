# Container Analysis API Client Library for Java

This API is a prerequisite for leveraging Artifact Analysis scanning capabilities in Artifact Registry. In addition, the Container Analysis API is an implementation of the Grafeas API, which enables storing, querying, and retrieval of critical metadata about all of your software artifacts.

This page contains information about getting started with the Container Analysis API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Container Analysis API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Container Analysis API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-containeranalysis</artifactId>
      <version>v1-rev20250813-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-containeranalysis:v1-rev20250813-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-containeranalysis/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/containeranalysis/v1/
