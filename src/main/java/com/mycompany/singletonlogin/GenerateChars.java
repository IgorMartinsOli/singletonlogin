/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonlogin;

import java.util.Random;

/**
 *
 * @author igor_
 */
public class GenerateChars {
    
    public String generate(){
    Random random = new Random();
    String setOfCharacters = "abcdefghijklmnopqrstuvxyz1234567890!#%&-/@";
    String cod = "";
    
    for(int i = 0; i < 6; i++){
        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);
        cod = (cod+""+randomChar);
    }
    return cod;
    }
    
}
