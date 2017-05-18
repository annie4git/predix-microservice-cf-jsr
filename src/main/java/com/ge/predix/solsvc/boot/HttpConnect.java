package com.ge.predix.solsvc.boot;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

// http://garciapl.blogspot.com/2012/09/spring-rest-template-with-ssl.html
public class HttpConnect {

	public static String getConnect(String url) {
		final String methodName = "HttpConnect.getConnect(): ";

		RestTemplate restTemplate = new RestTemplate();
		enableSSL();
		

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println(methodName + "responseStatus=" + response.getStatusCode().value());
		// System.out.println(methodName + "responseBody=" +
		// response.getBody());
		return "http(s) connect to " + url + ", returned status code: " + response.getStatusCode().value();

	}
	
	private static void enableSSL() {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}
		} };

		try {
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
		}
	}

}
