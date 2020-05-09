package models;

public class User {

    //Thease data members are avialbale everywhere for open use
     private int userId;
     private String userName;

     public User(){
         this.userId=222;
         this.userName="Bhavna";
     }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
