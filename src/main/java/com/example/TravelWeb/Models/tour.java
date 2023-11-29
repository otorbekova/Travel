package com.example.TravelWeb.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "tour")
public class tour {
    @Id
    @Column(name = "id_t")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTour;
    @Column(name = "nametour")
    private String nameTour;
    @Column(name = "local")
    private String local;
    @Column(name = "amount_day")
    private int day;
    @Column(name = "price")
    private int price;
    @Column(name = "textintro")
    private String intro;
//    @Column(name = "levelser")
//    private int level;
    @Column(name = "photoname")
    private String photoName;
    @Column(name = "path")
    private String path;

    @ManyToOne
    @JoinColumn(name = "levelser",referencedColumnName = "idlevel")
    private LevelServer levelServerList;

    @Override
    public String toString() {
        return "tour{" +
                "idTour=" + idTour +
                ", nameTour='" + nameTour + '\'' +
                ", local='" + local + '\'' +
                ", day=" + day +
                ", price=" + price +
                ", intro='" + intro + '\'' +
                ", photoName='" + photoName + '\'' +
                ", path='" + path + '\'' +
                ", levelServerList=" + levelServerList +
                '}';
    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getNameTour() {
        return nameTour;
    }

    public void setNameTour(String nameTour) {
        this.nameTour = nameTour;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LevelServer getLevelServerList() {
        return levelServerList;
    }

    public void setLevelServerList(LevelServer levelServerList) {
        this.levelServerList = levelServerList;
    }
}
