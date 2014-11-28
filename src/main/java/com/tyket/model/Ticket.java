/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tyket.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lalongooo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
    
    private int id;
    private String url;
    private Date date;
    private User user;
    private List<Article> articles;

    public Ticket() {
    }
    
    public Ticket(int id, String url, Date date, User user, List<Article> articles) {
        this.id = id;
        this.url = url;
        this.date = date;
        this.user = user;
        this.articles = articles;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    
}