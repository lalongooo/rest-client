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
public class Article {
    
    private int id;
    private String url;
    private String name;
    private double price;
    private double amount;
    private Ticket ticket;

    public Article() {
    }
    
    public Article(int id, String url, double price, double amout, Ticket ticket) {
        this.id = id;
        this.url = url;
        this.price = price;
        this.amount = amout;
        this.ticket = ticket;
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

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }    
    
}
