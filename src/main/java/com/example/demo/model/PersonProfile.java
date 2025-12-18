package com.example.demo.model
public class PersonProfile{
    @Id;
    private long id;
    private String personType;
    @Column(unique=true)
    private String referenceId;
    private String fullName;
    @Column(unique=true)
    private String email;
    private 
}