# Apigee API Client Library for Java

The Apigee API lets you programmatically manage Apigee Hybrid with a set of RESTful operations, including:  Create, edit, and delete API proxies  Manage users  Deploy and undeploy proxy revisions  Configure environmentsFor information on using the APIs described in this section, see Get started using the APIs.

This page contains information about getting started with the Apigee API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Apigee API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Apigee API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-apigee</artifactId>
      <version>v1-rev20191115-1.30.3</version>
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
  compile 'com.google.apis:google-api-services-apigee:v1-rev20191115-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-apigee/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/abusiveexperiencereport/v1/
