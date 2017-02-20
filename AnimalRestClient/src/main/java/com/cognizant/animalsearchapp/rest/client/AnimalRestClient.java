/**
 * 
 */
package com.cognizant.animalsearchapp.rest.client;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author Syamala
 *
 */
public class AnimalRestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String animalResourceUrl = "http://localhost:8080/AnimalSearchRest/v1/animals/region?requestXml=<animalrequest xmlns=\"com.cognizant.animalearchapp.rest\"><name>tiger</name><name>lion</name><name>monkey</name></animalrequest>";
		ResponseEntity<String> response = restTemplate.getForEntity(animalResourceUrl, String.class);
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		System.out.println("Response : " + response.getBody());
	}

}
