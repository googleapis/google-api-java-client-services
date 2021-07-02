# Firebase App Check API Client Library for Java

App Check works alongside other Firebase services to help protect your backend resources from abuse, such as billing fraud or phishing. With App Check, devices running your app will use an app or device attestation provider that attests to one or both of the following: * Requests originate from your authentic app * Requests originate from an authentic, untampered device This attestation is attached to every request your app makes to your Firebase backend resources. The Firebase App Check REST API allows you to manage your App Check configurations programmatically. It also allows you to exchange attestation material for App Check tokens directly without using a Firebase SDK. Finally, it allows you to obtain the public key set necessary to validate an App Check token yourself. [Learn more about App Check](https://firebase.google.com/docs/app-check).

This page contains information about getting started with the Firebase App Check API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Firebase App Check API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Firebase App Check API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-firebaseappcheck</artifactId>
      <version>v1beta-rev20210625-1.32.1</version>
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
  compile 'com.google.apis:google-api-services-firebaseappcheck:v1beta-rev20210625-1.32.1'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-firebaseappcheck/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/firebaseappcheck/v1/
