/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_poo08032018;

import javax.swing.JOptionPane;

/**
 *
 * @author meirinaldojunior
 */
public class Msg {
    
   /**
    * Exibe uma caixa de diálogo, para input de dados
    * @param x uma string com o texto a ser exibido na caixa;
    * @return uma string com o odado digitado pelo usuário;
    */
    
    
    /**
     * Método construtor da classe
     */
    Msg(){
        
    }
    
    public static String prompt(String x){
        return JOptionPane.showInputDialog(x);
    }
    
    /**
     * exibe uma caixa de diálogo com uma mensagem
     * @param x Uma String com o texto a ser exibido na caixa
     */
    public static void mostra(String x){
        JOptionPane.showMessageDialog(null, x);
    }  
    
    /**
     * Da saída de um texto na tela;
     * @param x  Uma String com o texto a ser exibido na tela;
     */
    public static void texto (String x){
        System.out.println(x);
    }
    
    /**
     * Exibe uma caixa de diálogo para input de dados;
     * @param x Uma String com o texto a ser exibido na caixa
     * @return Um int com o numero digitado pelo usuário.
     */
    public static int pedeNumero(String x){
        int num = 0;
        
        try {
            num = Integer.parseInt(JOptionPane.showInputDialog(x));
            JOptionPane.showMessageDialog(null, num);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você inseriu um tipo de dado incorreto");
        }
        return num;
    }
}