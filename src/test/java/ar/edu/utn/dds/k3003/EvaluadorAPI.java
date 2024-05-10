package ar.edu.utn.dds.k3003;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

public class EvaluadorAPI {

  public static void main(String[] args) throws Exception {

    HttpUriRequest request = new HttpGet("http://localhost:8080/traslados/0");

    // When
    HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

    // Then
    System.out.println(httpResponse.getStatusLine().getStatusCode());
  }
}
