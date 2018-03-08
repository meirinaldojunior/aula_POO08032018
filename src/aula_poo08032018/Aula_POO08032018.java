/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_poo08032018;

/**
 *
 * @author meirinaldojunior
 */
public class Aula_POO08032018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeRecebido;
        Msg msg = new Msg();
        
        nomeRecebido = msg.prompt("Insira um texto");
        msg.mostra(nomeRecebido);
        msg.texto(nomeRecebido);
        msg.pedeNumero("Insira um número");
    }
    
}
