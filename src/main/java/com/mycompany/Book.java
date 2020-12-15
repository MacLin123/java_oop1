package com.mycompany;

/**
 * This class presents book entity.
 * It has methods for getting and setting information about book
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + getName() + ", " +
                "authors=" + getAuthorsInfo() + ", " +
                "price=" + getPrice() + ", " +
                "qty=" + getQty() + "]";

    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            String name = authors[i].getName();
            authorNames.append(name);
            if (i != (authors.length - 1)) {
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }

    private String getAuthorsInfo() {
        StringBuilder authorInfo = new StringBuilder();
        authorInfo.append("Author{");
        for (int i = 0; i < authors.length; i++) {
            String info = "[" + "name=" + authors[i].getName() + ", " +
                    "email=" + authors[i].getEmail() + ", " +
                    "gender=" + authors[i].getGender() + "]";
            authorInfo.append(info);
            if (i != (authors.length - 1)) {
                authorInfo.append(", ");
            } else {
                authorInfo.append("}");
            }
        }
        return authorInfo.toString();
    }
}
