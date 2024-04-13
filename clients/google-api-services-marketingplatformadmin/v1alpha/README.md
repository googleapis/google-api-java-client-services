# Google Marketing Platform Admin API Client Library for Java

The Google Marketing Platform Admin API allows for programmatic access to the Google Marketing Platform configuration data. You can use the Google Marketing Platform Admin API to manage links between your Google Marketing Platform organization and Google Analytics accounts, set the service level of your GA4 properties.

This page contains information about getting started with the Google Marketing Platform Admin API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Marketing Platform Admin API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Marketing Platform Admin API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-marketingplatformadmin</artifactId>
      <version>v1alpha-rev20240410-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-marketingplatformadmin:v1alpha-rev20240410-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-marketingplatformadmin/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/marketingplatformadmin/v1/
