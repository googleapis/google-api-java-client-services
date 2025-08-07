# Merchant API Client Library for Java

Programmatically manage your Merchant Center Accounts.

This page contains information about getting started with the Merchant API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Merchant API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Merchant API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-merchantapi</artifactId>
      <version>ordertracking_v1-rev20250804-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-merchantapi:ordertracking_v1-rev20250804-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-merchantapi/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/merchantapi/v1/
