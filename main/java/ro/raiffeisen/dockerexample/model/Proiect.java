package ro.raiffeisen.dockerexample.model;

import java.util.List;

public class Proiect {

    private String nume;
    private List<String> listaMicroservicii;
    private int numarMicroservicii;

    public Proiect(String nume, List<String> listaMicroservicii) {
        this.nume = nume;
        this.listaMicroservicii = listaMicroservicii;
        this.numarMicroservicii = this.listaMicroservicii.size();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getListaMicroservicii() {
        return listaMicroservicii;
    }

    public void setListaMicroservicii(List<String> listaMicroservicii) {
        this.listaMicroservicii = listaMicroservicii;
    }

    public int getNumarMicroservicii() {
        return numarMicroservicii;
    }

}
