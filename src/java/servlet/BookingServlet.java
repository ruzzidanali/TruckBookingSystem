/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import user.Customer;
import user.Lorry;
import user.QueryDAO;

/**
 *
 * @author ASUS
 */
public class BookingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            /* TODO output your page here. You may use following sample code. */
            String theCommand = request.getParameter("command");

            if (theCommand == null) {
                int cusId = 0;
                try {
                    cusId = Integer.parseInt(request.getParameter("cusId"));
                    if (cusId > 0) {
                        theCommand = "LOADCUSTOMER";
                    }
                } catch (Exception e) {
                    if (request.getParameter("lorryCusId") != null) {
                        int lorryCusId = Integer.parseInt(request.getParameter("lorryCusId"));
                        if (lorryCusId > 0) {
                            theCommand = "LISTLORRY";
                        }
                    } else if (request.getParameter("UlorryId") != null) {
                        int vehId = Integer.parseInt(request.getParameter("UlorryId"));
                        if (vehId > 0) {
                            theCommand = "LOADLORRY";
                        }
                    } else if (request.getParameter("DlorryId") != null) {
                        int vehId = Integer.parseInt(request.getParameter("DlorryId"));
                        if (vehId > 0) {
                            theCommand = "DELETELORRY";
                        }
                    }
                }
            }
            switch (theCommand) {

                case "ADDCUSTOMER":
                    addCustomer(request, response);
                    break;
                case "VERIFYCUSTOMER":
                    verifyCustomer(request, response);
                    break;
                case "LOADCUSTOMER":
                    loadCustomer(request, response);
                    break;
                case "UPDATECUSTOMER":
                    updateCustomer(request, response);
                    break;
                case "LISTLORRY":
                    listLorry(request, response);
                    break;
                case "LISTBOOKING":
                    listBooking(request, response);
                    break;
                case "ADDLORRY":
                    if (request.getParameter("lorryCusId") != null) {
                        listLorry(request, response);
                        break;
                    } else {
                        addLorry(request, response);
                    }
                    break;
                case "LOADLORRY":
                    loadLorry(request, response);
                    break;
                case "UPDATELORRY":
                    if (request.getParameter("lorryCusId") != null) {
                        listLorry(request, response);
                        break;
                    } else {
                        updateLorry(request, response);
                    }
                    break;
                case "DELETELORRY":
                    if (request.getParameter("lorryCusId") != null) {
                        listLorry(request, response);
                        break;
                    } else {
                        deleteLorry(request, response);
                    }
                    break;

                case "LOADBOOKING":
                    loadBooking(request, response);
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(BookingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String cusEmail = request.getParameter("cusEmail");
        String cusPassword = request.getParameter("cusPassword");
        String cusPassword2 = request.getParameter("cusPassword2");
        String cusName = request.getParameter("cusName");
        String cusIc = request.getParameter("cusIc");

        if (cusPassword.equals(cusPassword2)) {

            Customer customer = new Customer();
            customer.setCusEmail(cusEmail);
            customer.setCusPassword(cusPassword);
            customer.setCusName(cusName);
            customer.setCusIc(cusIc);
            QueryDAO customerDao = new QueryDAO();
            int result = customerDao.registerAccount(customer);
            if (result > 0) {
                request.setAttribute("theMessage", "Success Add Customer Record");
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            request.setAttribute("theMessage", "The password and re-enterd password does not match! Please try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void verifyCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String cusEmail = request.getParameter("cusEmail");
        String cusPassword = request.getParameter("cusPassword");

        Customer customer = new Customer();
        customer.setCusEmail(cusEmail);
        customer.setCusPassword(cusPassword);

        QueryDAO customerDao = new QueryDAO();
        int result = customerDao.verifyAccount(customer);

        if (result > 0) {
            String cusName = customer.getCusName();
            String cusId = Integer.toString(customer.getCusId());
            request.setAttribute("cusName", cusName);
            request.setAttribute("cusId", cusId);
            request.setAttribute("theMessage", "Successfully Login.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login-main.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("theMessage", "Invalid email and password! Please try again.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void loadCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String cusIds = request.getParameter("cusId");
        int cusId = Integer.parseInt(cusIds);
        request.setAttribute("cusId", cusIds);

        QueryDAO customerDao = new QueryDAO();
        Customer customer = customerDao.retrieveOneCustomer(cusId);
        String cusEmail = customer.getCusEmail();
        String cusName = customer.getCusName();
        String cusIc = customer.getCusIc();
        String cusPassword = customer.getCusPassword();
        if (cusId > 0) {
            request.setAttribute("cusEmail", cusEmail);
            request.setAttribute("cusPassword", cusPassword);
            request.setAttribute("cusIc", cusIc);
            request.setAttribute("cusName", cusName);

            RequestDispatcher dispatcher = request.getRequestDispatcher("view-customer.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String cusEmail = request.getParameter("cusEmail");
        String cusPassword = request.getParameter("cusPassword");
        String cusPassword2 = request.getParameter("cusPassword2");
        String cusName = request.getParameter("cusName");
        String cusIc = request.getParameter("cusIc");
        String cusIds = request.getParameter("cusId");
        int cusId = Integer.parseInt(request.getParameter("cusId"));

        if (cusPassword.equals(cusPassword2)) {

            Customer customer = new Customer();
            customer.setCusEmail(cusEmail);
            customer.setCusPassword(cusPassword);
            customer.setCusName(cusName);
            customer.setCusIc(cusIc);
            customer.setCusId(cusId);

            QueryDAO customerDao = new QueryDAO();
            int result = customerDao.updateCustomer(customer);

            if (result > 0) {
                request.setAttribute("cusName", customer.getCusName());
                cusIds = Integer.toString(customer.getCusId());
                request.setAttribute("cusId", cusIds);
                request.setAttribute("theMessage", "Successfully Update the Customer Record.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("login-main.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            request.setAttribute("theMessage", "The password and re-enterd password does not match! Please try again.");
            request.setAttribute("cusEmail", cusEmail);
            request.setAttribute("cusPassword", cusPassword);
            request.setAttribute("cusName", cusName);
            request.setAttribute("cusIc", cusIc);
            request.setAttribute("cusId", cusIds);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view-customer.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void listLorry(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String lorryCusId = request.getParameter("lorryCusId");
        int cusId = Integer.parseInt(lorryCusId);
        QueryDAO lorryDao = new QueryDAO();
        List<Lorry> allLorry = lorryDao.retrieveAllLorry(cusId);

        request.setAttribute("allLorry", allLorry);
        request.setAttribute("cusId", lorryCusId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-lorry.jsp");
        dispatcher.forward(request, response);
    }

    private void addLorry(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String lorryType = request.getParameter("lorryType");
        String lorryFunc = request.getParameter("lorryFunc");
        int lorryCusId = Integer.parseInt(request.getParameter("cusId"));
        try {
            String lorryPrice = request.getParameter("lorryPrice");
            String lorryRemarks = request.getParameter("lorryRemarks");

            Lorry lorry = new Lorry();
            lorry.setLorryType(lorryType);
            lorry.setLorryFunc(lorryFunc);
            lorry.setLorryRemarks(lorryRemarks);
            lorry.setLorryPrice(lorryPrice);
            lorry.setCusId(lorryCusId);

            QueryDAO lorryDao = new QueryDAO();
            int result = lorryDao.registerLorry(lorry);

            if (result > 0) {
                request.setAttribute("theMessage", "The lorry record is successfully added.");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/BookingServlet?lorryCusId=" + lorryCusId);
                dispatcher.forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("theMessage", "You have to input the details in order to add a lorry record. Please try again!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/BookingServlet?lorryCusId=" + lorryCusId);
            dispatcher.forward(request, response);
        }

    }

    private void loadLorry(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int lorryId = Integer.parseInt(request.getParameter("UlorryId"));
        QueryDAO lorryDao = new QueryDAO();
        Lorry lorry = lorryDao.retrieveOneLorry(lorryId);
        request.setAttribute("lorry", lorry);
        RequestDispatcher dispatcher = request.getRequestDispatcher("lorry-update.jsp");
        dispatcher.forward(request, response);
    }

    private void updateLorry(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String lorryType = request.getParameter("lorryType");
        String lorryFunc = request.getParameter("lorryFunc");
        String lorryRemarks = request.getParameter("lorryRemarks");
        String lorryPrice = request.getParameter("lorryPrice");
        int lorryCusId = Integer.parseInt(request.getParameter("cusId"));
        int lorryId = Integer.parseInt(request.getParameter("lorryId"));

        Lorry lorry = new Lorry();
        lorry.setLorryType(lorryType);
        lorry.setLorryFunc(lorryFunc);
        lorry.setLorryRemarks(lorryRemarks);
        lorry.setLorryPrice(lorryPrice);
        lorry.setCusId(lorryCusId);
        lorry.setLorryId(lorryId);

        QueryDAO lorryDao = new QueryDAO();
        int result = lorryDao.updateLorry(lorry);
        if (result > 0) {
            request.setAttribute("theMessage", "The lorry record is successfully updated.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/BookingServlet?lorryCusId=" + lorryCusId);
            dispatcher.forward(request, response);
        }
    }

    private void deleteLorry(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int lorryId = Integer.parseInt(request.getParameter("DlorryId"));
        QueryDAO lorryDao = new QueryDAO();
        Lorry lorry = lorryDao.retrieveOneLorry(lorryId);
        int lorryCusId = lorry.getCusId();
        int result = lorryDao.deleteLorry(lorryId);

        request.setAttribute("theMessage", "The lorry record is successfully deleted.");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/BookingServlet?lorryCusId=" + lorryCusId);
        dispatcher.forward(request, response);
    }

    private void listBooking(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String lorryCusId = request.getParameter("lorryCusId");
        int cusId = Integer.parseInt(lorryCusId);
        QueryDAO lorryDao = new QueryDAO();
        List<Lorry> allLorry = lorryDao.retrieveAllLorry(cusId);

        request.setAttribute("allLorry", allLorry);
        request.setAttribute("cusId", lorryCusId);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/booking-main.jsp");
        dispatcher.forward(request, response);
    }

    private void loadBooking(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String lorryType = request.getParameter("lorryType");
        request.setAttribute("lorryType", lorryType);
        String date = request.getParameter("date");
        request.setAttribute("date", date);
        String address = request.getParameter("address");
        request.setAttribute("address", address);
        String lorryPrice = request.getParameter("lorryPrice");
        request.setAttribute("lorryPrice", lorryPrice);
        String lorryFunc = request.getParameter("lorryFunc");
        request.setAttribute("lorryFunc", lorryFunc);
        String lorryRemarks = request.getParameter("lorryRemarks");
        request.setAttribute("lorryRemarks", lorryRemarks);

        QueryDAO lorryDao = new QueryDAO();
        Lorry lorry = lorryDao.retrievePriceForLorry(lorryType);
        

        RequestDispatcher dispatcher = request.getRequestDispatcher("/get-quotation.jsp");
        dispatcher.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
