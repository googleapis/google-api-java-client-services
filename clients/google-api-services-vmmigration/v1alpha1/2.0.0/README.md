# VM Migration API Client Library for Java

Use the Migrate to Virtual Machines API to programmatically migrate workloads. 

This page contains information about getting started with the VM Migration API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the VM Migration API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the VM Migration API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-vmmigration</artifactId>
      <version>v1alpha1-rev20250521-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-vmmigration:v1alpha1-rev20250521-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-vmmigration/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/vmmigration/v1/
