/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

/**
 *
 * @author tharik
 */
public class Vehicletype {
    private String id;
    private String type;


    public Vehicletype() {
    }

    public Vehicletype(String id, String type) {
        this.id = id;
        this.type = type;
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = name;
    }

    
    
}