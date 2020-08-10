package com.revature;

public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String role;

    public static void main(String[] args){
        User user = new User();
        user.id = 123;
        user.lastName = "John";
        user.firstName = "Paul";
        user.password = "willie";
        user.role = "accountant";
        System.out.println(user.firstName +  "\n" + user.lastName + "\n." + user.password + "\n." + user.id + " " + user.role);

    }
}
