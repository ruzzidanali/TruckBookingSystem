/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import db.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QueryDAO {

    private final Connection connection;
    private int result;

    public QueryDAO() {
        connection = DBConnection.getConnection();
    }

    public int registerAccount(Customer customer) {
        try {
            String mySqlQuery = "insert into customer "
                    + "(cus_email, cus_password, cus_name, cus_ic) "
                    + "values(?,?,?,?)";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, customer.getCusEmail());
            myPs.setString(2, customer.getCusPassword());
            myPs.setString(3, customer.getCusName());
            myPs.setString(4, customer.getCusIc());
            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }
        return result;
    }

    public int verifyAccount(Customer customer) {

        int count = 0;
        String cusEmail = customer.getCusEmail();
        String cusPassword = customer.getCusPassword();
        try {
            Statement myStatement = connection.createStatement();
            String myQuery = "select * from customer WHERE cus_email='" + cusEmail + "'AND cus_password='" + cusPassword + "'";
            ResultSet myRs = myStatement.executeQuery(myQuery);
            while (myRs.next()) {
                customer.setCusId(myRs.getInt(1));
                customer.setCusName(myRs.getString(4));
                customer.setCusIc(myRs.getString(5));
                count++;
            }
        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }
        return count;
    }

    public Customer retrieveOneCustomer(int cusId) {
        Customer customer = new Customer();
        try {
            Statement myStatement = connection.createStatement();
            String myQuery = "select * from customer "
                    + "where cus_id=" + cusId;
            ResultSet myRs = myStatement.executeQuery(myQuery);
            while (myRs.next()) {
                customer.setCusId(myRs.getInt(1));
                customer.setCusEmail(myRs.getString(2));
                customer.setCusPassword(myRs.getString(3));
                customer.setCusName(myRs.getString(4));
                customer.setCusIc(myRs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Exception is :" + e);
        }
        return customer;
    }

    public int updateCustomer(Customer customer) {
        try {

            String mySqlQuery = "update customer "
                    + "set cus_email=?, cus_password=?, cus_name=?, cus_ic=? "
                    + "where cus_id=?";

            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, customer.getCusEmail());
            myPs.setString(2, customer.getCusPassword());
            myPs.setString(3, customer.getCusName());
            myPs.setString(4, customer.getCusIc());
            myPs.setInt(5, customer.getCusId());
            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is:" + e);
        }
        return result;
    }

    public List<Lorry> retrieveAllLorry(int cusId) {
        List<Lorry> lorryById = new ArrayList<Lorry>();
        Lorry lorry;
        try {
            Statement myStatement = connection.createStatement();
            String myQuery = "select * from lorry "
                    + "where cus_id=" + cusId;
            ResultSet myRs = myStatement.executeQuery(myQuery);
            while (myRs.next()) {
                lorry = new Lorry();
                lorry.setLorryId(myRs.getInt(1));
                lorry.setLorryType(myRs.getString(2));
                lorry.setLorryFunc(myRs.getString(3));
                lorry.setLorryRemarks(myRs.getString(4));
                lorry.setLorryPrice(myRs.getString(5));
                lorry.setCusId(myRs.getInt(6));
                lorryById.add(lorry);
            }
        } catch (Exception e) {
            System.out.println("Exception is:" + e);
        }
        return lorryById;
    }

    public int registerLorry(Lorry lorry) {

        try {
            String mySqlQuery = "insert into lorry "
                    + "(lorry_type, lorry_func, lorry_remarks, lorry_price, cus_id) "
                    + "values (?,?,?,?,?)";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, lorry.getLorryType());
            myPs.setString(2, lorry.getLorryFunc());
            myPs.setString(3, lorry.getLorryRemarks());
            myPs.setString(4, lorry.getLorryPrice());
            myPs.setInt(5, lorry.getCusId());
            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }
        return result;
    }

    public Lorry retrieveOneLorry(int lorryId) {
        Lorry lorry = new Lorry();
        try {
            Statement myStatement = connection.createStatement();
            String myQuery = "select * from lorry "
                    + "where lorry_id=" + lorryId;
            ResultSet myRs = myStatement.executeQuery(myQuery);
            while (myRs.next()) {
                lorry.setLorryId(myRs.getInt(1));
                lorry.setLorryType(myRs.getString(2));
                lorry.setLorryFunc(myRs.getString(3));
                lorry.setLorryRemarks(myRs.getString(4));
                lorry.setLorryPrice(myRs.getString(5));
                lorry.setCusId(myRs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }
        return lorry;
    }

    public int updateLorry(Lorry lorry) {
        try {

            String mySqlQuery = "update lorry "
                    + "set lorry_type=?, lorry_func=?, lorry_remarks=?, lorry_price=?, cus_id=? "
                    + "where lorry_id=?";

            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setString(1, lorry.getLorryType());
            myPs.setString(2, lorry.getLorryFunc());
            myPs.setString(3, lorry.getLorryRemarks());
            myPs.setString(4, lorry.getLorryPrice());
            myPs.setInt(5, lorry.getCusId());
            myPs.setInt(6, lorry.getLorryId());
            result = myPs.executeUpdate();
        } catch (Exception e) {
            System.out.println("Exception is:" + e);
        }
        return result;
    }

    public int deleteLorry(int lorryId) {
        try {
            String mySqlQuery = "delete from lorry where lorry_id=?";
            PreparedStatement myPs = connection.prepareStatement(mySqlQuery);
            myPs.setInt(1, lorryId);
            result = myPs.executeUpdate();

        } catch (Exception e) {
            System.out.println("Exception is ;" + e);
        }
        return result;
    }

    public Lorry retrievePriceForLorry(String lorryType) {
        Lorry lorry = new Lorry();
        try {
            Statement myStatement = connection.createStatement();
            String myQuery = "select * from lorry "
                    + "where lorry_type='" + lorryType + "'";
            ResultSet myRs = myStatement.executeQuery(myQuery);
            while (myRs.next()) {
                lorry.setLorryId(myRs.getInt(1));
                lorry.setLorryType(myRs.getString(2));
                lorry.setLorryFunc(myRs.getString(3));
                lorry.setLorryRemarks(myRs.getString(4));
                lorry.setLorryPrice(myRs.getString(5));
                lorry.setCusId(myRs.getInt(6));
            }
        } catch (Exception e) {
            System.out.println("Exception is :" + e);
        }
        return lorry;

    }

}
