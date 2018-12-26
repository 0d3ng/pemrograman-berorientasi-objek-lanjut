/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 26, 2018 6:16:15 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut.pertemuan8;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ClientRmi {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            try {
                Hello stub = (Hello) registry.lookup("Hello");
                stub.sayHello();
            } catch (NotBoundException ex) {
                Logger.getLogger(ClientRmi.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AccessException ex) {
                Logger.getLogger(ClientRmi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(ClientRmi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
