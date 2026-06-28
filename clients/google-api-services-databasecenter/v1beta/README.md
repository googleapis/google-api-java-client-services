# Database Center API Client Library for Java

Database Center offers a comprehensive, organization-wide platform for monitoring database fleet health across various products. It simplifies management and reduces risk by automatically aggregating and summarizing key health signals, removing the need for custom dashboards. The platform provides a unified view through its dashboard and API, enabling teams focused on reliability, compliance, security, cost, and administration to quickly identify and address relevant issues within their database fleets. 

This page contains information about getting started with the Database Center API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Database Center API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Database Center API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-databasecenter</artifactId>
      <version>v1beta-rev20260619-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-databasecenter:v1beta-rev20260619-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-databasecenter/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/databasecenter/v1/
