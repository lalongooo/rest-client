/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tyket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author lalongooo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private int id;
    private String url;
    private String username;

    public User() {
    }

    public User(int id, String url, String username) {
        this.id = id;
        this.url = url;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
