package com.ruyi.entity;

public class MailList {
    private String name;
    private String password;
    private Integer phone;
    private String address;
    private Integer is_delete;

    public MailList() {
    }

    public MailList(String name, String password, Integer phone, String address) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MailList{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
