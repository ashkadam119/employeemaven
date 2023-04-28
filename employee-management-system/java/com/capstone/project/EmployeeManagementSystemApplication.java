package com.capstone.project;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class EmployeeManagementSystemApplication { 
	

	public static void main(String[] args) {
		
		System.setProperty("javax.net.ssl.trustStore", "C:\\Users\\Rural Water\\eclipse-workspace\\employee-management-system\\target\\classes\\java.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "password");
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate(RestTemplateBuilder builder) {
		
		return builder.requestFactory(()->validateSSL()).build();
	}


	  private HttpComponentsClientHttpRequestFactory validateSSL() {

	  String location="C:\\Users\\Rural Water\\java.jks";
	  String pass="password";
	  SSLContext  sslContext=null; 
	  try {
	  sslContext=SSLContextBuilder.create().loadTrustMaterial(ResourceUtils.getFile (location),pass.toCharArray()).build(); 
	  }catch(Exception e) {

	  }

	  SSLConnectionSocketFactory csf=new SSLConnectionSocketFactory(sslContext,new LocalHostnameVerifier()); 
	  CloseableHttpClient httpClient=HttpClients.custom().setSSLSocketFactory(csf).build();
	  HttpComponentsClientHttpRequestFactory requestFactory=new HttpComponentsClientHttpRequestFactory(httpClient);

	  return requestFactory;
	  }

	  private class LocalHostnameVerifier implements HostnameVerifier{

	  @Override public boolean verify(String s, SSLSession sslSession) 
	  {
		  return "localhost".equalsIgnoreCase(s) ||"127.0.0.1".equals(s);
		  } 
	  }

}
