# Admin Reports API Client Library for Java

Fetches reports for the administrators of G Suite customers about the usage, collaboration, security, and risk for their users.

This page contains information about getting started with the Admin Reports API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Admin Reports API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Admin Reports API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-admin-reports</artifactId>
      <version>reports_v1-rev20190521-1.30.3</version>
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
  compile 'com.google.apis:google-api-services-admin-reports:reports_v1-rev20190521-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-admin-reports/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
