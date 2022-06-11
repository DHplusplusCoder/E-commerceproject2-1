/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author drew
 */
public class SandwichRegister {
    int RegisterUser(String Username, String Password)
    {
        
        
        System.out.println("Registration Failed: User Already Exists");
        return 0;
        System.out.println("Registration Successful");
        return 1;
    }
}
