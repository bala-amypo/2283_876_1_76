package com.example.demo.model
@Entity
public class PersonProfile{
    @Id;
    @GenertedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String personType;
    @Column(unique=true)
    private String referenceId;
    private String fullName;
    @Column(unique=true)
    private String email;
    private String department;
    private Boolean relationshipDeclared=false;
    private  LocalDateTime createdAt;
    void setId(int id)
    {
        
    }

}