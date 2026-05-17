package com.isha.springdatajpamongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document// for mongodb => like table in MySQL => Document in MongoDB
public class Customer
{
    @Id// primary id and doesn't come from jakarta
    private String id;

    private Integer custNo;

    private String name;

    private String city;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCustNo() {
        return custNo;
    }

    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString Method

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", custNo=" + custNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

