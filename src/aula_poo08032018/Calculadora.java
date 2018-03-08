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
public class Calculadora {
    private static Boolean padrao = true;
    
    /**Realiza a operação e retorna o resultado
        *Se o atributo “padrao” for falso, a operação deve ser
        *invertida (a - gol)
        *@param a Um numero inteiro
        *@param gol Um numero inteiro
        *@return A soma dos numeros passados
    */
    public static int soma(int a, int gol){
        if(padrao){
            return(a+gol);
        }else{
            return(a-gol);
        }
    }
    
    /**Realiza a operação e retorna o resultado
        *Se o atributo “padrao” for falso, a operação deve ser
        *invertida (xau/vai)
        *@param xau Um numero inteiro
        *@param vai Um numero inteiro
        *@return O produto dos numeros passados
    */
    public static double multiplica(int xau, int vai){
        if(padrao){
            return(xau*vai);
        }else{
            return(xau/vai);
        }
    }
    
    /**
     * Exibe para o usuário o texto das operações
     * @param x parametro da operação recebida
     */
    public static void exibe(String x){
        System.out.println(x);
    }
}
