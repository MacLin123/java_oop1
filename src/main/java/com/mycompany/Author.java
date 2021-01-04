package com.mycompany;

/**
 * This class presents employee Author.
 * It has methods for getting and setting information about Author
 *
 * @author Mikhail Kurakin
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (gender != author.gender) return false;
        if (!name.equals(author.name)) return false;
        return email != null ? email.equals(author.email) : author.email == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) gender;
        return result;
    }
}
