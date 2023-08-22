/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Cart;
import entity.Ship;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "BuyControl", urlPatterns = {"/buy"})
public class BuyControl extends HttpServlet {

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

        }
     public String getPriceWithDot(int price) {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
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
       response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(); //DÃ¹ng session Ä‘á»ƒ gá»i Ä‘áº¿n id
        Account a = (Account) session.getAttribute("acc"); //Gá»i Ä‘áº¿n account -> Pháº£i Ã©p kiá»ƒu Ä‘á»ƒ thÃ nh Object

        DAO CartDAO = new DAO();
        DAO ShipDAO = new DAO();
        List<Cart> listCart = CartDAO.getCart(a.getId()); //Truyá»n vÃ o id cá»§a account
        
        if (listCart.size() == 0) {
            response.sendRedirect("show");
        }
        
        //Get All Ships information
        List<Ship> listShip = ShipDAO.getAllShip();
        
        int total = 0;
        for (Cart cart : listCart) {
            total += cart.getP().getPrice() * cart.getAmount();
        }

        request.setAttribute("listCart", listCart);
        request.setAttribute("total", getPriceWithDot(total));
        request.setAttribute("listShip", listShip);
        request.getRequestDispatcher("Buy.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession(); //DÃ¹ng session Ä‘á»ƒ gá»i Ä‘áº¿n id
        Account a = (Account) session.getAttribute("acc"); //Gá»i Ä‘áº¿n account -> Pháº£i Ã©p kiá»ƒu Ä‘á»ƒ thÃ nh Object

        DAO CartDAO = new DAO();
        List<Cart> listCart = CartDAO.getCart(a.getId()); //Truyá»n vÃ o id cá»§a account
        
        int total = 0;
        for (Cart cart : listCart) {
            total += cart.getP().getPrice() * cart.getAmount();
        }
        
        String cityName = request.getParameter("cityName");
        DAO ShipDAO = new DAO();
        int shipValue = ShipDAO.getShipPriceByCityName(cityName);

        PrintWriter out = response.getWriter();
        out.println(getPriceWithDot(total + shipValue) + " VND");
        
        request.setAttribute("total", getPriceWithDot(total + shipValue));
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
