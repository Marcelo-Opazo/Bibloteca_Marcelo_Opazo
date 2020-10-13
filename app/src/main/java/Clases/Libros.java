package Clases;

public class Libros
{
    private String farenheith;
    private String revival;
    private String el_alquimista;
    private String el_poder;
    private String despertar;


    public Libros()
    {
        farenheith ="7000";
        revival = "22000";
        el_alquimista = "45000";
        el_poder ="88000";
        despertar ="156000";
    }


    public String getFarenheith() {
        return farenheith;
    }

    public void setFarenheith(String farenheith) {
        this.farenheith = farenheith;
    }

    public String getRevival() {
        return revival;
    }

    public void setRevival(String revival) {
        this.revival = revival;
    }


    public String getEl_alquimista() {
        return el_alquimista;
    }
    public void setEl_alquimista(String el_alquimista) {
        this.el_alquimista = el_alquimista;
    }

    public String getEl_poder() {
    return el_poder;
    }
    public void setEl_poder(String el_poder) {
        this.el_poder = el_poder;
    }

    public String getDespertar() {
        return despertar;
    }
    public void setDespertar(String despertar) {
        this.despertar = despertar;
    }
}
