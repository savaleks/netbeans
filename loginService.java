package baltictalents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class loginService {
    //creating static method for permission to access another page;
    public static boolean testPermission(String user, String perName){
        if("admin".equals(user)){
            return true;
        }
        if("John".equals(user)&&"viewFirst".equals(perName)){
            return true;
        }
        return "Max".equals(user)&&"viewFirst".equals(perName);
    }
    // method for verifying password 
    public static boolean testLogin(String user, String pass){
        //if nothing input return false;
        if (user==null){
            return false;
        }
        //checking if the user have access to the page; 
        if (user.equals("admin")&&("admin").equals(pass)) {
            return true; 
        }
        if (user.equals("John")&&("john").equals(pass)) {
            return true; 
        }
        if (user.equals("Max")&&("max").equals(pass)) {
            return true; 
        }
        return false;
    }
}
