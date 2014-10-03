/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.test.chat.server;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

/**
 *
 * @author admin
 */
public class Client {

        private final String name;
        private final Socket socket;

        public Client(String name, Socket socket) {
            this.name = name;
            this.socket = socket;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 19 * hash + Objects.hashCode(this.name);
            hash = 19 * hash + Objects.hashCode(this.socket);
            return hash;
        }

        @Override
        public String toString() {
            return "Client{" + "name=" + name + ", socket=" + socket + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Client other = (Client) obj;
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.socket, other.socket)) {
                return false;
            }
            return true;
        }

        public void close() throws IOException {
            if (this.socket != null) {
                this.socket.close();
            }
        }

        public boolean isClosed() {
            return this.socket.isClosed();
        }
    }