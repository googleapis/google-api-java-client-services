# Firebase App Hosting API Client Library for Java

Firebase App Hosting streamlines the development and deployment of dynamic Next.js and Angular applications, offering built-in framework support, GitHub integration, and integration with other Firebase products. You can use this API to intervene in the Firebase App Hosting build process and add custom functionality not supported in our default Console & CLI flows, including triggering builds from external CI/CD workflows or deploying from pre-built container images. 

This page contains information about getting started with the Firebase App Hosting API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase App Hosting API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase App Hosting API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebaseapphosting</artifactId>
      <version>v1beta-rev20250501-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-firebaseapphosting:v1beta-rev20250501-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebaseapphosting/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebaseapphosting/v1/
