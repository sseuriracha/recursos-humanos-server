package co.edu.unbosque.model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente {
	private Socket cliente, responder;
	private ObjectOutputStream enviar;
	private ObjectInputStream recibir;
	private int port;
	private String ip;
	
	public Cliente(int portt, String addres) {
		// TODO Auto-generated constructor stub
		try {
			cliente = null;
			responder = null;
			enviar = null;
			recibir = null;
			port = portt;
			ip = addres;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}	
	}
	
	public void agregar(String add) {
		try {
			cliente = new Socket(ip, port);
			enviar = new ObjectOutputStream(cliente.getOutputStream());
			enviar.writeObject(add);
			cliente.close();
			enviar.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public String leer() {
		String line = "";
		try {
			responder = new Socket (ip, port);
			recibir = new ObjectInputStream(responder.getInputStream());
			line = (String) recibir.readObject();
			responder.close();
			recibir.close();
			return line;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	
}
