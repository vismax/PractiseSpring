package com.baobao.repo;

import com.baobao.model.Book;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.omg.CORBA.ORB.init;

@Repository

public class BookRepository {
    private static final String DB_URL = "jdbc:mysql://localhost/baodata";


    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "12345678";

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Book> queryBook(String bookName ){
        List<Book> books = new ArrayList();
        try {
            PreparedStatement statement=connection.prepareStatement("select * from BookMange where bookName =?");
            statement.setString(1,bookName);
             ResultSet set= statement.executeQuery();

        while(set.next()){
            Book book = new Book();
            book.setId(set.getInt("id"));
            book.setBookName(set.getString("bookname"));
            book.setPrice(set.getString("price"));

            books.add(book);

        }
            statement.close();
            set.close();

            return books;
        }catch (Exception e){
            e.printStackTrace();
            return books;
        }
    }


    public static void insertBook(Book book){
        try {
            PreparedStatement statement=connection.prepareStatement("INSERT INTO BookManage(Bookname,Price,UserName)Values(?,?);");
            statement.setString(1,book.getBookName());
            statement.setString(2,book.getPrice());

            statement.execute();
            statement.close();



        }catch(Exception e){
            e.printStackTrace();
        }

    }



}
