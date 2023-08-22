/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Cart;
import entity.Category;
import entity.Product;
import entity.ProductInManager;
import entity.Ship;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pisano
 */
public class DAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>(); 
        String query ="select * from product";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6)));
                
            }
        }catch (Exception e){
            
        }
        
        return list;
    }
     
        
    
    public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>(); 
        String query ="select * from Category";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                list.add(new Category(rs.getInt(1),
                rs.getString(2)));
                
            }
        }catch (Exception e){
            
        }
        
        return list;
    }
    public Product getLast(){
        String query ="select top 1* from product\n"
                +"order by id desc";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()){
                return new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6));
                
            }
        }catch (Exception e){
            
        }
        
        return null;
    }
    public List<Product> getProductByCID(String cid){
        List<Product> list = new ArrayList<>(); 
        String query ="select * from product\n"
                +"where cateID =?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,cid);
            rs=ps.executeQuery();
            while (rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6)));
                
            }
        }catch (Exception e){
            
        }
        
        return list;
    }
        public Product getProductByID(String id){
        String query ="select * from product\n"
                +"where id =?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                return new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6));
                
            }
        }catch (Exception e){
            
        }
        return null;
     }
     public List<Product> searchByName(String txtSearch){
        List<Product> list = new ArrayList<>(); 
        String query ="select * from product\n"
                +"where [name] like ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%"+txtSearch+"%");
            rs=ps.executeQuery();
            while (rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6)));
                
            }
        }catch (Exception e){
            
        }
        
        return list;
    }
    public Account login(String user, String pass){
        String query ="select * from account\n"
                +"where [user] = ?\n"
                +"and pass = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            rs=ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
                
            }
        }catch (Exception e){
            
        }
        return null;
    }
    public Account checkAccountExist(String user){
        String query ="select * from account\n"
                +"where [user] = ?\n"
                +"and pass = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs=ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
                
            }
        }catch (Exception e){
            
        }
        return null;
    }
    
            public Account checkTaiKhoan(String user){
        String query ="select * from account\n"
                +"where [user] = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs=ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
                
            }
        }catch (Exception e){
            
        }
        return null;
    }
                     public Account checkMatKhau(String pass){
        String query ="select * from account\n"
                +"where [user] = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,pass);
            rs=ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
                
            }
        }catch (Exception e){
            
        }
        return null;
    }
    
    
    public void signup(String user, String pass){
        String query = "insert into account\n"
                +"values(?,?,0,0)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            //Do insert ko tra ve gia tri nen:
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }

    public List<Product> getProductSellCID(int id){
        List<Product> list = new ArrayList<>(); 
        String query ="SELECT * from product\n"
                    +"where sell_ID =?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            while (rs.next()){
                list.add(new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6)));
                
            }
        }catch (Exception e){
            
        }
        
        return list;
    }
    
    public void deleteProduct(String pid){
        String query = "delete from product\n"
                +"where id =?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,pid);
            //Do insert ko tra ve gia tri nen:
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    public void insertProduct(String name, String image, String price,
            String title,String description, String category, int sid, String amount){
        String query ="INSERT [dbo].[product] \n"
                +"( [name], [image], [price], [title], [description], [cateID], [sell_ID],Amount) \n"
                +"VALUES(?,?,?,?,?,?,?,?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,image);
            ps.setString(3,price);
            ps.setString(4,title);
            ps.setString(5,description);
            ps.setString(6,category);
            ps.setInt(7,sid);
            ps.setString(8,amount);
            
            //Do insert ko tra ve gia tri nen:
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
        public void editProduct(String name, String image, String price,
            String title,String description, String category, String amount ,String pid){
       // String query ="update product \n"
        //        +"set [name]=?,\n)"
          //      +"[image]=?,\n)"
            //    +"price=?,\n)"
              //  +"title=?,\n)"
                //+"[description]=?,\n)"
            //    +"cateID=?\n)"
              //  +"where id = ?";
        String query =  "update product \n" 
                +"set [name] = ?,\n"
                +"[image]=?,\n"
                +"price=?,\n"
                +"title=?,\n"
                +"[description]=?,\n"
                +"cateID=?,\n"
                +"amount=?\n"
                +"where id = ?";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,image);
            ps.setString(3,price);
            ps.setString(4,title);
            ps.setString(5,description);
            ps.setString(6,category);
            ps.setString(8,amount);
            ps.setString(7,pid);
            
            //Do insert ko tra ve gia tri nen:
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
        
        /////////ACCOUNT DAO
                    public List<Account> getAllAccounts() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteAccount(String id) {
        String query = "delete from Account where uID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return;
    }

    public void editAccount(String id, String user, String pass, String isSell, String isAdmin) {
        String query = "UPDATE Account\n"
                + "SET [user] = ?,\n"
                + "pass = ?,\n"
                + "isSell = ?,\n"
                + "isAdmin = ?\n"
                + "WHERE uID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, isSell);
            ps.setString(4, isAdmin);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public Account getAccountByID(String id) {
        String query = "select * from Account where uID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public int countAllAccount() {
        String query = "select count(*) from Account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    /////CART
        public List<Cart> getCart(int id) {
        List<Cart> list = new ArrayList<>();
//        String query = "select Product.ProductID, Product.ProductName, Product.Description, Product.Price, Product.imageLink, Cart.Amount\n"
//                + "from Cart inner join Product\n"
//                + "on Cart.ProductID = Product.ProductID\n"
//                + "where Cart.UserID = ?";
        String query ="SELECT p.id,p.name,p.image,p.price,p.title,p.description,c.Amount\n"
                   +" FROM product as p \n"
                    +"INNER JOIN Cart as c \n"
                     +  "ON c.ProductID = p.id Where c.AccountID=?";
        try {
               conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getString(5),
                rs.getString(6));;
                int amount = rs.getInt(7);
                list.add(new Cart(p, amount));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public int countCart(int id) {
        int count = 0;
        String query = "select count(*)\n"
                + "from Cart inner join Product \n"
                + "on Cart.ProductID = Product.id\n"
                + "where Cart.AccountID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return count;
    }

    public int countAllCart() {
        int count = 0;
        String query = "select count(*)\n"
                + "from Cart group by AccountID";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return count;
    }

    //Function returns a boolean to inform whether the product is added to cart or not
    //If Product is out of stock
    public boolean addToCart(int accountID, int productID, int amount) {
        //Check if Product to add already has at least 1 in cart
        DAO dao = new DAO();

        //Before add to cart: check if product is out of stock
        if (countAmountProduct(productID) == 0) {
            return false;
        } else {
            List<Cart> list = dao.getCart(accountID);
            for (Cart cart : list) {
                if (cart.getP().getId() == productID) {
                    String query = "update Cart\n"
                            + "set amount = ?\n"
                            + "where AccountID = ? and ProductID = ?";
                    try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
                        ps.setInt(1, cart.getAmount() + amount);
                        ps.setInt(2, accountID);
                        ps.setInt(3, productID);
                        ps.executeUpdate();
                    } catch (Exception e) {
                    }
                    //Call to delete1amount
                    dao.delete1Amount(productID);
                    return true;
                }
            }
            //Else: Add 1 product into cart
            String query = "INSERT INTO Cart VALUES (?, ?, ?)";
            try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
                ps.setInt(1, accountID);
                ps.setInt(2, productID);
                ps.setInt(3, amount);
                ps.executeUpdate();
            } catch (Exception e) {
            }
            delete1Amount(productID);
            return true;
        }
    }
    
    
     public boolean buy(int accountID, int productID, int amount) {
        //Check if Product to add already has at least 1 in cart
        DAO dao = new DAO();

        //Before add to cart: check if product is out of stock
        if (countAmountProduct(productID) == 0) {
            return false;
        } else {
            List<Cart> list = dao.getCart(accountID);
            for (Cart cart : list) {
                if (cart.getP().getId() == productID) {
                    String query = "update Cart\n"
                            + "set amount = ?\n"
                            + "where AccountID = ? and ProductID = ?";
                    try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
                        ps.setInt(1, cart.getAmount() + amount);
                        ps.setInt(2, accountID);
                        ps.setInt(3, productID);
                        ps.executeUpdate();
                    } catch (Exception e) {
                    }
                    //Call to delete1amount
                    dao.deleteAmount(amount,productID);
                    return true;
                }
            }
            //Else: Add 1 product into cart
            String query = "INSERT INTO Cart VALUES (?, ?, ?)";
            try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
                ps.setInt(1, accountID);
                ps.setInt(2, productID);
                ps.setInt(3, amount);
                ps.executeUpdate();
            } catch (Exception e) {
            }
            deleteAmount(amount,productID);
            return true;
        }
    }
    
        

    

    //Minus 1 amount from Product after 1 Customer Add to cart
    public void delete1Amount(int ProductID) {
        String query = "update Product\n"
                + "set Amount = Amount - 1\n"
                + "where ID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ProductID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
        //Minus 1 amount from Product after 1 Customer Add to cart
    public void deleteAmount( int Quantity,int ProductID) {
        String query = "UPDATE P \n"
                        + "set p.Amount = p.Amount - ?\n"
                        + "FROM Product P\n"
                        + "INNER JOIN\n"
                        + "Cart c\n"
                        + "ON p.ID = c.ProductID\n"
                        + "where P.ID=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, Quantity);
            ps.setInt(2, ProductID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    //Count the amount of a product to see if it is out of stock
    public int countAmountProduct(int ProductID) {
        String query = "select amount\n"
                + "from Product\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ProductID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int countNumCart(int userID) {
        String query = "select count(*) from Cart where AccountID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void deleteCart(int UserID) {
        String query = "delete from Cart where AccountID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, UserID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProductCart(int UserID, int ProductID) {
        String query = "delete from cart where AccountID = ? and ProductID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, UserID);
            ps.setInt(2, ProductID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    //////////SHIP DAO
        public List<Ship> getAllShip() {
        List<Ship> list = new ArrayList<>();
        String query = "select * from Ship";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Ship(rs.getInt(1),rs.getString(2), rs.getInt(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public int getShipPriceByCityName(String cityName) {
        String query = "select ShipPrice from Ship where CityName = ?";
        try {
           conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cityName);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
        public Ship getShipPriceByID(String id) {
        String query = "select ShipPrice from Ship where id = ?";
        try {
           conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                return new Ship(rs.getInt(1),
                rs.getString(2),        
                rs.getInt(3));
                
            }
        } catch (Exception e) {
        }
        return null;
    }

   //////ORDER
        public void insertOrder(String name, String image, String price,
            String title,String description, String category, int sid, String amount){
        String query ="INSERT [dbo].[product] \n"
                +"( [name], [image], [price], [title], [description], [cateID], [sell_ID],Amount) \n"
                +"VALUES(?,?,?,?,?,?,?,?)";
        try{
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,image);
            ps.setString(3,price);
            ps.setString(4,title);
            ps.setString(5,description);
            ps.setString(6,category);
            ps.setInt(7,sid);
            ps.setString(8,amount);
            
            //Do insert ko tra ve gia tri nen:
            ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    }
    
    public static void main(String[] args){
         DAO dao =new DAO();
         List<Product> list =dao.getAllProduct();
         List<Category> listCC =dao.getAllCategory();
         
         
         for (Category o :listCC)
             System.out.println(o);
         
         //for (Product o :list)
             //System.out.println(o);
             
         
     }
}
