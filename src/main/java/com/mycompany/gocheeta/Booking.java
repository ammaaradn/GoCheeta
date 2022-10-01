/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

/**
 *
 * @author tharik
 */
public class Booking {
    private String id;
    private String customerid;
    private String vehicleid;
    private String driverid;
    private String locationid;
 

    public Booking() {
    }

    public Booking(String id, String customerid, String vehicleid, String driverid, String locationid) {
        this.id = id;
        this.customerid = customerid;
        this.vehicleid = vehicleid;
        this.driverid = driverid;
        this.locationid = locationid;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    
    
}