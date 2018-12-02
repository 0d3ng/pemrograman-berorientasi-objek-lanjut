/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 2, 2018 9:57:01 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut;

import pbo.lanjut.pertemuan6.HelloThread;
import pbo.lanjut.pertemuan6.ThreadNumber;
import pbo.lanjut.pertemuan6.KittyThread;
import pbo.lanjut.pertemuan6.NumberGenerator;

/**
 *
 * @author od3ng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        pertemuan ke-6
//        ========================
//        implement interface runnable
//        Thread hello = new Thread(new HelloThread());
//        hello.start();

//        extends class Thread
//        KittyThread kittyThread = new KittyThread();
//        kittyThread.start();
        //alternative tetapi tidak disarankan
//        new Thread(() -> {
//            System.out.println("Hello Kitty Thread.");
//        }).start();
//        multiple thread
        NumberGenerator generator = new NumberGenerator(10, 100);
        for (int i = 0; i < 3; i++) {
//            new Thread(new ThreadNumber("thread: " + i)).start();
            new Thread(new ThreadNumber("Thread->" + i, generator)).start();
        }
        
    }

}
