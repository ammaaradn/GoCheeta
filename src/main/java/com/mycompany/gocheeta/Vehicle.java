/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

/**
 *
 * @author tharik
 */
public class Vehicle {
    private String id;
    private String name;
    private String color;
    private String numberplate;
    private String vehicletypeid;
    private String pass;

    public Vehicle() {
    }

    public Vehicle(String id, String name, String color, String numberplate, String vehicletypeid) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.numberplate = numberplate;
        this.vehicletypeid = vehicletypeid;
      
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public String getVehicletypeid() {
        return vehicletypeid;
    }

    public void setVehicletypeid(String vehicletypeid) {
        this.vehicletypeid = vehicletypeid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
}