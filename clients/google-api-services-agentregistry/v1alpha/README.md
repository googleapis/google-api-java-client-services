# Agent Registry API Client Library for Java

Agent Registry is a centralized, unified catalog that lets you store, discover, and govern Model Context Protocol (MCP) servers, tools, and AI agents within Google Cloud.

This page contains information about getting started with the Agent Registry API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Agent Registry API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Agent Registry API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-agentregistry</artifactId>
      <version>v1alpha-rev20260326-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-agentregistry:v1alpha-rev20260326-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-agentregistry/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/agentregistry/v1/
