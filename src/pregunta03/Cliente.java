/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michell
 */
public class Cliente implements Runnable {

    private int port;

    private String mensaje;

    public Cliente(int port, String mensaje) {
        this.port = port;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {

        final String HOST = "127.0.0.1";

        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, port);

            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

