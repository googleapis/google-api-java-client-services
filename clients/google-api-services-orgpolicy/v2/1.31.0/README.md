# Organization Policy API Client Library for Java

The Org Policy API allows users to configure governance rules on their GCP resources across the Cloud Resource Hierarchy.

This page contains information about getting started with the Organization Policy API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Organization Policy API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Organization Policy API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-orgpolicy</artifactId>
      <version>v2-rev20220319-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-orgpolicy:v2-rev20220319-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-orgpolicy/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/orgpolicy/v1/
