# Firebase Data Connect API Client Library for Java

Firebase Data Connect is a relational database service for mobile and web apps that lets you build and scale using a fully-managed PostgreSQL database powered by Cloud SQL. The REST API lets developers manage the connections to their database, change the schema of their database, and query the database.

This page contains information about getting started with the Firebase Data Connect API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase Data Connect API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase Data Connect API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebasedataconnect</artifactId>
      <version>v1beta-rev20250604-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-firebasedataconnect:v1beta-rev20250604-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebasedataconnect/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebasedataconnect/v1/
