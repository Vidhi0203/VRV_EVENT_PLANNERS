package com.example.vrveventplanners;

public class UserModel {

    private String phone, password, email;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserModel(String phone, String password, String email) {
        this.phone = phone;
        this.password = password;
        this.email = email;
    }

    public UserModel()
    {

    }

}
