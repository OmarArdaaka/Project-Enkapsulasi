/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.person_settergetter;

/**
 *
 * @author SMK TELKOM 023
 */
public class Person_SetterGetter {

    public static void main(String[] args) {
        person mPerson = new person();
        
        mPerson.setName("Omar");
        System.out.println("nama saya: " + mPerson.getName());
        
        mPerson.setPassword("halo123");
        System.out.println("Password : " + mPerson.getPassword());
        
        mPerson.setUserName("omaravan");
        System.out.println("Username : " + mPerson.getUserName());
        
        
                
    }
}
