# Google Java API Client Services

This repository contains the generated source for individual APIs that utilize
[Google APIs Client Library for Java][google-api-java-client].  We recommend using the
[Google Auth Library for Java][google-auth-library-java] for handling authentication.

## Requirements

* [Google APIs Java Client Library for Java][google-api-java-client]
* Java 7 (or higher)
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
| Abusive Experience Report API | [v1](clients/google-api-services-abusiveexperiencereport/v1) |
| Accelerated Mobile Pages (AMP) URL API | [v1](clients/google-api-services-acceleratedmobilepageurl/v1) |
| Access Approval API | [v1](clients/google-api-services-accessapproval/v1) |
| Access Context Manager API | [v1](clients/google-api-services-accesscontextmanager/v1), [v1beta](clients/google-api-services-accesscontextmanager/v1beta) |
| Ad Exchange Buyer API | [v1.2](clients/google-api-services-adexchangebuyer/v1.2), [v1.3](clients/google-api-services-adexchangebuyer/v1.3), [v1.4](clients/google-api-services-adexchangebuyer/v1.4) |
| Ad Exchange Buyer API II | [v2beta1](clients/google-api-services-adexchangebuyer2/v2beta1) |
| Ad Experience Report API | [v1](clients/google-api-services-adexperiencereport/v1) |
| AdMob API | [v1](clients/google-api-services-admob/v1), [v1beta](clients/google-api-services-admob/v1beta) |
| AdSense Host API | [v4.1](clients/google-api-services-adsensehost/v4.1) |
| AdSense Management API | [v1.4](clients/google-api-services-adsense/v1.4) |
| Admin SDK API | [datatransfer_v1](clients/google-api-services-admin/datatransfer_v1), [directory_v1](clients/google-api-services-admin/directory_v1), [reports_v1](clients/google-api-services-admin/reports_v1) |
| Analytics Reporting API | [v4](clients/google-api-services-analyticsreporting/v4) |
| Android Device Provisioning Partner API | [v1](clients/google-api-services-androiddeviceprovisioning/v1) |
| Android Management API | [v1](clients/google-api-services-androidmanagement/v1) |
| Apigee API | [v1](clients/google-api-services-apigee/v1) |
| App Engine Admin API | [v1](clients/google-api-services-appengine/v1), [v1alpha](clients/google-api-services-appengine/v1alpha), [v1beta](clients/google-api-services-appengine/v1beta), [v1beta4](clients/google-api-services-appengine/v1beta4), [v1beta5](clients/google-api-services-appengine/v1beta5) |
| Apps Script API | [v1](clients/google-api-services-script/v1) |
| Area120 Tables API | [v1alpha1](clients/google-api-services-area120tables/v1alpha1) |
| Artifact Registry API | [v1](clients/google-api-services-artifactregistry/v1), [v1beta1](clients/google-api-services-artifactregistry/v1beta1), [v1beta2](clients/google-api-services-artifactregistry/v1beta2) |
| Assured Workloads API | [v1](clients/google-api-services-assuredworkloads/v1) |
| BigQuery API | [v2](clients/google-api-services-bigquery/v2) |
| BigQuery Connection API | [v1beta1](clients/google-api-services-bigqueryconnection/v1beta1) |
| BigQuery Data Transfer API | [v1](clients/google-api-services-bigquerydatatransfer/v1) |
| BigQuery Reservation API | [v1](clients/google-api-services-bigqueryreservation/v1), [v1alpha2](clients/google-api-services-bigqueryreservation/v1alpha2), [v1beta1](clients/google-api-services-bigqueryreservation/v1beta1) |
| Binary Authorization API | [v1](clients/google-api-services-binaryauthorization/v1), [v1beta1](clients/google-api-services-binaryauthorization/v1beta1) |
| Blogger API v3 | [v2](clients/google-api-services-blogger/v2), [v3](clients/google-api-services-blogger/v3) |
| Books API | [v1](clients/google-api-services-books/v1) |
| Calendar API | [v3](clients/google-api-services-calendar/v3) |
| Campaign Manager 360 API | [v3.3](clients/google-api-services-dfareporting/v3.3), [v3.4](clients/google-api-services-dfareporting/v3.4) |
| Certificate Authority API | [v1beta1](clients/google-api-services-privateca/v1beta1) |
| Chrome UX Report API | [v1](clients/google-api-services-chromeuxreport/v1) |
| Chrome Verified Access API | [v1](clients/google-api-services-verifiedaccess/v1) |
| Cloud Asset API | [v1](clients/google-api-services-cloudasset/v1), [v1beta1](clients/google-api-services-cloudasset/v1beta1), [v1p1beta1](clients/google-api-services-cloudasset/v1p1beta1), [v1p4beta1](clients/google-api-services-cloudasset/v1p4beta1), [v1p5beta1](clients/google-api-services-cloudasset/v1p5beta1) |
| Cloud Bigtable Admin API | [v1](clients/google-api-services-bigtableadmin/v1), [v2](clients/google-api-services-bigtableadmin/v2) |
| Cloud Billing API | [v1](clients/google-api-services-cloudbilling/v1) |
| Cloud Billing Budget API | [v1](clients/google-api-services-billingbudgets/v1), [v1beta1](clients/google-api-services-billingbudgets/v1beta1) |
| Cloud Build API | [v1](clients/google-api-services-cloudbuild/v1), [v1alpha1](clients/google-api-services-cloudbuild/v1alpha1), [v1alpha2](clients/google-api-services-cloudbuild/v1alpha2) |
| Cloud Composer API | [v1](clients/google-api-services-composer/v1), [v1beta1](clients/google-api-services-composer/v1beta1) |
| Cloud DNS API | [v1](clients/google-api-services-dns/v1), [v1beta2](clients/google-api-services-dns/v1beta2) |
| Cloud Data Fusion API | [v1](clients/google-api-services-datafusion/v1), [v1beta1](clients/google-api-services-datafusion/v1beta1) |
| Cloud Data Loss Prevention (DLP) API | [v2](clients/google-api-services-dlp/v2) |
| Cloud Dataproc API | [v1](clients/google-api-services-dataproc/v1), [v1beta2](clients/google-api-services-dataproc/v1beta2) |
| Cloud Datastore API | [v1](clients/google-api-services-datastore/v1), [v1beta1](clients/google-api-services-datastore/v1beta1), [v1beta3](clients/google-api-services-datastore/v1beta3) |
| Cloud Debugger API | [v2](clients/google-api-services-clouddebugger/v2) |
| Cloud Deployment Manager V2 API | [alpha](clients/google-api-services-deploymentmanager/alpha), [v2](clients/google-api-services-deploymentmanager/v2), [v2beta](clients/google-api-services-deploymentmanager/v2beta) |
| Cloud Document AI API | [v1beta2](clients/google-api-services-documentai/v1beta2), [v1beta3](clients/google-api-services-documentai/v1beta3) |
| Cloud Domains API | [v1alpha2](clients/google-api-services-domains/v1alpha2), [v1beta1](clients/google-api-services-domains/v1beta1) |
| Cloud Filestore API | [v1](clients/google-api-services-file/v1), [v1beta1](clients/google-api-services-file/v1beta1) |
| Cloud Firestore API | [v1](clients/google-api-services-firestore/v1), [v1beta1](clients/google-api-services-firestore/v1beta1), [v1beta2](clients/google-api-services-firestore/v1beta2) |
| Cloud Functions API | [v1](clients/google-api-services-cloudfunctions/v1) |
| Cloud Healthcare API | [v1](clients/google-api-services-healthcare/v1), [v1beta1](clients/google-api-services-healthcare/v1beta1) |
| Cloud Identity API | [v1](clients/google-api-services-cloudidentity/v1), [v1beta1](clients/google-api-services-cloudidentity/v1beta1) |
| Cloud Identity-Aware Proxy API | [v1](clients/google-api-services-iap/v1), [v1beta1](clients/google-api-services-iap/v1beta1) |
| Cloud IoT API | [v1](clients/google-api-services-cloudiot/v1) |
| Cloud Key Management Service (KMS) API | [v1](clients/google-api-services-cloudkms/v1) |
| Cloud Life Sciences API | [v2beta](clients/google-api-services-lifesciences/v2beta) |
| Cloud Logging API | [v2](clients/google-api-services-logging/v2) |
| Cloud Memorystore for Memcached API | [v1beta2](clients/google-api-services-memcache/v1beta2) |
| Cloud Monitoring API | [v1](clients/google-api-services-monitoring/v1), [v3](clients/google-api-services-monitoring/v3) |
| Cloud Natural Language API | [v1](clients/google-api-services-language/v1), [v1beta1](clients/google-api-services-language/v1beta1), [v1beta2](clients/google-api-services-language/v1beta2) |
| Cloud OS Login API | [v1](clients/google-api-services-oslogin/v1), [v1alpha](clients/google-api-services-oslogin/v1alpha), [v1beta](clients/google-api-services-oslogin/v1beta) |
| Cloud Pub/Sub API | [v1](clients/google-api-services-pubsub/v1), [v1beta1a](clients/google-api-services-pubsub/v1beta1a), [v1beta2](clients/google-api-services-pubsub/v1beta2) |
| Cloud Resource Manager API | [v1](clients/google-api-services-cloudresourcemanager/v1), [v1beta1](clients/google-api-services-cloudresourcemanager/v1beta1), [v2](clients/google-api-services-cloudresourcemanager/v2), [v2beta1](clients/google-api-services-cloudresourcemanager/v2beta1) |
| Cloud Run Admin API | [v1](clients/google-api-services-run/v1), [v1alpha1](clients/google-api-services-run/v1alpha1), [v1beta1](clients/google-api-services-run/v1beta1) |
| Cloud Runtime Configuration API | [v1](clients/google-api-services-runtimeconfig/v1), [v1beta1](clients/google-api-services-runtimeconfig/v1beta1) |
| Cloud SQL Admin API | [v1beta4](clients/google-api-services-sqladmin/v1beta4) |
| Cloud Scheduler API | [v1](clients/google-api-services-cloudscheduler/v1), [v1beta1](clients/google-api-services-cloudscheduler/v1beta1) |
| Cloud Search API | [v1](clients/google-api-services-cloudsearch/v1) |
| Cloud Shell API | [v1](clients/google-api-services-cloudshell/v1), [v1alpha1](clients/google-api-services-cloudshell/v1alpha1) |
| Cloud Source Repositories API | [v1](clients/google-api-services-sourcerepo/v1) |
| Cloud Spanner API | [v1](clients/google-api-services-spanner/v1) |
| Cloud Speech-to-Text API | [v1](clients/google-api-services-speech/v1), [v1p1beta1](clients/google-api-services-speech/v1p1beta1), [v2beta1](clients/google-api-services-speech/v2beta1) |
| Cloud Storage JSON API | [v1](clients/google-api-services-storage/v1) |
| Cloud TPU API | [v1](clients/google-api-services-tpu/v1), [v1alpha1](clients/google-api-services-tpu/v1alpha1) |
| Cloud Talent Solution API | [v3](clients/google-api-services-jobs/v3), [v3p1beta1](clients/google-api-services-jobs/v3p1beta1), [v4](clients/google-api-services-jobs/v4) |
| Cloud Tasks API | [v2](clients/google-api-services-cloudtasks/v2), [v2beta2](clients/google-api-services-cloudtasks/v2beta2), [v2beta3](clients/google-api-services-cloudtasks/v2beta3) |
| Cloud Testing API | [v1](clients/google-api-services-testing/v1) |
| Cloud Text-to-Speech API | [v1](clients/google-api-services-texttospeech/v1), [v1beta1](clients/google-api-services-texttospeech/v1beta1) |
| Cloud Tool Results API | [v1beta3](clients/google-api-services-toolresults/v1beta3) |
| Cloud Trace API | [v1](clients/google-api-services-cloudtrace/v1), [v2](clients/google-api-services-cloudtrace/v2), [v2beta1](clients/google-api-services-cloudtrace/v2beta1) |
| Cloud Translation API | [v3](clients/google-api-services-translate/v3), [v3beta1](clients/google-api-services-translate/v3beta1) |
| Cloud Video Intelligence API | [v1](clients/google-api-services-videointelligence/v1), [v1beta2](clients/google-api-services-videointelligence/v1beta2), [v1p1beta1](clients/google-api-services-videointelligence/v1p1beta1), [v1p2beta1](clients/google-api-services-videointelligence/v1p2beta1), [v1p3beta1](clients/google-api-services-videointelligence/v1p3beta1) |
| Cloud Vision API | [v1](clients/google-api-services-vision/v1), [v1p1beta1](clients/google-api-services-vision/v1p1beta1), [v1p2beta1](clients/google-api-services-vision/v1p2beta1) |
| Compute Engine API | [alpha](clients/google-api-services-compute/alpha), [beta](clients/google-api-services-compute/beta), [v1](clients/google-api-services-compute/v1) |
| Container Analysis API | [v1alpha1](clients/google-api-services-containeranalysis/v1alpha1), [v1beta1](clients/google-api-services-containeranalysis/v1beta1) |
| Content API for Shopping | [v2](clients/google-api-services-content/v2), [v2.1](clients/google-api-services-content/v2.1) |
| Custom Search API | [v1](clients/google-api-services-customsearch/v1) |
| Data Labeling API | [v1beta1](clients/google-api-services-datalabeling/v1beta1) |
| Database Migration API | [v1beta1](clients/google-api-services-datamigration/v1beta1) |
| Dataflow API | [v1b3](clients/google-api-services-dataflow/v1b3) |
| Dataproc Metastore API | [v1alpha](clients/google-api-services-metastore/v1alpha), [v1beta](clients/google-api-services-metastore/v1beta) |
| Dialogflow API | [v2](clients/google-api-services-dialogflow/v2), [v2beta1](clients/google-api-services-dialogflow/v2beta1), [v3](clients/google-api-services-dialogflow/v3), [v3beta1](clients/google-api-services-dialogflow/v3beta1) |
| Digital Asset Links API | [v1](clients/google-api-services-digitalassetlinks/v1) |
| Display & Video 360 API | [v1](clients/google-api-services-displayvideo/v1) |
| Domains RDAP API | [v1](clients/google-api-services-domainsrdap/v1) |
| DoubleClick Bid Manager API | [v1](clients/google-api-services-doubleclickbidmanager/v1), [v1.1](clients/google-api-services-doubleclickbidmanager/v1.1) |
| Drive API | [v2](clients/google-api-services-drive/v2), [v3](clients/google-api-services-drive/v3) |
| Drive Activity API | [v2](clients/google-api-services-driveactivity/v2) |
| Enterprise License Manager API | [v1](clients/google-api-services-licensing/v1) |
| Error Reporting API | [v1beta1](clients/google-api-services-clouderrorreporting/v1beta1) |
| Eventarc API | [v1beta1](clients/google-api-services-eventarc/v1beta1) |
| Fact Check Tools API | [v1alpha1](clients/google-api-services-factchecktools/v1alpha1) |
| Firebase Cloud Messaging API | [v1](clients/google-api-services-fcm/v1) |
| Firebase Dynamic Links API | [v1](clients/google-api-services-firebasedynamiclinks/v1) |
| Firebase Hosting API | [v1](clients/google-api-services-firebasehosting/v1), [v1beta1](clients/google-api-services-firebasehosting/v1beta1) |
| Firebase ML API | [v1](clients/google-api-services-firebaseml/v1), [v1beta2](clients/google-api-services-firebaseml/v1beta2) |
| Firebase Management API | [v1beta1](clients/google-api-services-firebase/v1beta1) |
| Firebase Realtime Database Management API | [v1beta](clients/google-api-services-firebasedatabase/v1beta) |
| Firebase Rules API | [v1](clients/google-api-services-firebaserules/v1) |
| Fitness API | [v1](clients/google-api-services-fitness/v1) |
| G Suite Vault API | [v1](clients/google-api-services-vault/v1) |
| Game Services API | [v1](clients/google-api-services-gameservices/v1), [v1beta](clients/google-api-services-gameservices/v1beta) |
| Genomics API | [v1](clients/google-api-services-genomics/v1), [v1alpha2](clients/google-api-services-genomics/v1alpha2), [v2alpha1](clients/google-api-services-genomics/v2alpha1) |
| Gmail API | [v1](clients/google-api-services-gmail/v1) |
| Gmail Postmaster Tools API | [v1beta1](clients/google-api-services-gmailpostmastertools/v1beta1) |
| Google Analytics API | [v3](clients/google-api-services-analytics/v3) |
| Google Analytics Admin API | [v1alpha](clients/google-api-services-analyticsadmin/v1alpha) |
| Google Analytics Data API | [v1alpha](clients/google-api-services-analyticsdata/v1alpha) |
| Google Civic Information API | [v2](clients/google-api-services-civicinfo/v2) |
| Google Classroom API | [v1](clients/google-api-services-classroom/v1) |
| Google Cloud Data Catalog API | [v1beta1](clients/google-api-services-datacatalog/v1beta1) |
| Google Cloud Memorystore for Redis API | [v1](clients/google-api-services-redis/v1), [v1beta1](clients/google-api-services-redis/v1beta1) |
| Google Cloud Translation API | [v2](clients/google-api-services-translate/v2) |
| Google Docs API | [v1](clients/google-api-services-docs/v1) |
| Google Identity Toolkit API | [v3](clients/google-api-services-identitytoolkit/v3) |
| Google OAuth2 API | [v2](clients/google-api-services-oauth2/v2) |
| Google Play Android Developer API | [v3](clients/google-api-services-androidpublisher/v3) |
| Google Play Custom App Publishing API | [v1](clients/google-api-services-playcustomapp/v1) |
| Google Play EMM API | [v1](clients/google-api-services-androidenterprise/v1) |
| Google Play Game Management | [v1management](clients/google-api-services-gamesManagement/v1management) |
| Google Play Game Services | [v1](clients/google-api-services-games/v1) |
| Google Play Game Services Publishing API | [v1configuration](clients/google-api-services-gamesConfiguration/v1configuration) |
| Google Search Console API | [v1](clients/google-api-services-searchconsole/v1) |
| Google Sheets API | [v4](clients/google-api-services-sheets/v4) |
| Google Site Verification API | [v1](clients/google-api-services-siteVerification/v1) |
| Google Slides API | [v1](clients/google-api-services-slides/v1) |
| Google Workspace Alert Center API | [v1beta1](clients/google-api-services-alertcenter/v1beta1) |
| Google Workspace Reseller API | [v1](clients/google-api-services-reseller/v1) |
| Groups Migration API | [v1](clients/google-api-services-groupsmigration/v1) |
| Groups Settings API | [v1](clients/google-api-services-groupssettings/v1) |
| Hangouts Chat API | [v1](clients/google-api-services-chat/v1) |
| HomeGraph API | [v1](clients/google-api-services-homegraph/v1) |
| IAM Service Account Credentials API | [v1](clients/google-api-services-iamcredentials/v1) |
| Identity and Access Management (IAM) API | [v1](clients/google-api-services-iam/v1) |
| Indexing API | [v3](clients/google-api-services-indexing/v3) |
| Knowledge Graph Search API | [v1](clients/google-api-services-kgsearch/v1) |
| Kubernetes Engine API | [v1](clients/google-api-services-container/v1), [v1beta1](clients/google-api-services-container/v1beta1) |
| Library Agent API | [v1](clients/google-api-services-libraryagent/v1) |
| Local Services API | [v1](clients/google-api-services-localservices/v1) |
| Managed Service for Microsoft Active Directory API | [v1](clients/google-api-services-managedidentities/v1), [v1alpha1](clients/google-api-services-managedidentities/v1alpha1), [v1beta1](clients/google-api-services-managedidentities/v1beta1) |
| Manufacturer Center API | [v1](clients/google-api-services-manufacturers/v1) |
| Network Management API | [v1](clients/google-api-services-networkmanagement/v1), [v1beta1](clients/google-api-services-networkmanagement/v1beta1) |
| Notebooks API | [v1](clients/google-api-services-notebooks/v1) |
| OS Config API | [v1](clients/google-api-services-osconfig/v1), [v1beta](clients/google-api-services-osconfig/v1beta) |
| PageSpeed Insights API | [v5](clients/google-api-services-pagespeedonline/v5) |
| People API | [v1](clients/google-api-services-people/v1) |
| Playable Locations API | [v3](clients/google-api-services-playablelocations/v3) |
| Policy Troubleshooter API | [v1](clients/google-api-services-policytroubleshooter/v1), [v1beta](clients/google-api-services-policytroubleshooter/v1beta) |
| Poly API | [v1](clients/google-api-services-poly/v1) |
| Pub/Sub Lite API | [v1](clients/google-api-services-pubsublite/v1) |
| Real-time Bidding API | [v1](clients/google-api-services-realtimebidding/v1) |
| Recommendations AI | [v1beta1](clients/google-api-services-recommendationengine/v1beta1) |
| Recommender API | [v1](clients/google-api-services-recommender/v1), [v1beta1](clients/google-api-services-recommender/v1beta1) |
| Remote Build Execution API | [v1](clients/google-api-services-remotebuildexecution/v1), [v1alpha](clients/google-api-services-remotebuildexecution/v1alpha), [v2](clients/google-api-services-remotebuildexecution/v2) |
| SAS Portal API | [v1alpha1](clients/google-api-services-sasportal/v1alpha1) |
| SAS Portal API (Testing) | [v1alpha1](clients/google-api-services-prod_tt_sasportal/v1alpha1) |
| Safe Browsing API | [v4](clients/google-api-services-safebrowsing/v4) |
| Search Ads 360 API | [v2](clients/google-api-services-doubleclicksearch/v2) |
| Search Console API | [v3](clients/google-api-services-webmasters/v3) |
| Secret Manager API | [v1](clients/google-api-services-secretmanager/v1), [v1beta1](clients/google-api-services-secretmanager/v1beta1) |
| Security Command Center API | [v1](clients/google-api-services-securitycenter/v1), [v1beta1](clients/google-api-services-securitycenter/v1beta1), [v1beta2](clients/google-api-services-securitycenter/v1beta2) |
| Security Token Service API | [v1](clients/google-api-services-sts/v1), [v1beta](clients/google-api-services-sts/v1beta) |
| Semantic Tile API | [v1](clients/google-api-services-vectortile/v1) |
| Service Consumer Management API | [v1](clients/google-api-services-serviceconsumermanagement/v1), [v1beta1](clients/google-api-services-serviceconsumermanagement/v1beta1) |
| Service Control API | [v1](clients/google-api-services-servicecontrol/v1), [v2](clients/google-api-services-servicecontrol/v2) |
| Service Directory API | [v1](clients/google-api-services-servicedirectory/v1), [v1beta1](clients/google-api-services-servicedirectory/v1beta1) |
| Service Management API | [v1](clients/google-api-services-servicemanagement/v1) |
| Service Networking API | [v1](clients/google-api-services-servicenetworking/v1), [v1beta](clients/google-api-services-servicenetworking/v1beta) |
| Service Usage API | [v1](clients/google-api-services-serviceusage/v1), [v1beta1](clients/google-api-services-serviceusage/v1beta1) |
| Smart Device Management API | [v1](clients/google-api-services-smartdevicemanagement/v1) |
| Stackdriver Profiler API | [v2](clients/google-api-services-cloudprofiler/v2) |
| Storage Transfer API | [v1](clients/google-api-services-storagetransfer/v1) |
| Street View Publish API | [v1](clients/google-api-services-streetviewpublish/v1) |
| Tag Manager API | [v1](clients/google-api-services-tagmanager/v1), [v2](clients/google-api-services-tagmanager/v2) |
| Tasks API | [v1](clients/google-api-services-tasks/v1) |
| Traffic Director API | [v2](clients/google-api-services-trafficdirector/v2) |
| Transcoder API | [v1beta1](clients/google-api-services-transcoder/v1beta1) |
| Web Fonts Developer API | [v1](clients/google-api-services-webfonts/v1) |
| Web Security Scanner API | [v1](clients/google-api-services-websecurityscanner/v1), [v1alpha](clients/google-api-services-websecurityscanner/v1alpha), [v1beta](clients/google-api-services-websecurityscanner/v1beta) |
| Workflow Executions API | [v1beta](clients/google-api-services-workflowexecutions/v1beta) |
| Workflows API | [v1beta](clients/google-api-services-workflows/v1beta) |
| YouTube Analytics API | [v1](clients/google-api-services-youtubeAnalytics/v1), [v2](clients/google-api-services-youtubeAnalytics/v2) |
| YouTube Data API v3 | [v3](clients/google-api-services-youtube/v3) |
| YouTube Reporting API | [v1](clients/google-api-services-youtubereporting/v1) |

[//]: # (API_TABLE_END)

## Authentication

google-api-java recommends using the [google-auth-library-java][google-auth-library-java] library to authenticate requests. google-auth-library-java supports a wide range of authentication types; see the [project's README](https://github.com/googleapis/google-auth-library-java#google-auth-library) and [javadoc](https://googleapis.dev/java/google-auth-library/latest/) for more details.

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

[google-api-java-client]: https://github.com/googleapis/google-api-java-client
[google-auth-library-java]: https://github.com/googleapis/google-auth-library-java
[maven-search]: https://search.maven.org/search?q=google-api-services
