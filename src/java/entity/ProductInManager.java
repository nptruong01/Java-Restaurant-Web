/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Pisano
 */
public class ProductInManager {
    private int id;
    private String name;
    private String image;
    private double price;
    private String title;
    private String description;
    private int CategoryID;
    private int SellerID;
    private int amount;
    
    public ProductInManager() {
    }

    public ProductInManager(int id, String name, String description, int price, String imageLink, int CategoryID, int SellerID, int amount) {
        this.id=id;
        this.name=name;
        this.image=image;
        this.price=price;
        this.title=title;
        this.description=description;
        this.CategoryID = CategoryID;
        this.SellerID = SellerID;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getSellerID() {
        return SellerID;
    }

    public void setSellerID(int SellerID) {
        this.SellerID = SellerID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
        public String getPriceWithDot() {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
    }

    @Override
    public String toString() {
        return "ProductInManager{" + "id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", title=" + title + ", description=" + description + ", CategoryID=" + CategoryID + ", SellerID=" + SellerID + ", amount=" + amount + '}';
    }
        
}
