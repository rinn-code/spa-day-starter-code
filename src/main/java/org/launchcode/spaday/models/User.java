package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min=5, max=15)
    private String username;
    @Email
    @Size(min=6)
    private String email;
    @NotBlank
    private String password;
//    @NotBlank
//    private String verify;
    @NotNull(message="Passwords do not match")
    private String verifyPassword;
    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
       // this.verify = verify;String verify
    }
    private void checkPassword(String password, String verifyPassword){
        if(!password.equals(verifyPassword) || password.equals(null) || verifyPassword.equals(null)){
            verifyPassword = null;
        }
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword(password, verifyPassword);
    }

//    public String getVerify() {
//        return verify;
//    }
//
//    public void setVerify(String verify) {
//        this.verify = verify;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword(password, verifyPassword);
    }


}
