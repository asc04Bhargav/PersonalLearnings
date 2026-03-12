package com.jdbc.practice;

import java.sql.*;
import java.util.function.Consumer;

public class JdbcExample1 {
    static Connection cn;
    static String url = "jdbc:mysql://localhost:3306/test";
    static String username = "root";
    static String password = "mysql";
    static PreparedStatement pst = null;
    static ResultSet rs;
    static String insertCommand ="INSERT INTO product VALUES(?,?,?)";
    static String selectCommand ="SELECT * FROM product";
    static String updateCommand = "UPDATE product SET prodname=?, price=? WHERE prodcode=?";
    static String deleteCommand = "DELETE FROM product WHERE prodcode =?";


    public static void main(String[] args) {

        try {
            cn= DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            System.out.println("Exception caught -> "+e.getMessage());
        }
//        addRecords();
//        showAllRecords();
//        updateRecords();
        deleteRecords();
    }

    public static void addRecords(){
        try {
            pst = cn.prepareStatement(insertCommand);
            pst.setInt(1,101);
            pst.setString(2,"S25");
            pst.setDouble(3,30000.0);
            pst.executeUpdate();

            pst = cn.prepareStatement(insertCommand);
            pst.setInt(1,102);
            pst.setString(2,"IPhone -16");
            pst.setDouble(3,32000.0);
            pst.executeUpdate();

            pst = cn.prepareStatement(insertCommand);
            pst.setInt(1,103);
            pst.setString(2,"Airpods");
            pst.setDouble(3,600.0);
            pst.executeUpdate();

            pst = cn.prepareStatement(insertCommand);
            pst.setInt(1,104);
            pst.setString(2,"Headset");
            pst.setDouble(3,165);
            pst.executeUpdate();

            pst = cn.prepareStatement(insertCommand);
            pst.setInt(1,105);
            pst.setString(2,"laptop");
            pst.setDouble(3,20000.0);
            pst.executeUpdate();
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            System.out.println("Exception Caught -> "+ e.getMessage());
        }
        System.out.println("Records added");
    }

    public static void showAllRecords(){
        try {
            pst=cn.prepareStatement(selectCommand);
            rs = pst.executeQuery(selectCommand);
            while (rs.next()){
                int prodcode = rs.getInt("prodcode");
                String prodname = rs.getString("prodname");
                double price = rs.getDouble("price");
                System.out.println(prodcode+" "+prodname+" "+price);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteRecords(){
        try {
            pst=cn.prepareStatement(deleteCommand);
            pst.setInt(1,101);
            pst.executeUpdate();
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            System.out.println("Exception Caught on delete method ->"+ e.getMessage());
        }
        System.out.println("record deleted");


    }

    public static void  updateRecords(){
        try {
            pst=cn.prepareStatement(updateCommand);
            pst.setString(2,"S25 new");
            pst.setDouble(3,4000.00);
            pst.setInt(1,101);
            pst.executeUpdate();
        } catch (SQLException e) {
//            throw new RuntimeException(e);
            System.out.println("Exception caught in updated method ->"+ e.getMessage());
        }
        System.out.println("record updated");
    }

}
