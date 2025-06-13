# Dialogflow API Client Library for Java

Builds conversational interfaces (for example, chatbots, and voice-powered apps and devices).

This page contains information about getting started with the Dialogflow API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Dialogflow API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Dialogflow API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-dialogflow</artifactId>
      <version>v3-rev20250602-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-dialogflow:v3-rev20250602-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-dialogflow/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/dialogflow/v1/
