package com.baobao.model;

import java.util.List;

public class Book {




    private int id;
    private String bookName;
    private String price;

    public Book(){
    }
    public Book(int id, String bookName, String price){
        this.id=id;
        this.bookName = bookName;
        this.price=price;

    }
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getBookName(){return bookName;}
    public void setBookName(String bookName){this.bookName = bookName;}
    public String getPrice(){return price;}
    public void setPrice(String price){this.price= price;}


}
