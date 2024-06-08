package pl.wat.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String surname;
    private String passwordHash;
    private String phone;
    private Integer points;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswordHash(String password) {
        this.passwordHash = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPoints(){
        this.points = 0;
    }

    public void addPoints(int i){
        this.points = this.points + i;
    }
    public String getPassword(){
        return this.passwordHash;
    }

    public Object getName() {
        return this.name;
    }

    public Object getEmail() {
        return this.email;
    }

    public Object getSurname() {
        return this.surname;
    }

    public Object getPhone() {
        return this.phone;
    }

    public Integer getPoints() {
        return this.points;
    }
}
