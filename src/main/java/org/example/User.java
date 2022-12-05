package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGeneratePolicy) {
        String password = passwordGeneratePolicy.generatePassword();
        int length = password.length();
        if (8 <= length && length <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
