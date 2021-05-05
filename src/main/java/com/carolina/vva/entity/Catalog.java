package com.carolina.vva.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalog {

    @Id
    private Long id;
    private String nameposition;

    public Catalog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameposition() {
        return nameposition;
    }

    public void setNameposition(String nameposition) {
        this.nameposition = nameposition;
    }
}
