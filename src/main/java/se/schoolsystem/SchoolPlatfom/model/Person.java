package se.schoolsystem.SchoolPlatfom.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="person")
public class Person implements Serializable {

    @Id
    @Column(
            nullable = false,
            unique = true
    )
    private String ssn;

    @Column(
            nullable = false
    )
    private String name;

    @Column(
            nullable = false
    )
    private String surname;

    @Column(
            nullable = false,
            unique = true
    )
    private String email;

    @Column(
            nullable = false
    )
    private String password;

    @Column(
            nullable = false
    )
    private long role_id;

    @Column(
            nullable = false,
            unique = true
    )
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", role_id=" + role_id +
                ", username='" + username + '\'' +
                '}';
    }
}








