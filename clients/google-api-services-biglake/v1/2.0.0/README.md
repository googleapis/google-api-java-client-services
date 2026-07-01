# Lakehouse API Client Library for Java

The Lakehouse API (formerly BigLake API) provides access to a serverless, fully managed, and highly available metastore that provides a single source of truth for your data lakehouse. It lets multiple engines—including Apache Spark, Google Managed Spark, Apache Flink, Trino and BigQuery—share tables and metadata for key open formats (Apache Iceberg, Apache Hive), and query the same copy of data. Plus, through the Lakehouse runtime catalog federation seamlessly unite your lakehouse ecosystem, letting Iceberg compatible engines on Google Cloud (BigQuery, Google Managed Spark) discover and analyze enterprise data across Snowflake, Databricks, and AWS Glue.

This page contains information about getting started with the Lakehouse API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Lakehouse API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Lakehouse API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-biglake</artifactId>
      <version>v1-rev20260625-2.0.0</version>
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
  implementation 'com.google.apis:google-api-services-biglake:v1-rev20260625-2.0.0'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-biglake/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/biglake/v1/
