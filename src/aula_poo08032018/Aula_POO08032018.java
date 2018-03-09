/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_poo08032018;

import javafx.application.Application;
import javax.swing.JOptionPane;

/**
 *
 * @author meirinaldojunior
 */
public class Aula_POO08032018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Executa métodos de input e output de dados no objeto msg;
         */
        String nomeRecebido;
        Msg msg = new Msg();
        
        nomeRecebido = Msg.prompt("Insira um texto");
        Msg.mostra(nomeRecebido);
        Msg.texto(nomeRecebido);
        Msg.pedeNumero("Insira um número");
        
        //Chamo a mensagem de início do segundo teste!
        JOptionPane.showMessageDialog(null, "Agora iniciaremos os testes da calculadora");
        
        /**
         * Realiza equações matemáticas
         * se o valor setado manual do boolean 'padrao' true
         */
        
        Calculadora calc = new Calculadora();
        
        //Define o tipo do calculo
        int op = JOptionPane.showConfirmDialog(null, "Deseja utilizar o modo padrão de cálculo?");
        if(op == JOptionPane.YES_OPTION){
            calc.mudaPadrao(true);
        }else if(op == JOptionPane.NO_OPTION){
            calc.mudaPadrao(false);
        }else{
            JOptionPane.showMessageDialog(null, "Você cancelou a operação");
            System.exit(0);
        }
        
        calc.exibe(String.valueOf(calc.soma(calc.solicitaNumero("Digite um número para soma"), 
                                            calc.solicitaNumero("Digite outro número"))));
               
        calc.exibe(String.valueOf(calc.multiplica(calc.solicitaNumero("Digite um número para Multiplicação"), 
                                                  calc.solicitaNumero("Digite outro número"))));

        
    }
    
}
