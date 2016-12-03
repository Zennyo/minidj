package com.mlh.zenyo.minidj;

import java.io.ObjectOutputStream;
import java.net.Socket;

import logic.Item;


/**
 * Created by Zenyo on 03.12.2016.
 */

public class TCPClient extends Thread {
    String ip;
    int port;
    String Nachricht;



    public TCPClient(String ip, int port, String Nachricht) {
        this.ip = ip;
        this.port = port;
        this.Nachricht = Nachricht;
    }

    public void run(){

        Item item = new Item();
        item.setPayload(Nachricht);
        try {
            Socket clientSocket = new Socket(ip, port);
            ObjectOutputStream outputToServer = new ObjectOutputStream(clientSocket.getOutputStream());
            outputToServer.writeObject(item);
            outputToServer.close();
            clientSocket.close();
        }
        catch (java.io.IOException e){
            e.printStackTrace();
        }
    }
}
