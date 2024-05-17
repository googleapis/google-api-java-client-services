package com.google.apis.test;

import org.junit.Test;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.cloudresourcemanager.v3.CloudResourceManager;
import com.google.api.services.cloudresourcemanager.v3.CloudResourceManager.Projects;
import com.google.api.services.cloudresourcemanager.v3.CloudResourceManager.Projects.Get;
import com.google.api.services.cloudresourcemanager.v3.model.Project;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;

public class ResourceManagerIntegrationTest {
    @Test
    public void testCloudResourceManager() throws Exception {
        GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();

        NetHttpTransport transport = GoogleNetHttpTransport.newTrustedTransport();
        GsonFactory jsonFactory = GsonFactory.getDefaultInstance();
        CloudResourceManager.Builder resourceManagerBuilder =
                new CloudResourceManager.Builder(
                        transport, jsonFactory, new HttpCredentialsAdapter(credentials))
                        .setApplicationName("Example Java App");
        CloudResourceManager cloudResourceManager = resourceManagerBuilder.build();

        Projects projects = cloudResourceManager.projects();

        Get get = projects.get("projects/cloud-java-ci-test");

        Project project = get.execute();
        System.out.println("Project display name: " + project.getDisplayName());
    }
}
