/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 26, 2018 6:12:27 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut.pertemuan8;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ServerRmi extends HelloImpl{
    public static void main(String[] args) {
        HelloImpl helloImpl = new HelloImpl();
        try {
            Hello stub = (Hello) UnicastRemoteObject.exportObject(helloImpl, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);
            System.out.println("Server starting...");
        } catch (RemoteException | AlreadyBoundException ex) {
            Logger.getLogger(ServerRmi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
