/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michell
 */
public class Servidor extends Observable implements Runnable {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;

        Socket sc = null;

        DataInputStream in;

        DataOutputStream out;

        try {
            servidor = new ServerSocket(port);
            System.out.println("Servidor inciado");

            while (true) {

                sc = servidor.accept();

                System.out.println("Cliente conectado");

                in = new DataInputStream(sc.getInputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                sc.close();

                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
