# Cloud IDS API Client Library for Java

Cloud IDS (Cloud Intrusion Detection System) detects malware, spyware, command-and-control attacks, and other network-based threats. Its security efficacy is industry leading, built with Palo Alto Networks technologies. When you use this product, your organization name and consumption levels will be shared with Palo Alto Networks.

This page contains information about getting started with the Cloud IDS API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Cloud IDS API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Cloud IDS API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-ids</artifactId>
      <version>v1-rev20250320-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-ids:v1-rev20250320-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-ids/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/ids/v1/
