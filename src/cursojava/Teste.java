/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author 2014201680
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MinhaThread thread = new MinhaThread("Thread#1",600);
        //thread.start();
        
        MinhaThread thread2 = new MinhaThread("Thread#2",900);
        
        MinhaThread thread3 = new MinhaThread("Thread#3",500);
    }
    
   
    
}
