/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.test.chat.server;

import java.net.Socket;

/**
 *
 * @author admin
 */
public class ServerSocketWorker extends Thread {

    private final Socket socket;

    public ServerSocketWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        
    }

}
