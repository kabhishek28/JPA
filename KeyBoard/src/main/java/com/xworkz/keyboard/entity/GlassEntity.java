package com.xworkz.keyboard.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "glass_table")
public class GlassEntity {
    public GlassEntity(int id, String glassType) {
        this.id = id;
        this.glassType = glassType;
    }
public GlassEntity(){

}

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "glasstype")
    String glassType;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public String getGlassType() {
        return glassType;
    }
}
