/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadRunnable;

/**
 *
 * @author 2014201680
 */
public class Teste {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread#1", 500);
        Thread t1 = new Thread(thread1);
        t1.start();
    }
}
