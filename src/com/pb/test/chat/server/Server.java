package com.pb.test.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    private final int port;
    private final String name;
    private ServerSocket sSocket;
    private final Set<Client> clients;
    private final BlockingQueue<String> messages;
    private final List<Socket> unregisteredClients;

    public Server(int port, String name) {
        this.port = port;
        this.name = name;
        this.clients = new HashSet<>();
        this.messages = new LinkedBlockingQueue<>();
        this.unregisteredClients = new LinkedList<>();
        try {
            this.sSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        while(true){
            try {
                unregisteredClients.add(sSocket.accept());
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getName() {
        return name;
    }

}
