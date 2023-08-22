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
public class Cart {
    private Product p;
    private int amount;

    public Cart() {
    }

    public Cart(Product p, int amount) {
        this.p = p;
        this.amount = amount;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" + "p=" + p + ", amount=" + amount + '}';
    }
    
    
}
