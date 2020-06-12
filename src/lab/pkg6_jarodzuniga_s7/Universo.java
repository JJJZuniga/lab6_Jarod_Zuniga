/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jarodzuniga_s7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jhon Zuniga
 */
public class Universo {
    protected String nombreU;
    private ArrayList<Sere_Vivos> lista = new ArrayList();
    private File archivo = null;

    public Universo() {
    }

    public Universo(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public ArrayList<Sere_Vivos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Sere_Vivos> lista) {
        this.lista = lista;
    }


    @Override
    public String toString() {
        return "Universo{" + "nombreU=" + nombreU + ", lista=" + lista ;
    }

    public void setSeresVivos(Sere_Vivos p) {
        this.lista.add(p);
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Sere_Vivos t : lista) {
                bw.write(t.getNombrep()+ "|");
                bw.write(t.getPoder()+ "|");
                bw.write(t.getAños()+ "|");
                bw.write(t.getPlaneta()+ "|");
                bw.write(t.getRaza()+ "|");
            }
            bw.flush();
        } catch (IOException ex) {
        }
        bw.close();
        fw.close();
    }


public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    lista.add(new Sere_Vivos(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    
    
    
}
