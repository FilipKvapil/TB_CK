package models;

public class Kniha {
    private int id;
    private String nazev;
    private int isbm;
    private String obal;
    private String zanr;
    private String jmenoAutor;
    private String prijmeniAutor;
    private String pozice;

    public Kniha(int id, String nazev, int isbm, String obal, String zanr, String jmenoAutor, String prijmeniAutor, String pozice) {
        this.id = id;
        this.nazev = nazev;
        this.isbm = isbm;
        this.obal = obal;
        this.zanr = zanr;
        this.jmenoAutor = jmenoAutor;
        this.prijmeniAutor = prijmeniAutor;
        this.pozice = pozice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getIsbm() {
        return isbm;
    }

    public void setIsbm(int isbm) {
        this.isbm = isbm;
    }

    public String getObal() {
        return obal;
    }

    public void setObal(String obal) {
        this.obal = obal;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getJmenoAutor() {
        return jmenoAutor;
    }

    public void setJmenoAutor(String jmenoAutor) {
        this.jmenoAutor = jmenoAutor;
    }

    public String getPrijmeniAutor() {
        return prijmeniAutor;
    }

    public void setPrijmeniAutor(String prijmeniAutor) {
        this.prijmeniAutor = prijmeniAutor;
    }

    public String getPozice() {
        return pozice;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }
}
