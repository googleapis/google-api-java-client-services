# Cloud Key Management Service (KMS) API Client Library for Java

Manages keys and performs cryptographic operations in a central cloud service, for direct use by other cloud resources and applications. 

This page contains information about getting started with the Cloud Key Management Service (KMS) API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud Key Management Service (KMS) API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud Key Management Service (KMS) API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-cloudkms</artifactId>
      <version>v1-rev20250516-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-cloudkms:v1-rev20250516-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-cloudkms/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/cloudkms/v1/
