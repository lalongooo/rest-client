package com.tyket.rest.client;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalongooo
 */
public class TyketRestClient {

    private static final String API_BASE_URL = "http://still-lake-9485.herokuapp.com/api/";

    public synchronized void sendRequest(final HttpMethod f, final Object o, final Class c) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                RestTemplate restTemplate = new RestTemplate();
                if (f == HttpMethod.POST) {
                    restTemplate.postForObject(API_BASE_URL + "users/", o, c);
                }
            }
        }).start();

    }
}
