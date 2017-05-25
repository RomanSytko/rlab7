package com.devcolibri.entity;

import javax.persistence.*;

@Entity(name = "user")
@NamedQueries({
        @NamedQuery(name = "User.getAll", query = "select u from user u")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_ID")
    private long id=0;

    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "code", nullable = false)
    private String code;

    public User() {
    }

    public User(String city, String code) {
        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
