package com.isha.springdatajpamongodb.dto;


public class CustomerDTO
{

    // for custom id generation
    private String id;

    private Integer custNo;

    private String name;

    private String city;
// zero param constructor
    public CustomerDTO()
    {
        System.out.println("Zero param constructor of CustomerDTO");
    }


    // non zero param constructor
    public CustomerDTO(String id)
    {
        System.out.println("no zero param constructor");
        this.id=id;

    }
    // non zero param constructor
    public CustomerDTO(Integer custNo,String name,String city)
    {
        System.out.println("no zero param constructor");
        this.custNo=custNo;
        this.name=name;
        this.city=city;

    }

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
