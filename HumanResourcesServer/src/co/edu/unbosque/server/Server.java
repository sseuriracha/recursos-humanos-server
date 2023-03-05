// 
// Decompiled by Procyon v0.5.36
// 

package co.edu.unbosque.server;

import co.edu.unbosque.model.persistence.CandidateFile;
import co.edu.unbosque.model.persistence.CandidateDAO;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class Server extends Thread
{
    private ServerSocket servidor;
    private Socket cliente;
    private Socket responder;
    private ObjectOutputStream enviar;
    private ObjectInputStream recibir;
    private int port;
    private CandidateDAO canDao;
    private CandidateFile arr;
    private String ip;
    
    public Server(final int portt) {
        try {
            this.servidor = null;
            this.cliente = null;
            this.responder = null;
            this.enviar = null;
            this.recibir = null;
            this.port = portt;
            this.canDao = new CandidateDAO(this.arr);
            this.ip = "localhost";
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    @Override
    public void run() {
        try {
            while (true) {
                this.servidor = new ServerSocket(this.port);
                System.out.println("Server created, waiting for client");
                this.cliente = this.servidor.accept();
                System.out.println("Client Accepted");
                this.recibir = new ObjectInputStream(this.cliente.getInputStream());
                final String txt = (String)this.recibir.readObject();
                if (txt.contains("ADD")) {
                    final String[] tosplit = txt.split(" ");
                    this.canDao.addCandidate(tosplit[1], tosplit[2], tosplit[3], tosplit[4], Integer.parseInt(tosplit[5]));
                    this.arr.write(this.canDao.getCan());
                }
                if (txt.contains("UPD")) {
                    final String[] tosplit = txt.split(" ");
                    this.canDao.updateCandidate(tosplit[1], tosplit[2], tosplit[4], tosplit[3], Integer.parseInt(tosplit[5]));
                    this.arr.write(this.canDao.getCan());
                }
                if (txt.contains(txt)) {
                    final String[] tosplit = txt.split(" ");
                    this.canDao.deleteCandidate(tosplit[4]);
                    this.arr.write(this.canDao.getCan());
                }
            }
        }
        catch (Exception ex) {}
    }
}
