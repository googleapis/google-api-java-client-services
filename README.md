# Google Java API Client Services

This repository contains the generated source for individual APIs that utilize
[Google APIs Client Library for Java][google-api-java-client].

## Requirements

* [Google APIs Java Client Library for Java][google-api-java-client]
* Java 7 (or higher)
* Android 1.6 (or higher)


You can find the list of available APIs [here][api-list] or you can find the published packages on
[Maven Central][maven-search].

## Supported Google APIs

[//]: # (API_TABLE_START)

[//]: # (API_TABLE_END)

## Generating the API clients

Generating the API clients requires git and Python 3.6.

1. Install gcp-synthtool:

    ```bash
    $ python3 -m pip install gcp-synthtool
    ```

1. Run the generator:

    ```bash
    $ python3 synth.py
    ```

[google-api-java-client]: https://github.com/google/google-api-java-client
[api-list]: https://developers.google.com/api-client-library/java/apis/
[maven-search]: https://search.maven.org/search?q=google-api-services
