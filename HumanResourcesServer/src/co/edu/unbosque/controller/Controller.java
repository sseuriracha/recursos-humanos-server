// 
// Decompiled by Procyon v0.5.36
// 

package co.edu.unbosque.controller;

import co.edu.unbosque.server.Server;

public class Controller {
	private Server servidor;

	public Controller() {
		servidor = new Server(5000);
		servidor.run();
	}
}
