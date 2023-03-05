// 
// Decompiled by Procyon v0.5.36
// 

package co.edu.unbosque.model.persistence;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import co.edu.unbosque.model.CandidateDTO;
import java.util.ArrayList;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class CandidateFile
{
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private File archivo;
    
    public CandidateFile() {
        this.archivo = new File("./candidatos.dat");
        if (!this.archivo.exists()) {
            try {
                this.archivo.createNewFile();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void write(final ArrayList<CandidateDTO> lst) {
        try {
            (this.salida = new ObjectOutputStream(new FileOutputStream(this.archivo))).writeObject(lst);
            this.salida.close();
        }
        catch (FileNotFoundException ex) {}
        catch (IOException ex2) {}
    }
    
    public ArrayList<CandidateDTO> read() {
        ArrayList<CandidateDTO> salida = new ArrayList<CandidateDTO>();
        if (this.archivo.length() != 0L) {
            try {
                this.entrada = new ObjectInputStream(new FileInputStream(this.archivo));
                salida = (ArrayList<CandidateDTO>)this.entrada.readObject();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            catch (ClassNotFoundException e3) {
                e3.printStackTrace();
            }
        }
        return salida;
    }
    
    public ObjectInputStream getEntrada() {
        return this.entrada;
    }
    
    public void setEntrada(final ObjectInputStream entrada) {
        this.entrada = entrada;
    }
    
    public ObjectOutputStream getSalida() {
        return this.salida;
    }
    
    public void setSalida(final ObjectOutputStream salida) {
        this.salida = salida;
    }
    
    public File getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(final File archivo) {
        this.archivo = archivo;
    }
}
