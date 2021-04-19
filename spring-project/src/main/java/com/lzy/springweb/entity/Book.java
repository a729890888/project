package com.lzy.springweb.entity;

public class Book {
    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private void init(){
        System.out.println("book初始化方法调用..");
    }

    private void destroy(){
        System.out.println("book销毁方法调用..");
    }
}
