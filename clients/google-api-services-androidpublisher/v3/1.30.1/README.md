# Google Play Android Developer API Client Library for Java

Lets Android application developers access their Google Play accounts.

This page contains information about getting started with the Google Play Android Developer API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google Play Android Developer API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google Play Android Developer API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-androidpublisher</artifactId>
      <version>v3-rev20201022-1.30.10</version>
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
  compile 'com.google.apis:google-api-services-androidpublisher:v3-rev20201022-1.30.10'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-androidpublisher/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/androidpublisher/v1/
