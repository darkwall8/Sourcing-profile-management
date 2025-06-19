package com.sourcing.sourcong_profile_management.shared.infrastructure;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class APIClient {

    private final RestTemplate restTemplate;

    @Getter
    private final String baseUrl = "";

    public <T> ResponseEntity<T> get(String url, Class<T> responseType) {
        return restTemplate.exchange(url, HttpMethod.GET, null, responseType);
    }

    public <T, R> ResponseEntity<R> post(String url, T body, Class<R> responseType) {
        HttpEntity<T> request = new HttpEntity<>(body);
        return restTemplate.exchange(url, HttpMethod.POST, request, responseType);
    }

    public <T, R> ResponseEntity<R> put(String url, T body, Class<R> responseType) {
        HttpEntity<T> request = new HttpEntity<>(body);
        return restTemplate.exchange(url, HttpMethod.PUT, request, responseType);
    }

    public ResponseEntity<Void> delete(String url) {
        return restTemplate.exchange(url, HttpMethod.DELETE, null, Void.class);
    }
}
