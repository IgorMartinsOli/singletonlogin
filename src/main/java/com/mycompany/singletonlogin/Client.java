/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.singletonlogin;

import java.util.Scanner;

/**
 *
 * @author igor_
 */
public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aux;
        GenerateChars generate = new GenerateChars();
        String codigo = generate.generate();
        
        System.out.println("Digite o codigo: "+codigo);
        aux = scan.next();
        
        if(aux == null ? codigo == null : aux.equals(codigo)){
            String name;
        String password;
        
        System.out.println("Digite seu nome");
        name = scan.next();
        
        System.out.println("Digite seu password");
        password = scan.next();
        
        Login.logar(name, password);

        Login.logar("teste1", "teste2");
        try{
            Login.logout();
            System.out.println("fez logout");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        Login.logar("teste1", "teste2");
        }else{
            System.out.println("Codigo incorreto: "+aux+", "+codigo);
        }
    }
}
