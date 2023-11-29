package com.example.TravelWeb.Models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "levelservice")
public class LevelServer {
    @Id
    @Column(name = "idlevel")
    private int idLevel;
    @Column(name = "nameservice")
    private String nameSer;
    @Column(name = "descriptionlevel")
    private String desLevel;

    @OneToMany(mappedBy = "levelServerList")
    private List<tour> tourList;


    public int getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(int idLevel) {
        this.idLevel = idLevel;
    }

    public String getNameSer() {
        return nameSer;
    }

    public void setNameSer(String nameSer) {
        this.nameSer = nameSer;
    }

    public String getDesLevel() {
        return desLevel;
    }

    public void setDesLevel(String desLevel) {
        this.desLevel = desLevel;
    }

    @Override
    public String toString() {
        return  idLevel +
                " " + nameSer  +
                " " + desLevel ;
    }

    public List<tour> getTourList() {
        return tourList;
    }

    public void setTourList(List<tour> tourList) {
        this.tourList = tourList;
    }

//    public List<LevelServer> getLevelServerList() {
//        return levelServerList;
//    }
//
//    public void setLevelServerList(List<LevelServer> levelServerList) {
//        this.levelServerList = levelServerList;
//    }


}
