package models;

import java.util.Date;

public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private Date narozeni;
    private String email;
    private int telefon;
    private String heslo;
    private String adresa;

    public Uzivatel(String jmeno, String prijmeni, Date narozeni, String email, int telefon, String heslo, String adresa) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.narozeni = narozeni;
        this.email = email;
        this.telefon = telefon;
        this.heslo = heslo;
        this.adresa = adresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public Date getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(Date narozeni) {
        this.narozeni = narozeni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
