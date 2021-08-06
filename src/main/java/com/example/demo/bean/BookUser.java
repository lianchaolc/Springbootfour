//package com.example.demo.bean;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import java.io.Serializable;
//
//public class BookUser implements Serializable {
//
//    public BookUser(String userName, String passWord, String email, String nickName, String regTime) {
//        this.userName = userName;
//        this.passWord = passWord;
//        this.email = email;
//        this.nickName = nickName;
//        this.regTime = regTime;
//    }
//
//    public BookUser() {
//    }
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    @Column(nullable = false, unique = true)
//    private String userName;
//    @Column(nullable = false)
//    private String passWord;
//    @Column(nullable = false, unique = true)
//    private String email;
//    @Column(nullable = true, unique = true)
//    private String nickName;
//
//
//    @Column(nullable = false)
//    private String regTime;
//
////    public Book(String userName, String passWord, String email, String nickName, String regTime) {
////        this.userName = userName;
////        this.passWord = passWord;
////        this.email = email;
////        this.nickName = nickName;
////        this.regTime = regTime;
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassWord() {
//        return passWord;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public String getRegTime() {
//        return regTime;
//    }
//
//    public void setRegTime(String regTime) {
//        this.regTime = regTime;
//    }
////    public String getBookid() {
////        return bookid;
////    }
////
////    public void setBookid(String bookid) {
////        this.bookid = bookid;
////    }
////
////    public String getBookname() {
////        return bookname;
////    }
////
////    public void setBookname(String bookname) {
////        this.bookname = bookname;
////    }
////
////    public Book(String bookid, String bookname) {
////        this.bookid = bookid;
////        this.bookname = bookname;
////    }
////
////    public Book() {
////    }
////
////    private String bookid;
////    private String bookname;
//}
