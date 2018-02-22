package com.zjer.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Administrator
 * @date 2018/2/22 14:24
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private Timestamp enrolldate;

    public User() {}

    public User(Integer id, String name, String password, Timestamp enrolldate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.enrolldate = enrolldate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Timestamp getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(Timestamp enrolldate) {
        this.enrolldate = enrolldate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", enrolldate=" + enrolldate +
                '}';
    }
}
