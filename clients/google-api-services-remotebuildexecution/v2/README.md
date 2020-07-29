# Remote Build Execution API Client Library for Java

Supplies a Remote Execution API service for tools such as bazel.

This page contains information about getting started with the Remote Build Execution API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Remote Build Execution API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Remote Build Execution API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-remotebuildexecution</artifactId>
      <version>v2-rev20200721-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-remotebuildexecution:v2-rev20200721-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-remotebuildexecution/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/remotebuildexecution/v1/
