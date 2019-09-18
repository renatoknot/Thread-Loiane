/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteProva;

/**
 *
 * @author 2014201680
 */
public class SequenciaNumero extends Thread {
    public static void main(String[] args) {
        SequenciaNumero t = new SequenciaNumero();
        Thread x = new Thread(t);
        x.start();
    }
    public void run() {
        for(int i=0;i<5;i+=2){
            System.out.println(i+"**");
        }
    }
}
