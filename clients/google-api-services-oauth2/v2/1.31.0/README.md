# Google OAuth2 API Client Library for Java

Obtains end-user authorization grants for use with other Google APIs.

This page contains information about getting started with the Google OAuth2 API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google OAuth2 API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google OAuth2 API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-oauth2</artifactId>
      <version>v2-rev20200213-1.32.1</version>
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
  implementation 'com.google.apis:google-api-services-oauth2:v2-rev20200213-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-oauth2/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/oauth2/v1/
