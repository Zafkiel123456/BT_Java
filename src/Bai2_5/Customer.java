package Bai2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;
    private int discount;
    public Customer(int id, String name, char gender,int discount) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.discount = discount;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        return name+"(" + id +")";
    }
}
