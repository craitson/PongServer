/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongserver;


/**
 *
 * @author Derlei
 */
public class tst {

    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Jogo());
        t1.start();
    }
}