/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonlogin;

/**
 *
 * @author igor_
 */
public class Login {
    private static Boolean isLoged;
    private static Login contaLogada;
    private String name;
    private String password;
    private static final GenerateChars generate = new GenerateChars();
    
    private Login(String name, String password){
        this.name = name;
        this.password = password;
    };
    
    public static Login logar(String name, String password){
        if(isLoged == null){
            isLoged = true;
            contaLogada = new Login(name, password);
            System.out.println(name+", "+password);
            return contaLogada;
        }
        System.out.println(contaLogada.getName()+", "+contaLogada.getSenha());
        return contaLogada;
    }
    
    public static synchronized void logout() throws Exception{
        if(isLoged != null){
            isLoged = null;
        }else{
            throw new Exception();
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }
    
    public static Login getContaLogada() {
        return contaLogada;
    }

    public static void setContaLogada(Login aContaLogada) {
        contaLogada = aContaLogada;
    }
}
