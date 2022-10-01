/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gocheeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharik
 */
public class DBUtils {

    static final String URL = "jdbc:mysql://localhost:3306/gocheeta?autoReconnect=true&useSSL=false";
    static final String USERNAME = "root";
    static final String PASSWORD = "ammaar123";

    public Customer getCustomer(String id) {
        Customer customer = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from customer WHERE CusId='" + id + "'");
            
            while(resultSet.next()) {
                customer = new Customer(resultSet.getString("CusId"), 
                        resultSet.getString("CusName"),
                        resultSet.getString("CusEmail"),
                        resultSet.getString("CusContact"),
                        resultSet.getString("CusUserName"),
                        resultSet.getString("CusPass"));
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customer;
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from customers");

            while (resultSet.next()) {
                Customer customer = new Customer(resultSet.getString("CusId"),
                        resultSet.getString("CusName"),
                        resultSet.getString("CusEmail"),
                        resultSet.getString("CusContact"),
                        resultSet.getString("CusUserName"),
                        resultSet.getString("CusPass"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return customers;
    }

    public boolean addCustomer(Customer customer) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO customer (`CusId`, `CusName`, `CusEmail`, `CusContact`, `CusUserName`, `CusPass`) VALUES ('"
                    + customer.getId() + "', '" + customer.getName() + "', '" + customer.getEmail() + "', '" + customer.getContact() + "', '" + customer.getUsername() + "', '" + customer.getPass() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateCustomer(Customer customer) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `customer` SET `CusName` = '" + customer.getName() + "', `CusEmail` = "
                    + "'" + customer.getEmail() + "', `CusContact` = '" + customer.getContact() + "', `CusUserName` = "
                    + "'" + customer.getUsername() + "', `CusPass` = '" + customer.getPass() + "' WHERE (`CusId` = '" + customer.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteCustomer(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `customer` WHERE (`CusId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public Driver getDriver(String id) {
        Driver driver = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from driver WHERE DriverId='" + id + "'");
            
            while(resultSet.next()) {
                driver = new Driver(resultSet.getString("DriverId"), 
                        resultSet.getString("DriverName"),
                        resultSet.getString("DriverEmail"),
                        resultSet.getString("DriverContact"),
                        resultSet.getString("DriverUserName"),
                        resultSet.getString("DriverPass"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return driver;
    }

    public List<Driver> getDrivers() {
        List<Driver> drivers = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Drivers");

            while (resultSet.next()) {
                Driver driver = new Driver(resultSet.getString("DriverId"),
                        resultSet.getString("DriverName"),
                        resultSet.getString("DriverEmail"),
                        resultSet.getString("DriverContact"),
                        resultSet.getString("DriverUserName"),
                        resultSet.getString("DriverPass"));
                drivers.add(driver);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return drivers;
    }

    public boolean addDriver(Driver driver) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO driver (`DriverId`, `DriverName`, `DriverEmail`, `DriverContact`, `DriverUserName`, `DriverPass`) VALUES ('"
                    + driver.getId() + "', '" + driver.getName() + "', '" + driver.getEmail() + "', '" + driver.getContact() + "', '" + driver.getUsername() + "', '" + driver.getPass() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateDriver(Driver driver) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `driver` SET `DriverName` = '" + driver.getName() + "', `DriverEmail` = "
                    + "'" + driver.getEmail() + "', `DriverContact` = '" + driver.getContact() + "', `DriverUserName` = "
                    + "'" + driver.getUsername() + "', `DriverPass` = '" + driver.getPass() + "' WHERE (`DriverId` = '" + driver.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteDriver(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `driver` WHERE (`DriverId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
     public Admin getAdmin(String id) {
        Admin admin = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from admin WHERE AdminId='" + id + "'");
            
            while(resultSet.next()) {
                admin = new Admin(resultSet.getString("AdminId"), 
                        resultSet.getString("AdminName"),
                        resultSet.getString("AdminEmail"),
                        resultSet.getString("AdminContact"),
                        resultSet.getString("AdminUserName"),
                        resultSet.getString("AdminPass"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return admin;
    }

    public List<Admin> getAdmins() {
        List<Admin> admins = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Admins");

            while (resultSet.next()) {
                Admin admin = new Admin(resultSet.getString("AdminId"),
                        resultSet.getString("AdminName"),
                        resultSet.getString("AdminEmail"),
                        resultSet.getString("AdminContact"),
                        resultSet.getString("AdminUserName"),
                        resultSet.getString("AdminPass"));
                admins.add(admin);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return admins;
    }

    public boolean addAdmin(Admin admin) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO admin (`AdminId`, `AdminName`, `AdminEmail`, `AdminContact`, `AdminUserName`, `AdminPass`) VALUES ('"
                    + admin.getId() + "', '" + admin.getName() + "', '" + admin.getEmail() + "', '" + admin.getContact() + "', '" + admin.getUsername() + "', '" + admin.getPass() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateAdmin(Admin admin) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `admin` SET `AdminName` = '" + admin.getName() + "', `AdminEmail` = "
                    + "'" + admin.getEmail() + "', `AdminContact` = '" + admin.getContact() + "', `AdminUserName` = "
                    + "'" + admin.getUsername() + "', `AdminPass` = '" + admin.getPass() + "' WHERE (`AdminId` = '" + admin.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteAdmin(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `admin` WHERE (`AdminId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
    public Booking getBooking(String id) {
        Booking booking = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from booking WHERE BookingId='" + id + "'");
            
            while(resultSet.next()) {
                booking = new Booking(resultSet.getString("BookingId"), 
                        resultSet.getString("CustomerId"),
                        resultSet.getString("VehicleId"),
                        resultSet.getString("DriverId"),
                        resultSet.getString("LocationId"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return booking;
    }

    public List<Booking> getBookings() {
        List<Booking> bookings = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Bookings");

            while (resultSet.next()) {
                Booking booking = new Booking(resultSet.getString("BookingId"),
                        resultSet.getString("CustomerId"),
                        resultSet.getString("VehicleId"),
                        resultSet.getString("DriverId"),
                        resultSet.getString("LocationId"));
                bookings.add(booking);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return bookings;
    }

    public boolean addBooking(Booking booking) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO booking (`BookingId`, `CustomerId`, `VehicleId`, `DriverId`, `LocationId`) VALUES ('"
                    + booking.getId() + "', '" + booking.getCustomerid() + "', '" + booking.getVehicleid() + "', '" + booking.getDriverid() + "', '" + booking.getLocationid() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteBooking(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `booking` WHERE (`BookingId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
      public Vehicle getVehicle(String id) {
        Vehicle vehicle = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from vehicle WHERE VehicleId='" + id + "'");
            
            while(resultSet.next()) {
                vehicle = new Vehicle(resultSet.getString("VehicleId"), 
                        resultSet.getString("VehicleName"),
                        resultSet.getString("VehicleColor"),
                        resultSet.getString("VehicleNumberplate"),
                        resultSet.getString("VehicletypeId"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return vehicle;
    }

    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Vehicles");

            while (resultSet.next()) {
                Vehicle vehicle = new Vehicle(resultSet.getString("VehicleId"),
                        resultSet.getString("VehicleName"),
                        resultSet.getString("VehicleColor"),
                        resultSet.getString("Vehiclenumberplate"),
                        resultSet.getString("Vehicletypeid"));
                vehicles.add(vehicle);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return vehicles;
    }

    public boolean addVehicle(Vehicle vehicle) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO vehicle (`VehicleId`, `VehicleName`, `VehicleColor`, `VehicleNumberplate`, `VehicletypeId`) VALUES ('"
                    + vehicle.getId() + "', '" + vehicle.getName() + "', '" + vehicle.getColor() + "', '" + vehicle.getNumberplate() + "', '" + vehicle.getVehicletypeid() + "', '" + vehicle.getPass() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateVehicle(Vehicle vehicle) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `vehicle` SET `VehicleName` = '" + vehicle.getName() + "', `VehicleColor` = "
                    + "'" + vehicle.getColor() + "', `VehicleNumberplate` = '" + vehicle.getNumberplate() + "', `VehicletypeId` = "
                    + "'" + vehicle.getVehicletypeid() + "' WHERE (`VehicleId` = '" + vehicle.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteVehicle(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `vehicle` WHERE (`VehicleId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;   
    }
    
         public Location getLocation(String id) {
        Location location = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from location WHERE LocationId='" + id + "'");
            
            while(resultSet.next()) {
                location = new Location(resultSet.getString("LocationId"), 
                        resultSet.getString("LocationCity"),
                        resultSet.getString("LocationPickup"),
                        resultSet.getString("LocationDropup"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return location;
    }

    public List<Location> getLocations() {
        List<Location> locations = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Locations");

            while (resultSet.next()) {
                Location location = new Location(resultSet.getString("LocationId"),
                        resultSet.getString("LocationCity"),
                        resultSet.getString("LocationPickup"),
                        resultSet.getString("LocationDropum"));
                locations.add(location);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return locations;
    }

    public boolean addLocation(Location location) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO location (`LocationId`, `LocationCity`, `LocationPickup`, `LocationDropup`) VALUES ('"
                    + location.getId() + "', '" + location.getCity() + "', '" + location.getPickup() + "', '" + location.getDropup() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateLocation(Location location) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `location` SET `LocationCity` = '" + location.getCity() + "', `LocationPickup` = "
                    + "'" + location.getPickup() + "', `LocationDropup` = '" + location.getDropup() + "' WHERE (`LocationId` = '" + location.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteLocation(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `location` WHERE (`LocationId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }    
        
     public Vehicletype getVehicletype(String id) {
        Vehicletype vehicletype = null;
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from vehicletype WHERE VehicletypeId='" + id + "'");
            
            while(resultSet.next()) {
                vehicletype = new Vehicletype(resultSet.getString("VehicletypeId"), 
                        resultSet.getString("Vehicletype"));
            }
         
        } catch (SQLException e) {
            System.out.println(e);
        }
        return vehicletype;
    }

    public List<Vehicletype> getVehicletypes() {
        List<Vehicletype> vehicletypes = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Vehicletypes");

            while (resultSet.next()) {
                Vehicletype vehicletype = new Vehicletype(resultSet.getString("VehicletypeId"),
                        resultSet.getString("Vehicletype"));
               vehicletypes.add(vehicletype);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return vehicletypes;
    }

    public boolean addVehicletype(Vehicletype vehicletype) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            int rows = statement.executeUpdate("INSERT INTO vehicletype (`VehicletypeId`, `Vehicletype`) VALUES ('"
                    + vehicletype.getId() + "', '" + vehicletype.getType() + "')");

            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean updateVehicletype(Vehicletype vehicletype) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `booking` SET `AdminName` = '" + vehicletype.getType() + "', `Vehicletype` = "
                    + "' WHERE (`VehicletypeId` = '" + vehicletype.getId() + "')");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean deleteVehicletype(String id) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("DELETE FROM `vehicletype` WHERE (`VehicletypeId` = '" + id + "');");
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }      
    
        
}
