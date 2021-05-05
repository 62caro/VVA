package com.carolina.vva.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String password;
    private boolean active;

    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @ManyToMany
    private Set<Role> role;

    @OneToMany
    private Set<Product> product;

    public User() {
    }

    public User(String name, String password, boolean active, Set<Role> role){
        this.name = name;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public User(Set<Product> product) {
        this.product = product;
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

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}