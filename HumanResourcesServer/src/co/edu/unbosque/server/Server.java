// 
// Decompiled by Procyon v0.5.36
// 

package co.edu.unbosque.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import co.edu.unbosque.model.persistence.CandidateDAO;
import co.edu.unbosque.model.persistence.CandidateFile;

public class Server extends Thread {
	private ServerSocket servidor;
	private Socket client, respond;
	private ObjectOutputStream enviar;
	private ObjectInputStream recibir;
	private int port;
	private CandidateDAO candao;
	private CandidateFile archivo;
	private String ip;

	public Server(final int portt) {
		try {
			servidor = null;
			client = null;
			respond = null;
			enviar = null;
			recibir = null;
			port = portt;
			archivo = new CandidateFile();
			candao = new CandidateDAO(archivo);
			ip = "localhost";
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				servidor = new ServerSocket(port);
				System.out.println("Server created, waiting for client");
				client = servidor.accept();
				System.out.println("Client Accepted");
				recibir = new ObjectInputStream(client.getInputStream());
				String txt = (String) recibir.readObject();
				System.out.println(txt);
				if (txt.contains("ADD")) {
					String[] tosplit = txt.split(" ");
					candao.addCandidate(tosplit[1], tosplit[2], tosplit[4], tosplit[3], Integer.parseInt(tosplit[5]));
					archivo.write(candao.getList());
				} else if (txt.contains("UPD")) {
					String[] tosplit = txt.split(" ");
					candao.updateCandidate(tosplit[1], tosplit[2], tosplit[4], tosplit[3],
							Integer.parseInt(tosplit[5]));
					archivo.write(candao.getList());
				} else if (txt.contains("DEL")) {
					String[] tosplit = txt.split(" ");
					candao.deleteCandidate(tosplit[4]);
					archivo.write(candao.getList());
				}

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}