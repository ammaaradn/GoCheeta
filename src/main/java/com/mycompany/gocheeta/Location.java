/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

/**
 *
 * @author tharik
 */
public class Location {
    private String id;
    private String city;
    private String pickup;
    private String dropup;
;

    public Location() {
    }

    public Location(String id, String city, String pickup, String dropup) {
        this.id = id;
        this.city = city;
        this.pickup = pickup;
        this.dropup = dropup;
      
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropup() {
        return dropup;
    }

    public void setDropup(String dropup) {
        this.dropup = dropup;
    }

    
    
}