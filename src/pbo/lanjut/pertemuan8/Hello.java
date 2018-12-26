/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 26, 2018 6:03:35 AM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut.pertemuan8;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author od3ng
 */
public interface Hello extends Remote {

    void sayHello() throws RemoteException;
}
