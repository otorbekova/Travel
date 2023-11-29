package com.example.TravelWeb.Admin.models;

import jakarta.persistence.*;


@Entity
@Table(name = "test")
public class Test {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtest")
    private Integer id;

    @Column(name = "namephoto")
    private String filename;

    @Column(name = "pathh")
    private String filepath;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
