# Storage Transfer API Client Library for Java

Transfers data from external data sources to a Google Cloud Storage bucket or between Google Cloud Storage buckets. 

This page contains information about getting started with the Storage Transfer API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Storage Transfer API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Storage Transfer API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-storagetransfer</artifactId>
      <version>v1-rev20250426-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-storagetransfer:v1-rev20250426-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-storagetransfer/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/storagetransfer/v1/
