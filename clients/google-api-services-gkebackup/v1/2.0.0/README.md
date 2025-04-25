# Backup for GKE API Client Library for Java

Backup for GKE is a managed Kubernetes workload backup and restore service for GKE clusters.

This page contains information about getting started with the Backup for GKE API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Backup for GKE API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Backup for GKE API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-gkebackup</artifactId>
      <version>v1-rev20250414-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-gkebackup:v1-rev20250414-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-gkebackup/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/gkebackup/v1/
