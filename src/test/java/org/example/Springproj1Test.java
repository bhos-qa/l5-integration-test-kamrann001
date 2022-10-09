package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Springproj1Test{
    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders headers = new HttpHeaders();

    @Test
    public void reposTest(){
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos", HttpMethod.GET, entity, String.class);
        assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
    }

    @Test
    public void commitsTest(){
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches/1/commits", HttpMethod.GET, entity, String.class);
        assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
    }

    @Test
    public void branchesTest(){
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange("https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches", HttpMethod.GET, entity, String.class);
        assertEquals( MediaType.APPLICATION_JSON, response.getHeaders().getContentType());
    }


}