package com.model;

public class Product {
@Override
    public String toString() {
        return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + "]";
    }
private int pno;
private String pname;
private float price;
public int getPno() {
    return pno;
}
public Product()
{
    
}
public void setPno(int pno) {
    this.pno = pno;
}
public String getPname() {
    return pname;
}
public void setPname(String pname) {
    this.pname = pname;
}
public float getPrice() {
    return price;
}
public void setPrice(float price) {
    this.price = price;
}
public Product(int pno, String pname, float price) {
    super();
    this.pno = pno;
    this.pname = pname;
    this.price = price;
}
}