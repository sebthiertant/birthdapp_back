package com.example.birthdapp_back.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Birthday {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private LocalDate date;
    private String firstname;
    private String lastname;

    public Birthday() {
        super();
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "id=" + id +
                ", user_id=" + user.getId() +
                ", date=" + date +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}