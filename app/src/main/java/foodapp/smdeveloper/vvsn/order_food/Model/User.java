package foodapp.smdeveloper.vvsn.order_food.Model;


public class User {
    private String Name;
    private String Password;
    private String Phonenumber;

    public User() {
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
       // Phonenumber = phonenumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }


}
