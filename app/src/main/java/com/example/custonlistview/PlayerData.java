package com.example.custonlistview;

public class PlayerData {
    private String FistName;
    private String Image;
    private int Age ;
    private String Lastname ;
    private String Country ;
    private String Type ;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String fistName) {
        FistName = fistName;
    }


    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public PlayerData(String fistName,String lastname, String  type , String image, int age,  String country) {
        FistName = fistName;
        Image = image;
        Age = age;
        Lastname = lastname;
        Country = country;
        Type=type ;
    }
}