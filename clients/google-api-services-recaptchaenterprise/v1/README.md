# reCAPTCHA Enterprise API Client Library for Java

Help protect your website from fraudulent activity, spam, and abuse without creating friction.

This page contains information about getting started with the reCAPTCHA Enterprise API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the reCAPTCHA Enterprise API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the reCAPTCHA Enterprise API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-recaptchaenterprise</artifactId>
      <version>v1-rev20250518-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-recaptchaenterprise:v1-rev20250518-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-recaptchaenterprise/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/recaptchaenterprise/v1/
