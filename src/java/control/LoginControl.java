/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pisano
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        DAO dao =new DAO();
        Account a = dao.login(username, password);
        Account b =dao.checkTaiKhoan(username);
        Account c =dao.checkMatKhau(password);
//        if(a == null){
//            request.setAttribute("mess","Sai mat khau hoac tai khoan. Vui long thu lai!!");
//            request.getRequestDispatcher("Login.jsp").forward(request, response);
//        }else{
//        if(b != null && c != null){
//            //Hien logout khi dang nhap thanh cong
//            HttpSession session = request.getSession();
//            session.setAttribute("acc",a);
//            session.setMaxInactiveInterval(2000);
//            response.sendRedirect("home");
//        }
        if(a==null){
            if(b!=null && c==null){
                request.setAttribute("mess","Wrong password. Try again!!");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
            if( b==null ){
                request.setAttribute("mess","Couldn't find your Account");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("acc",a);
            session.setMaxInactiveInterval(2000);
            response.sendRedirect("home");
        }
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
