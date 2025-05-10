# Identity Toolkit API Client Library for Java

The Google Identity Toolkit API lets you use open standards to verify a user's identity.

This page contains information about getting started with the Identity Toolkit API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Identity Toolkit API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Identity Toolkit API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-identitytoolkit</artifactId>
      <version>v1-rev20250130-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-identitytoolkit:v1-rev20250130-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-identitytoolkit/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/identitytoolkit/v1/
