package com.google.api.services.bigquery;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.bigquery.model.MaterializedViewDefinition;
import com.google.api.services.bigquery.model.Table;
import com.google.api.services.bigquery.model.TableReference;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.ServiceAccountCredentials;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
  static final String PROJECT = null;

  public static void main(String[] args) throws GeneralSecurityException, IOException {
    Table tView = new Table();
    TableReference tableRef = new TableReference();
    tableRef.setTableId("mytable4");
    tableRef.setDatasetId("mydataset");
    tableRef.setProjectId(PROJECT);
    tView.setTableReference(tableRef);
    MaterializedViewDefinition viewDef = new MaterializedViewDefinition().setQuery("SELECT column1 from mydataset.mytable")
        .setAllowNonIncrementalDefinition(true)
        .encodeMaxStaleness("INTERVAL \"4\" HOUR".getBytes());
    tView.setMaterializedView(viewDef);
    Bigquery bigquery = new Bigquery.Builder(GoogleNetHttpTransport.newTrustedTransport(),
        GsonFactory.getDefaultInstance(),
        new HttpCredentialsAdapter(ServiceAccountCredentials.getApplicationDefault()))
        .build();

    bigquery.tables().insert(PROJECT, "mydataset", tView).execute();
  }

}
