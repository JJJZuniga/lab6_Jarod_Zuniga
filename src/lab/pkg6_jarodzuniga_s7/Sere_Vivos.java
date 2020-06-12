
package lab.pkg6_jarodzuniga_s7;

import java.util.ArrayList;


public class Sere_Vivos extends Universo{
    protected String nombrep;
    protected int poder;
    protected int años;
    protected String planeta;
    protected String raza;

    public Sere_Vivos() {
    }

    public Sere_Vivos(String nombrep, int poder, int años, String planeta, String raza) {
        this.nombrep = nombrep;
        this.poder = poder;
        this.años = años;
        this.planeta = planeta;
        this.raza = raza;
    }

    public Sere_Vivos(String nombrep, int poder, int años, String planeta, String raza, String nombre, ArrayList seres) {
        super(nombre, seres);
        this.nombrep = nombrep;
        this.poder = poder;
        this.años = años;
        this.planeta = planeta;
        this.raza = raza;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public ArrayList getSeres() {
        return seres;
    }

    public void setSeres(ArrayList seres) {
        this.seres = seres;
    }

    @Override
    public String toString() {
        return "nombrep=" + nombrep + ", poder=" + poder + ", años=" + años + ", planeta=" + planeta + ", raza=" + raza ;
    }

   
}
