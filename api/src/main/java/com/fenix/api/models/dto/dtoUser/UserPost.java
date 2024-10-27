package com.fenix.api.models.dto.dtoUser;

public class UserPost {
    private String name;
    private String email;
    private String phone;
    private String password;


    public UserPost(String name, String email, String phone, String password){
        super();
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public UserPost(){}//Por padrão


    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
