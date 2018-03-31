package model;

/**
 * Created by kyosh on 31/03/2018.
 */

public class User {
    private String id;
    private String username;
    private String password;
    private String lastname;
    private String firstname;

    private User() {
    }

    public User(String id, String username, String password, String lastname, String firstname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
