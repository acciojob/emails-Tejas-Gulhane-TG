package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean vis []=new boolean[5];
        if(oldPassword==this.password){
            if(newPassword.length()>=7){
                vis[0]=true;
                for(int i=0; i<newPassword.length(); i++){
                    if(newPassword.charAt(i)>=65 && newPassword.charAt(i)<=90){
                        vis[1]=true;
                    }
                    if(newPassword.charAt(i)>=97 && newPassword.charAt(i)<=122){
                        vis[2]=true;
                    }
                    if(newPassword.charAt(i)>=48 && newPassword.charAt(i)<=57){
                        vis[3]=true;
                    }
                    if(newPassword.charAt(i)>=32 || newPassword.charAt(i)<=47 || newPassword.charAt(i)>=58 || newPassword.charAt(i)<=64 || newPassword.charAt(i)>=91 || newPassword.charAt(i)<=96 || newPassword.charAt(i)>=123 || newPassword.charAt(i)<=126){
                        vis[4]=true;
                    }
                }
            }
            if(vis[0]==true && vis[1]==true && vis[2]==true && vis[3]==true && vis[4]==true){
                this.password=newPassword;
                System.out.println("Password has been changed");
            }
            else{
                System.out.println("Password not contain all character");
            }
        }
        else{
            System.out.println("Old Password Not matched");
        }
    }
}
