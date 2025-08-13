# Security Command Center API Client Library for Java

Security Command Center API provides access to temporal views of assets and findings within an organization.

This page contains information about getting started with the Security Command Center API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Security Command Center API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Security Command Center API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-securitycenter</artifactId>
      <version>v1-rev20250808-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-securitycenter:v1-rev20250808-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-securitycenter/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/securitycenter/v1/
