/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula09;

/**
 *
 * @author ferna
 */
public class Aula09 {

    public static void main(String[] args) {
        /* Declarações das variáveis */
        // convenção Java
        int idade = 26;
        String nome = "Fernando"; // String não é um tipo primitivo, mas sim uma classe
        String nomeDoMeuCachorro = "Thor";
        String ano2014 = "2014";
        
        // aceito, mas não utilizado
        int _idade;
        int $idade;
        
        // não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;
        
        idade = 30;
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        // má prática
        int a = 10;
        String b = "Fernando";
        
    }
}
