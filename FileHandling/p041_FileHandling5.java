package FileHandling;/*
1. What if the superclass is serializable?
    In this case all its subclasses are automatically serialized.
2. What is the super class is not serialized ?

 */


import java.io.*;

public class p041_FileHandling5 {
    //Searialization : to persisit the java objects in the form of sequence of bytes.

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustId(101);
        customer.setCustName("King");
        Address address  = new Address("China Town");
        customer.setAddress(address);

        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("customer.ser");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.close();
            fileOut.close();
            System.out.println("FileHandling.Customer Object Serialization.");
        } catch (IOException e) {
            e.printStackTrace();
        }

       Customer cust1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("customer.ser");
            ObjectInputStream inStream = new ObjectInputStream(fileIn);
            cust1= (Customer) inStream.readObject();
            inStream.close();
            fileIn.close();
            System.out.println(cust1.address.getCity());

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Address implements Serializable{
    String street;
    String city;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

class Customer implements Serializable {
    private static final long serialVersionUID = 1L; //Marker Interface

    int custId;
    String custName;
    transient Address address;

    public int getCustId() {
        return custId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
