# Domains RDAP API Client Library for Java

Read-only public API that lets users search for information about domain names.

This page contains information about getting started with the Domains RDAP API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Domains RDAP API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Domains RDAP API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-domainsrdap</artifactId>
      <version>v1-rev20200803-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-domainsrdap:v1-rev20200803-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-domainsrdap/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/domainsrdap/v1/
