# Google Java API Client Services

This repository contains the generated source for individual APIs that utilize
[Google APIs Client Library for Java][google-api-java-client].  We recommend using the
[Google Auth Library for Java][google-auth-library-java] for handling authentication.

## Requirements

* Java 7 (or higher)
* [Google APIs Java Client Library for Java][google-api-java-client]
  * In order to run your projects in Java 7, you must use version `1.32.1` of google-api-java-client, which only contains
  dependencies compatible with Java 7, by adding
  the following entry to your `dependencyManagement` section:
  ```xml
    <dependency>
      <groupId>com.google.api-client</groupId>
      <artifactId>google-api-client-bom</artifactId>
      <version>1.32.1</version>
    </dependency>
  ```
* Android 1.6 (or higher)

## Supported Google APIs

You can find the list of available APIs below or you can find the published
packages on [Maven Central][maven-search].

[//]: # (API_TABLE_START)

| API | Versions |
| --- | -------- |
| AI Platform Training & Prediction API | [v1](clients/google-api-services-ml/v1) |
| API Discovery Service | [v1](clients/google-api-services-discovery/v1) |
| API Gateway API | [v1](clients/google-api-services-apigateway/v1), [v1beta](clients/google-api-services-apigateway/v1beta) |
| API Keys API | [v2](clients/google-api-services-apikeys/v2) |
| API Management API | [v1alpha](clients/google-api-services-apim/v1alpha) |
| Abusive Experience Report API | [v1](clients/google-api-services-abusiveexperiencereport/v1) |
| Accelerated Mobile Pages (AMP) URL API | [v1](clients/google-api-services-acceleratedmobilepageurl/v1) |
| Access Approval API | [v1](clients/google-api-services-accessapproval/v1) |
| Access Context Manager API | [v1](clients/google-api-services-accesscontextmanager/v1) |
| Ad Exchange Buyer API II | [v2beta1](clients/google-api-services-adexchangebuyer2/v2beta1) |
| Ad Experience Report API | [v1](clients/google-api-services-adexperiencereport/v1) |
| AdMob API | [v1](clients/google-api-services-admob/v1), [v1beta](clients/google-api-services-admob/v1beta) |
| AdSense Management API | [v2](clients/google-api-services-adsense/v2) |
| AdSense Platform API | [v1](clients/google-api-services-adsenseplatform/v1), [v1alpha](clients/google-api-services-adsenseplatform/v1alpha) |
| Address Validation API | [v1](clients/google-api-services-addressvalidation/v1) |
| Admin SDK API | [datatransfer_v1](clients/google-api-services-admin/datatransfer_v1), [directory_v1](clients/google-api-services-admin/directory_v1), [reports_v1](clients/google-api-services-admin/reports_v1) |
| Advisory Notifications API | [v1](clients/google-api-services-advisorynotifications/v1) |
| Air Quality API | [v1](clients/google-api-services-airquality/v1) |
| AlloyDB API | [v1](clients/google-api-services-alloydb/v1), [v1alpha](clients/google-api-services-alloydb/v1alpha), [v1beta](clients/google-api-services-alloydb/v1beta) |
| Analytics Hub API | [v1](clients/google-api-services-analyticshub/v1), [v1beta1](clients/google-api-services-analyticshub/v1beta1) |
| Analytics Reporting API | [v4](clients/google-api-services-analyticsreporting/v4) |
| Android Device Provisioning Partner API | [v1](clients/google-api-services-androiddeviceprovisioning/v1) |
| Android Management API | [v1](clients/google-api-services-androidmanagement/v1) |
| Apigee API | [v1](clients/google-api-services-apigee/v1) |
| Apigee Registry API | [v1](clients/google-api-services-apigeeregistry/v1) |
| App Engine Admin API | [v1](clients/google-api-services-appengine/v1), [v1alpha](clients/google-api-services-appengine/v1alpha), [v1beta](clients/google-api-services-appengine/v1beta) |
| App Hub API | [v1](clients/google-api-services-apphub/v1), [v1alpha](clients/google-api-services-apphub/v1alpha) |
| Application Integration API | [v1](clients/google-api-services-integrations/v1) |
| Apps Script API | [v1](clients/google-api-services-script/v1) |
| Area120 Tables API | [v1alpha1](clients/google-api-services-area120tables/v1alpha1) |
| Artifact Registry API | [v1](clients/google-api-services-artifactregistry/v1), [v1beta1](clients/google-api-services-artifactregistry/v1beta1), [v1beta2](clients/google-api-services-artifactregistry/v1beta2) |
| Assured Workloads API | [v1](clients/google-api-services-assuredworkloads/v1), [v1beta1](clients/google-api-services-assuredworkloads/v1beta1) |
| Authorized Buyers Marketplace API | [v1](clients/google-api-services-authorizedbuyersmarketplace/v1), [v1alpha](clients/google-api-services-authorizedbuyersmarketplace/v1alpha) |
| Backup and DR Service API | [v1](clients/google-api-services-backupdr/v1) |
| Backup for GKE API | [v1](clients/google-api-services-gkebackup/v1) |
| Bare Metal Solution API | [v2](clients/google-api-services-baremetalsolution/v2) |
| Batch API | [v1](clients/google-api-services-batch/v1) |
| BeyondCorp API | [v1](clients/google-api-services-beyondcorp/v1), [v1alpha](clients/google-api-services-beyondcorp/v1alpha) |
| BigLake API | [v1](clients/google-api-services-biglake/v1) |
| BigQuery API | [v2](clients/google-api-services-bigquery/v2) |
| BigQuery Connection API | [v1](clients/google-api-services-bigqueryconnection/v1), [v1beta1](clients/google-api-services-bigqueryconnection/v1beta1) |
| BigQuery Data Policy API | [v1](clients/google-api-services-bigquerydatapolicy/v1) |
| BigQuery Data Transfer API | [v1](clients/google-api-services-bigquerydatatransfer/v1) |
| BigQuery Reservation API | [v1](clients/google-api-services-bigqueryreservation/v1) |
| Binary Authorization API | [v1](clients/google-api-services-binaryauthorization/v1), [v1beta1](clients/google-api-services-binaryauthorization/v1beta1) |
| Blockchain Node Engine API | [v1](clients/google-api-services-blockchainnodeengine/v1) |
| Blogger API | [v2](clients/google-api-services-blogger/v2), [v3](clients/google-api-services-blogger/v3) |
| Books API | [v1](clients/google-api-services-books/v1) |
| Business Profile Performance API | [v1](clients/google-api-services-businessprofileperformance/v1) |
| CSS API | [v1](clients/google-api-services-css/v1) |
| Calendar API | [v3](clients/google-api-services-calendar/v3) |
| Campaign Manager 360 API | [v3.5](clients/google-api-services-dfareporting/v3.5), [v4](clients/google-api-services-dfareporting/v4) |
| Certificate Authority API | [v1](clients/google-api-services-privateca/v1), [v1beta1](clients/google-api-services-privateca/v1beta1) |
| Certificate Manager API | [v1](clients/google-api-services-certificatemanager/v1) |
| Checks API | [v1alpha](clients/google-api-services-checks/v1alpha) |
| Chrome Management API | [v1](clients/google-api-services-chromemanagement/v1) |
| Chrome Policy API | [v1](clients/google-api-services-chromepolicy/v1) |
| Chrome UX Report API | [v1](clients/google-api-services-chromeuxreport/v1) |
| Chrome Verified Access API | [v1](clients/google-api-services-verifiedaccess/v1), [v2](clients/google-api-services-verifiedaccess/v2) |
| Cloud Asset API | [v1](clients/google-api-services-cloudasset/v1), [v1beta1](clients/google-api-services-cloudasset/v1beta1), [v1p1beta1](clients/google-api-services-cloudasset/v1p1beta1), [v1p5beta1](clients/google-api-services-cloudasset/v1p5beta1), [v1p7beta1](clients/google-api-services-cloudasset/v1p7beta1) |
| Cloud Bigtable Admin API | [v2](clients/google-api-services-bigtableadmin/v2) |
| Cloud Billing API | [v1](clients/google-api-services-cloudbilling/v1), [v1beta](clients/google-api-services-cloudbilling/v1beta) |
| Cloud Billing Budget API | [v1](clients/google-api-services-billingbudgets/v1), [v1beta1](clients/google-api-services-billingbudgets/v1beta1) |
| Cloud Build API | [v1](clients/google-api-services-cloudbuild/v1), [v2](clients/google-api-services-cloudbuild/v2) |
| Cloud Channel API | [v1](clients/google-api-services-cloudchannel/v1) |
| Cloud Composer API | [v1](clients/google-api-services-composer/v1), [v1beta1](clients/google-api-services-composer/v1beta1) |
| Cloud Controls Partner API | [v1](clients/google-api-services-cloudcontrolspartner/v1), [v1beta](clients/google-api-services-cloudcontrolspartner/v1beta) |
| Cloud DNS API | [v1](clients/google-api-services-dns/v1), [v1beta2](clients/google-api-services-dns/v1beta2) |
| Cloud Data Fusion API | [v1](clients/google-api-services-datafusion/v1), [v1beta1](clients/google-api-services-datafusion/v1beta1) |
| Cloud Dataplex API | [v1](clients/google-api-services-dataplex/v1) |
| Cloud Dataproc API | [v1](clients/google-api-services-dataproc/v1) |
| Cloud Datastore API | [v1](clients/google-api-services-datastore/v1), [v1beta1](clients/google-api-services-datastore/v1beta1), [v1beta3](clients/google-api-services-datastore/v1beta3) |
| Cloud Deploy API | [v1](clients/google-api-services-clouddeploy/v1) |
| Cloud Deployment Manager V2 API | [alpha](clients/google-api-services-deploymentmanager/alpha), [v2](clients/google-api-services-deploymentmanager/v2), [v2beta](clients/google-api-services-deploymentmanager/v2beta) |
| Cloud Document AI API | [v1](clients/google-api-services-documentai/v1), [v1beta3](clients/google-api-services-documentai/v1beta3) |
| Cloud Domains API | [v1](clients/google-api-services-domains/v1), [v1alpha2](clients/google-api-services-domains/v1alpha2), [v1beta1](clients/google-api-services-domains/v1beta1) |
| Cloud Filestore API | [v1](clients/google-api-services-file/v1), [v1beta1](clients/google-api-services-file/v1beta1) |
| Cloud Firestore API | [v1](clients/google-api-services-firestore/v1), [v1beta1](clients/google-api-services-firestore/v1beta1), [v1beta2](clients/google-api-services-firestore/v1beta2) |
| Cloud Functions API | [v1](clients/google-api-services-cloudfunctions/v1), [v2](clients/google-api-services-cloudfunctions/v2), [v2alpha](clients/google-api-services-cloudfunctions/v2alpha), [v2beta](clients/google-api-services-cloudfunctions/v2beta) |
| Cloud Healthcare API | [v1](clients/google-api-services-healthcare/v1), [v1beta1](clients/google-api-services-healthcare/v1beta1) |
| Cloud IDS API | [v1](clients/google-api-services-ids/v1) |
| Cloud Identity API | [v1](clients/google-api-services-cloudidentity/v1), [v1beta1](clients/google-api-services-cloudidentity/v1beta1) |
| Cloud Identity-Aware Proxy API | [v1](clients/google-api-services-iap/v1), [v1beta1](clients/google-api-services-iap/v1beta1) |
| Cloud Key Management Service (KMS) API | [v1](clients/google-api-services-cloudkms/v1) |
| Cloud Life Sciences API | [v2beta](clients/google-api-services-lifesciences/v2beta) |
| Cloud Logging API | [v2](clients/google-api-services-logging/v2) |
| Cloud Memorystore for Memcached API | [v1](clients/google-api-services-memcache/v1), [v1beta2](clients/google-api-services-memcache/v1beta2) |
| Cloud Monitoring API | [v1](clients/google-api-services-monitoring/v1), [v3](clients/google-api-services-monitoring/v3) |
| Cloud Natural Language API | [v1](clients/google-api-services-language/v1), [v1beta2](clients/google-api-services-language/v1beta2), [v2](clients/google-api-services-language/v2) |
| Cloud OS Login API | [v1](clients/google-api-services-oslogin/v1), [v1alpha](clients/google-api-services-oslogin/v1alpha), [v1beta](clients/google-api-services-oslogin/v1beta) |
| Cloud Profiler API | [v2](clients/google-api-services-cloudprofiler/v2) |
| Cloud Pub/Sub API | [v1](clients/google-api-services-pubsub/v1), [v1beta1a](clients/google-api-services-pubsub/v1beta1a), [v1beta2](clients/google-api-services-pubsub/v1beta2) |
| Cloud Resource Manager API | [v1](clients/google-api-services-cloudresourcemanager/v1), [v1beta1](clients/google-api-services-cloudresourcemanager/v1beta1), [v2](clients/google-api-services-cloudresourcemanager/v2), [v2beta1](clients/google-api-services-cloudresourcemanager/v2beta1), [v3](clients/google-api-services-cloudresourcemanager/v3) |
| Cloud Run Admin API | [v1](clients/google-api-services-run/v1), [v2](clients/google-api-services-run/v2) |
| Cloud Runtime Configuration API | [v1](clients/google-api-services-runtimeconfig/v1), [v1beta1](clients/google-api-services-runtimeconfig/v1beta1) |
| Cloud SQL Admin API | [v1](clients/google-api-services-sqladmin/v1), [v1beta4](clients/google-api-services-sqladmin/v1beta4) |
| Cloud Scheduler API | [v1](clients/google-api-services-cloudscheduler/v1), [v1beta1](clients/google-api-services-cloudscheduler/v1beta1) |
| Cloud Search API | [v1](clients/google-api-services-cloudsearch/v1) |
| Cloud Shell API | [v1](clients/google-api-services-cloudshell/v1) |
| Cloud Spanner API | [v1](clients/google-api-services-spanner/v1) |
| Cloud Speech-to-Text API | [v1](clients/google-api-services-speech/v1), [v1p1beta1](clients/google-api-services-speech/v1p1beta1) |
| Cloud Storage JSON API | [v1](clients/google-api-services-storage/v1) |
| Cloud Storage for Firebase API | [v1beta](clients/google-api-services-firebasestorage/v1beta) |
| Cloud TPU API | [v1](clients/google-api-services-tpu/v1), [v1alpha1](clients/google-api-services-tpu/v1alpha1), [v2](clients/google-api-services-tpu/v2), [v2alpha1](clients/google-api-services-tpu/v2alpha1) |
| Cloud Talent Solution API | [v3](clients/google-api-services-jobs/v3), [v3p1beta1](clients/google-api-services-jobs/v3p1beta1), [v4](clients/google-api-services-jobs/v4) |
| Cloud Tasks API | [v2](clients/google-api-services-cloudtasks/v2), [v2beta2](clients/google-api-services-cloudtasks/v2beta2), [v2beta3](clients/google-api-services-cloudtasks/v2beta3) |
| Cloud Testing API | [v1](clients/google-api-services-testing/v1) |
| Cloud Text-to-Speech API | [v1](clients/google-api-services-texttospeech/v1), [v1beta1](clients/google-api-services-texttospeech/v1beta1) |
| Cloud Tool Results API | [v1beta3](clients/google-api-services-toolresults/v1beta3) |
| Cloud Trace API | [v1](clients/google-api-services-cloudtrace/v1), [v2](clients/google-api-services-cloudtrace/v2), [v2beta1](clients/google-api-services-cloudtrace/v2beta1) |
| Cloud Translation API | [v3](clients/google-api-services-translate/v3), [v3beta1](clients/google-api-services-translate/v3beta1) |
| Cloud Video Intelligence API | [v1](clients/google-api-services-videointelligence/v1), [v1beta2](clients/google-api-services-videointelligence/v1beta2), [v1p1beta1](clients/google-api-services-videointelligence/v1p1beta1), [v1p2beta1](clients/google-api-services-videointelligence/v1p2beta1), [v1p3beta1](clients/google-api-services-videointelligence/v1p3beta1) |
| Cloud Vision API | [v1](clients/google-api-services-vision/v1), [v1p1beta1](clients/google-api-services-vision/v1p1beta1), [v1p2beta1](clients/google-api-services-vision/v1p2beta1) |
| Cloud Workstations API | [v1](clients/google-api-services-workstations/v1), [v1beta](clients/google-api-services-workstations/v1beta) |
| Compute Engine API | [alpha](clients/google-api-services-compute/alpha), [beta](clients/google-api-services-compute/beta), [v1](clients/google-api-services-compute/v1) |
| Connectors API | [v1](clients/google-api-services-connectors/v1), [v2](clients/google-api-services-connectors/v2) |
| Contact Center AI Insights API | [v1](clients/google-api-services-contactcenterinsights/v1) |
| Contact Center AI Platform API | [v1alpha1](clients/google-api-services-contactcenteraiplatform/v1alpha1) |
| Container Analysis API | [v1](clients/google-api-services-containeranalysis/v1), [v1alpha1](clients/google-api-services-containeranalysis/v1alpha1), [v1beta1](clients/google-api-services-containeranalysis/v1beta1) |
| Content API for Shopping | [v2.1](clients/google-api-services-content/v2.1) |
| Custom Search API | [v1](clients/google-api-services-customsearch/v1) |
| Data Labeling API | [v1beta1](clients/google-api-services-datalabeling/v1beta1) |
| Data Lineage API | [v1](clients/google-api-services-datalineage/v1) |
| Data Portability API | [v1](clients/google-api-services-dataportability/v1), [v1beta](clients/google-api-services-dataportability/v1beta) |
| Data pipelines API | [v1](clients/google-api-services-datapipelines/v1) |
| Database Migration API | [v1](clients/google-api-services-datamigration/v1), [v1beta1](clients/google-api-services-datamigration/v1beta1) |
| Dataflow API | [v1b3](clients/google-api-services-dataflow/v1b3) |
| Dataform API | [v1beta1](clients/google-api-services-dataform/v1beta1) |
| Dataproc Metastore API | [v1](clients/google-api-services-metastore/v1), [v1alpha](clients/google-api-services-metastore/v1alpha), [v1beta](clients/google-api-services-metastore/v1beta), [v2](clients/google-api-services-metastore/v2), [v2alpha](clients/google-api-services-metastore/v2alpha), [v2beta](clients/google-api-services-metastore/v2beta) |
| Datastream API | [v1](clients/google-api-services-datastream/v1), [v1alpha1](clients/google-api-services-datastream/v1alpha1) |
| Developer Connect API | [v1](clients/google-api-services-developerconnect/v1) |
| Dialogflow API | [v2](clients/google-api-services-dialogflow/v2), [v2beta1](clients/google-api-services-dialogflow/v2beta1), [v3](clients/google-api-services-dialogflow/v3), [v3beta1](clients/google-api-services-dialogflow/v3beta1) |
| Digital Asset Links API | [v1](clients/google-api-services-digitalassetlinks/v1) |
| Discovery Engine API | [v1](clients/google-api-services-discoveryengine/v1), [v1alpha](clients/google-api-services-discoveryengine/v1alpha), [v1beta](clients/google-api-services-discoveryengine/v1beta) |
| Display & Video 360 API | [v2](clients/google-api-services-displayvideo/v2), [v3](clients/google-api-services-displayvideo/v3), [v4](clients/google-api-services-displayvideo/v4) |
| Document AI Warehouse API | [v1](clients/google-api-services-contentwarehouse/v1) |
| DoubleClick Bid Manager API | [v2](clients/google-api-services-doubleclickbidmanager/v2) |
| Drive Activity API | [v2](clients/google-api-services-driveactivity/v2) |
| Drive Labels API | [v2](clients/google-api-services-drivelabels/v2), [v2beta](clients/google-api-services-drivelabels/v2beta) |
| Enterprise License Manager API | [v1](clients/google-api-services-licensing/v1) |
| Error Reporting API | [v1beta1](clients/google-api-services-clouderrorreporting/v1beta1) |
| Essential Contacts API | [v1](clients/google-api-services-essentialcontacts/v1) |
| Eventarc API | [v1](clients/google-api-services-eventarc/v1) |
| Fact Check Tools API | [v1alpha1](clients/google-api-services-factchecktools/v1alpha1) |
| Firebase App Check API | [v1](clients/google-api-services-firebaseappcheck/v1), [v1beta](clients/google-api-services-firebaseappcheck/v1beta) |
| Firebase App Distribution API | [v1](clients/google-api-services-firebaseappdistribution/v1), [v1alpha](clients/google-api-services-firebaseappdistribution/v1alpha) |
| Firebase Cloud Messaging API | [v1](clients/google-api-services-fcm/v1) |
| Firebase Cloud Messaging Data API | [v1beta1](clients/google-api-services-fcmdata/v1beta1) |
| Firebase Data Connect API | [v1beta](clients/google-api-services-firebasedataconnect/v1beta) |
| Firebase Dynamic Links API | [v1](clients/google-api-services-firebasedynamiclinks/v1) |
| Firebase Hosting API | [v1](clients/google-api-services-firebasehosting/v1), [v1beta1](clients/google-api-services-firebasehosting/v1beta1) |
| Firebase ML API | [v1](clients/google-api-services-firebaseml/v1), [v1beta2](clients/google-api-services-firebaseml/v1beta2), [v2beta](clients/google-api-services-firebaseml/v2beta) |
| Firebase Management API | [v1beta1](clients/google-api-services-firebase/v1beta1) |
| Firebase Realtime Database Management API | [v1beta](clients/google-api-services-firebasedatabase/v1beta) |
| Firebase Rules API | [v1](clients/google-api-services-firebaserules/v1) |
| Fitness API | [v1](clients/google-api-services-fitness/v1) |
| GDC Virtual API | [v1](clients/google-api-services-gkeonprem/v1) |
| GKE Hub API | [v1](clients/google-api-services-gkehub/v1), [v1alpha](clients/google-api-services-gkehub/v1alpha), [v1beta](clients/google-api-services-gkehub/v1beta), [v1beta1](clients/google-api-services-gkehub/v1beta1), [v2](clients/google-api-services-gkehub/v2), [v2alpha](clients/google-api-services-gkehub/v2alpha), [v2beta](clients/google-api-services-gkehub/v2beta) |
| Gmail API | [v1](clients/google-api-services-gmail/v1) |
| Gmail Postmaster Tools API | [v1](clients/google-api-services-gmailpostmastertools/v1), [v1beta1](clients/google-api-services-gmailpostmastertools/v1beta1) |
| Google Analytics API | [v3](clients/google-api-services-analytics/v3) |
| Google Analytics Admin API | [v1alpha](clients/google-api-services-analyticsadmin/v1alpha), [v1beta](clients/google-api-services-analyticsadmin/v1beta) |
| Google Analytics Data API | [v1beta](clients/google-api-services-analyticsdata/v1beta) |
| Google Chat API | [v1](clients/google-api-services-chat/v1) |
| Google Civic Information API | [v2](clients/google-api-services-civicinfo/v2) |
| Google Classroom API | [v1](clients/google-api-services-classroom/v1) |
| Google Cloud Data Catalog API | [v1](clients/google-api-services-datacatalog/v1), [v1beta1](clients/google-api-services-datacatalog/v1beta1) |
| Google Cloud Memorystore for Redis API | [v1](clients/google-api-services-redis/v1), [v1beta1](clients/google-api-services-redis/v1beta1) |
| Google Cloud Support API | [v2](clients/google-api-services-cloudsupport/v2), [v2beta](clients/google-api-services-cloudsupport/v2beta) |
| Google Cloud Translation API | [v2](clients/google-api-services-translate/v2) |
| Google Docs API | [v1](clients/google-api-services-docs/v1) |
| Google Drive API | [v2](clients/google-api-services-drive/v2), [v3](clients/google-api-services-drive/v3) |
| Google Forms API | [v1](clients/google-api-services-forms/v1) |
| Google Identity Toolkit API | [v3](clients/google-api-services-identitytoolkit/v3) |
| Google Keep API | [v1](clients/google-api-services-keep/v1) |
| Google Marketing Platform Admin API | [v1alpha](clients/google-api-services-marketingplatformadmin/v1alpha) |
| Google Meet API | [v2](clients/google-api-services-meet/v2) |
| Google OAuth2 API | [v2](clients/google-api-services-oauth2/v2) |
| Google Play Android Developer API | [v3](clients/google-api-services-androidpublisher/v3) |
| Google Play Custom App Publishing API | [v1](clients/google-api-services-playcustomapp/v1) |
| Google Play Developer Reporting API | [v1alpha1](clients/google-api-services-playdeveloperreporting/v1alpha1), [v1beta1](clients/google-api-services-playdeveloperreporting/v1beta1) |
| Google Play EMM API | [v1](clients/google-api-services-androidenterprise/v1) |
| Google Play Game Management | [v1management](clients/google-api-services-gamesManagement/v1management) |
| Google Play Game Services | [v1](clients/google-api-services-games/v1) |
| Google Play Game Services Publishing API | [v1configuration](clients/google-api-services-gamesConfiguration/v1configuration) |
| Google Play Grouping API | [v1alpha1](clients/google-api-services-playgrouping/v1alpha1) |
| Google Play Integrity API | [v1](clients/google-api-services-playintegrity/v1) |
| Google Search Console API | [v1](clients/google-api-services-searchconsole/v1) |
| Google Sheets API | [v4](clients/google-api-services-sheets/v4) |
| Google Site Verification API | [v1](clients/google-api-services-siteVerification/v1) |
| Google Slides API | [v1](clients/google-api-services-slides/v1) |
| Google Tasks API | [v1](clients/google-api-services-tasks/v1) |
| Google Vault API | [v1](clients/google-api-services-vault/v1) |
| Google Wallet API | [v1](clients/google-api-services-walletobjects/v1) |
| Google Workspace Alert Center API | [v1beta1](clients/google-api-services-alertcenter/v1beta1) |
| Google Workspace Events API | [v1](clients/google-api-services-workspaceevents/v1) |
| Google Workspace Reseller API | [v1](clients/google-api-services-reseller/v1) |
| Groups Migration API | [v1](clients/google-api-services-groupsmigration/v1) |
| Groups Settings API | [v1](clients/google-api-services-groupssettings/v1) |
| HomeGraph API | [v1](clients/google-api-services-homegraph/v1) |
| IAM Service Account Credentials API | [v1](clients/google-api-services-iamcredentials/v1) |
| Identity Toolkit API | [v1](clients/google-api-services-identitytoolkit/v1), [v2](clients/google-api-services-identitytoolkit/v2) |
| Identity and Access Management (IAM) API | [v1](clients/google-api-services-iam/v1), [v2](clients/google-api-services-iam/v2), [v2beta](clients/google-api-services-iam/v2beta) |
| Infrastructure Manager API | [v1](clients/google-api-services-config/v1) |
| KMS Inventory API | [v1](clients/google-api-services-kmsinventory/v1) |
| Knowledge Graph Search API | [v1](clients/google-api-services-kgsearch/v1) |
| Kubernetes Engine API | [v1](clients/google-api-services-container/v1), [v1beta1](clients/google-api-services-container/v1beta1) |
| Library Agent API | [v1](clients/google-api-services-libraryagent/v1) |
| Local Services API | [v1](clients/google-api-services-localservices/v1) |
| Looker (Google Cloud core) API | [v1](clients/google-api-services-looker/v1) |
| Managed Service for Microsoft Active Directory API | [v1](clients/google-api-services-managedidentities/v1), [v1alpha1](clients/google-api-services-managedidentities/v1alpha1), [v1beta1](clients/google-api-services-managedidentities/v1beta1) |
| Manufacturer Center API | [v1](clients/google-api-services-manufacturers/v1) |
| Merchant API | [accounts_v1beta](clients/google-api-services-merchantapi/accounts_v1beta), [conversions_v1beta](clients/google-api-services-merchantapi/conversions_v1beta), [datasources_v1beta](clients/google-api-services-merchantapi/datasources_v1beta), [inventories_v1beta](clients/google-api-services-merchantapi/inventories_v1beta), [lfp_v1beta](clients/google-api-services-merchantapi/lfp_v1beta), [notifications_v1beta](clients/google-api-services-merchantapi/notifications_v1beta), [products_v1beta](clients/google-api-services-merchantapi/products_v1beta), [promotions_v1beta](clients/google-api-services-merchantapi/promotions_v1beta), [quota_v1beta](clients/google-api-services-merchantapi/quota_v1beta), [reports_v1beta](clients/google-api-services-merchantapi/reports_v1beta), [reviews_v1beta](clients/google-api-services-merchantapi/reviews_v1beta) |
| Migration Center API | [v1](clients/google-api-services-migrationcenter/v1), [v1alpha1](clients/google-api-services-migrationcenter/v1alpha1) |
| My Business Account Management API | [v1](clients/google-api-services-mybusinessaccountmanagement/v1) |
| My Business Business Information API | [v1](clients/google-api-services-mybusinessbusinessinformation/v1) |
| My Business Lodging API | [v1](clients/google-api-services-mybusinesslodging/v1) |
| My Business Notifications API | [v1](clients/google-api-services-mybusinessnotifications/v1) |
| My Business Place Actions API | [v1](clients/google-api-services-mybusinessplaceactions/v1) |
| My Business Q&A API | [v1](clients/google-api-services-mybusinessqanda/v1) |
| My Business Verifications API | [v1](clients/google-api-services-mybusinessverifications/v1) |
| NetApp API | [v1](clients/google-api-services-netapp/v1), [v1beta1](clients/google-api-services-netapp/v1beta1) |
| Network Connectivity API | [v1](clients/google-api-services-networkconnectivity/v1), [v1alpha1](clients/google-api-services-networkconnectivity/v1alpha1) |
| Network Management API | [v1](clients/google-api-services-networkmanagement/v1), [v1beta1](clients/google-api-services-networkmanagement/v1beta1) |
| Network Security API | [v1](clients/google-api-services-networksecurity/v1), [v1beta1](clients/google-api-services-networksecurity/v1beta1) |
| Network Services API | [v1](clients/google-api-services-networkservices/v1), [v1beta1](clients/google-api-services-networkservices/v1beta1) |
| Notebooks API | [v1](clients/google-api-services-notebooks/v1), [v2](clients/google-api-services-notebooks/v2) |
| OS Config API | [v1](clients/google-api-services-osconfig/v1), [v1alpha](clients/google-api-services-osconfig/v1alpha), [v1beta](clients/google-api-services-osconfig/v1beta), [v2beta](clients/google-api-services-osconfig/v2beta) |
| On-Demand Scanning API | [v1](clients/google-api-services-ondemandscanning/v1), [v1beta1](clients/google-api-services-ondemandscanning/v1beta1) |
| Oracle Database@Google Cloud API | [v1](clients/google-api-services-oracledatabase/v1) |
| Organization Policy API | [v2](clients/google-api-services-orgpolicy/v2) |
| PageSpeed Insights API | [v5](clients/google-api-services-pagespeedonline/v5) |
| Parallelstore API | [v1](clients/google-api-services-parallelstore/v1), [v1beta](clients/google-api-services-parallelstore/v1beta) |
| Payments Reseller Subscription API | [v1](clients/google-api-services-paymentsresellersubscription/v1) |
| People API | [v1](clients/google-api-services-people/v1) |
| Places API (New) | [v1](clients/google-api-services-places/v1) |
| Places Insights API | [v1](clients/google-api-services-areainsights/v1) |
| Policy Analyzer API | [v1](clients/google-api-services-policyanalyzer/v1), [v1beta1](clients/google-api-services-policyanalyzer/v1beta1) |
| Policy Simulator API | [v1](clients/google-api-services-policysimulator/v1), [v1alpha](clients/google-api-services-policysimulator/v1alpha), [v1beta](clients/google-api-services-policysimulator/v1beta) |
| Policy Troubleshooter API | [v1](clients/google-api-services-policytroubleshooter/v1), [v1beta](clients/google-api-services-policytroubleshooter/v1beta) |
| Pollen API | [v1](clients/google-api-services-pollen/v1) |
| Pub/Sub Lite API | [v1](clients/google-api-services-pubsublite/v1) |
| Public Certificate Authority API | [v1](clients/google-api-services-publicca/v1), [v1alpha1](clients/google-api-services-publicca/v1alpha1), [v1beta1](clients/google-api-services-publicca/v1beta1) |
| Rapid Migration Assessment API | [v1](clients/google-api-services-rapidmigrationassessment/v1) |
| Reader Revenue Subscription Linking API | [v1](clients/google-api-services-readerrevenuesubscriptionlinking/v1) |
| Real-time Bidding API | [v1](clients/google-api-services-realtimebidding/v1) |
| Recommendations AI (Beta) | [v1beta1](clients/google-api-services-recommendationengine/v1beta1) |
| Recommender API | [v1](clients/google-api-services-recommender/v1), [v1beta1](clients/google-api-services-recommender/v1beta1) |
| SAS Portal API | [v1alpha1](clients/google-api-services-sasportal/v1alpha1) |
| SAS Portal API (Testing) | [v1alpha1](clients/google-api-services-prod_tt_sasportal/v1alpha1) |
| Safe Browsing API | [v4](clients/google-api-services-safebrowsing/v4), [v5](clients/google-api-services-safebrowsing/v5) |
| Search Ads 360 API | [v2](clients/google-api-services-doubleclicksearch/v2) |
| Search Ads 360 Reporting API | [v0](clients/google-api-services-searchads360/v0) |
| Secret Manager API | [v1](clients/google-api-services-secretmanager/v1), [v1beta1](clients/google-api-services-secretmanager/v1beta1), [v1beta2](clients/google-api-services-secretmanager/v1beta2) |
| Security Command Center API | [v1](clients/google-api-services-securitycenter/v1), [v1beta1](clients/google-api-services-securitycenter/v1beta1), [v1beta2](clients/google-api-services-securitycenter/v1beta2) |
| Security Posture API | [v1](clients/google-api-services-securityposture/v1) |
| Security Token Service API | [v1](clients/google-api-services-sts/v1), [v1beta](clients/google-api-services-sts/v1beta) |
| Sensitive Data Protection (DLP) | [v2](clients/google-api-services-dlp/v2) |
| Serverless VPC Access API | [v1](clients/google-api-services-vpcaccess/v1), [v1beta1](clients/google-api-services-vpcaccess/v1beta1) |
| Service Consumer Management API | [v1](clients/google-api-services-serviceconsumermanagement/v1), [v1beta1](clients/google-api-services-serviceconsumermanagement/v1beta1) |
| Service Control API | [v1](clients/google-api-services-servicecontrol/v1), [v2](clients/google-api-services-servicecontrol/v2) |
| Service Directory API | [v1](clients/google-api-services-servicedirectory/v1), [v1beta1](clients/google-api-services-servicedirectory/v1beta1) |
| Service Management API | [v1](clients/google-api-services-servicemanagement/v1) |
| Service Networking API | [v1](clients/google-api-services-servicenetworking/v1), [v1beta](clients/google-api-services-servicenetworking/v1beta) |
| Service Usage API | [v1](clients/google-api-services-serviceusage/v1), [v1beta1](clients/google-api-services-serviceusage/v1beta1) |
| Smart Device Management API | [v1](clients/google-api-services-smartdevicemanagement/v1) |
| Solar API | [v1](clients/google-api-services-solar/v1) |
| Storage Transfer API | [v1](clients/google-api-services-storagetransfer/v1) |
| Street View Publish API | [v1](clients/google-api-services-streetviewpublish/v1) |
| Tag Manager API | [v1](clients/google-api-services-tagmanager/v1), [v2](clients/google-api-services-tagmanager/v2) |
| Traffic Director API | [v2](clients/google-api-services-trafficdirector/v2), [v3](clients/google-api-services-trafficdirector/v3) |
| Transcoder API | [v1](clients/google-api-services-transcoder/v1) |
| Travel Impact Model API | [v1](clients/google-api-services-travelimpactmodel/v1) |
| VM Migration API | [v1](clients/google-api-services-vmmigration/v1), [v1alpha1](clients/google-api-services-vmmigration/v1alpha1) |
| VMware Engine API | [v1](clients/google-api-services-vmwareengine/v1) |
| Vertex AI API | [v1](clients/google-api-services-aiplatform/v1), [v1beta1](clients/google-api-services-aiplatform/v1beta1) |
| Vertex AI Search for commerce API | [v2](clients/google-api-services-retail/v2), [v2alpha](clients/google-api-services-retail/v2alpha), [v2beta](clients/google-api-services-retail/v2beta) |
| Web Fonts Developer API | [v1](clients/google-api-services-webfonts/v1) |
| Web Risk API | [v1](clients/google-api-services-webrisk/v1) |
| Web Search Indexing API | [v3](clients/google-api-services-indexing/v3) |
| Web Security Scanner API | [v1](clients/google-api-services-websecurityscanner/v1), [v1alpha](clients/google-api-services-websecurityscanner/v1alpha), [v1beta](clients/google-api-services-websecurityscanner/v1beta) |
| Workflow Executions API | [v1](clients/google-api-services-workflowexecutions/v1), [v1beta](clients/google-api-services-workflowexecutions/v1beta) |
| Workflows API | [v1](clients/google-api-services-workflows/v1), [v1beta](clients/google-api-services-workflows/v1beta) |
| Workload Manager API | [v1](clients/google-api-services-workloadmanager/v1) |
| YouTube Analytics API | [v2](clients/google-api-services-youtubeAnalytics/v2) |
| YouTube Data API v3 | [v3](clients/google-api-services-youtube/v3) |
| YouTube Reporting API | [v1](clients/google-api-services-youtubereporting/v1) |
| reCAPTCHA Enterprise API | [v1](clients/google-api-services-recaptchaenterprise/v1) |
| versionhistory.googleapis.com API | [v1](clients/google-api-services-versionhistory/v1) |

[//]: # (API_TABLE_END)

## Authentication

google-api-java recommends using the [google-auth-library-java][google-auth-library-java]
library to authenticate HTTPS requests. google-auth-library-java supports a wide range of authentication types;
see the [project's README](https://github.com/googleapis/google-auth-library-java#using-credentials-with-google-http-client)
for how to use credentials with google-http-client and
[javadoc](https://cloud.google.com/java/docs/reference/google-auth-library/latest/overview) for more details.

## How the code is updated and published

See [document](http://go/java-apiary-clients).

## Generating the API clients locally

If you want to generate certain code locally for troubleshooting purpose, please follow these steps:

Generating the API clients requires git and Python 3.6.

1. Install the generator dependencies:

    ```bash
    cd /path/to/google-api-java-client-services/generator
    python -m pip install -r generator_requirements.in
    ```

1. Run the generator:

    This is an example for Admin Directory v1. Note that `2.0.0` corresponds to the
    latest variant of the generator. Make sure your `discovery-artifact-manager`
    [repo](https://github.com/googleapis/discovery-artifact-manager/blob/master/discoveries/admin.directory_v1.json)
    is up to date. Output doesn't have to be the exact location of the old
    library.

    ```bash
    python /path/to/google-api-java-client-services/generator/src/googleapis/codegen \
        --input=/path/to/discovery-artifact-manager/discoveries/admin.directory_v1.json \
        --output_dir=/path/to/google-api-java-client-services/clients/google-api-services-admin/directory_v1/2.0.0 \
        --language=java \
        --language_variant=2.0.0 \
        --package_path=api/services
    ```


[google-api-java-client]: https://github.com/googleapis/google-api-java-client
[google-auth-library-java]: https://github.com/googleapis/google-auth-library-java
[maven-search]: https://search.maven.org/search?q=google-api-services
