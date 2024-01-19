# Managed Service for Microsoft Active Directory API Client Library for Java

The Managed Service for Microsoft Active Directory API is used for managing a highly available, hardened service running Microsoft Active Directory (AD).

This page contains information about getting started with the Managed Service for Microsoft Active Directory API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Managed Service for Microsoft Active Directory API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Managed Service for Microsoft Active Directory API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-managedidentities</artifactId>
      <version>v1alpha1-rev20240112-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-managedidentities:v1alpha1-rev20240112-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-managedidentities/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/managedidentities/v1/
