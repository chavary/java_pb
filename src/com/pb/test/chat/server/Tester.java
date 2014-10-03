/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.test.chat.server;

/**
 *
 * @author admin
 */
public class Tester {

    public static void main(String[] args) {

        int startPortNum = 25000;

        for (int i = 0; i < 10; i++) {
            new Server(startPortNum + i, "Server #" + i).run();
        }
    }
}
