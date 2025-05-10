# Real-time Bidding API Client Library for Java

Allows external bidders to manage their RTB integration with Google. This includes managing bidder endpoints, QPS quotas, configuring what ad inventory to receive with pretargeting, submitting creatives for verification, and accessing creative metadata such as approval status.

This page contains information about getting started with the Real-time Bidding API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Real-time Bidding API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Real-time Bidding API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-realtimebidding</artifactId>
      <version>v1-rev20250508-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-realtimebidding:v1-rev20250508-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-realtimebidding/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/realtimebidding/v1/
