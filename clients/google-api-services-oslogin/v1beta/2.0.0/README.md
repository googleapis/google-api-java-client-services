# Cloud OS Login API Client Library for Java

You can use OS Login to manage access to your VM instances using IAM roles.

This page contains information about getting started with the Cloud OS Login API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud OS Login API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud OS Login API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-oslogin</artifactId>
      <version>v1beta-rev20250317-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-oslogin:v1beta-rev20250317-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-oslogin/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/oslogin/v1/
