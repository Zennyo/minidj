package com.mlh.zenyo.minidj;

import java.io.ObjectOutputStream;
import java.net.Socket;

import logic.Item;


/**
 * Created by Zenyo on 03.12.2016.
 */

public class TCPClient{
    String ip;
    int port;
    Socket clientSocket;
    ObjectOutputStream outputToServer;




    public TCPClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
        try {
            clientSocket = new Socket(ip, port);
            outputToServer = new ObjectOutputStream(clientSocket.getOutputStream());
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }

    public void send(Item item){
        try {
            outputToServer.writeObject(item);
            close();
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            outputToServer.close();
            clientSocket.close();
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
}
