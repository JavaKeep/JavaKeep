package com.seapip.teunthomas.javakeep.dao;

import com.seapip.teunthomas.javakeep.entities.Accountable;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQuery(
        name = "Account.getByEmail", query = "SELECT a FROM Account a WHERE a.email = :email"
)
public class Account implements Accountable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String password;

    @OneToMany(mappedBy="account")
    private List<Note> notes;


    public Account() {
    }

    public Account(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
