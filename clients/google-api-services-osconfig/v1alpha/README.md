# OS Config API Client Library for Java

OS management tools that can be used for patch management, patch compliance, and configuration management on VM instances.

This page contains information about getting started with the OS Config API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the OS Config API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the OS Config API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-osconfig</artifactId>
      <version>v1alpha-rev20250323-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-osconfig:v1alpha-rev20250323-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-osconfig/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/osconfig/v1/
