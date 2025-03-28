# Secret Manager API Client Library for Java

Stores sensitive data such as API keys, passwords, and certificates. Provides convenience while improving security. 

This page contains information about getting started with the Secret Manager API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Secret Manager API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Secret Manager API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-secretmanager</artifactId>
      <version>v1beta2-rev20250324-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-secretmanager:v1beta2-rev20250324-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-secretmanager/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/secretmanager/v1/
