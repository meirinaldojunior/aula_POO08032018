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
        
        /**
         * Executa métodos de input e output de dados no objeto msg;
         */
        String nomeRecebido;
        Msg msg = new Msg();
        
        nomeRecebido = Msg.prompt("Insira um texto");
        Msg.mostra(nomeRecebido);
        Msg.texto(nomeRecebido);
        Msg.pedeNumero("Insira um número");
        
        /**
         * Realiza equações matemáticas
         * se o valor setado manual do boolean 'padrao' true
         */
               
        Calculadora.exibe(String.valueOf(Calculadora.soma(3, 5)));
        Calculadora.exibe(String.valueOf(Calculadora.soma(8, 1)));
        
        Calculadora.exibe(String.valueOf(Calculadora.multiplica(3, 5)));
        Calculadora.exibe(String.valueOf(Calculadora.multiplica(3, 5)));

        
    }
    
}
