# My Business Business Calls API Client Library for Java

The My Business Business Calls API manages business calls information of a location on Google and collect insights like the number of missed calls to their location. Additional information about Business calls can be found at https://support.google.com/business/answer/9688285?p=call_history. If the Google Business Profile links to a Google Ads account and call history is turned on, calls that last longer than a specific time, and that can be attributed to an ad interaction, will show in the linked Google Ads account under the "Calls from Ads" conversion. If smart bidding and call conversions are used in the optimization strategy, there could be a change in ad spend. Learn more about smart bidding. To view and perform actions on a location's calls, you need to be a `OWNER`, `CO_OWNER` or `MANAGER` of the location. Note - If you have a quota of 0 after enabling the API, please request for GBP API access.

This page contains information about getting started with the My Business Business Calls API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the My Business Business Calls API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the My Business Business Calls API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-mybusinessbusinesscalls</artifactId>
      <version>v1-rev20221124-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-mybusinessbusinesscalls:v1-rev20221124-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-mybusinessbusinesscalls/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/mybusinessbusinesscalls/v1/
