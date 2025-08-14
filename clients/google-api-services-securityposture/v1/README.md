# Security Posture API Client Library for Java

Defines, assesses, and monitors the overall status of your security in Google Cloud. You can use security postures to evaluate your current cloud security against defined benchmarks and help maintain the level of security that your organization requires. 

This page contains information about getting started with the Security Posture API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Security Posture API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Security Posture API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-securityposture</artifactId>
      <version>v1-rev20250624-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-securityposture:v1-rev20250624-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-securityposture/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/securityposture/v1/
