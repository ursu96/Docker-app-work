package ro.raiffeisen.dockerexample.service;

import ro.raiffeisen.dockerexample.model.Proiect;

import java.util.ArrayList;
import java.util.List;

public class AddProjectService {
    private List<Proiect> listaProiecte = new ArrayList<>();

    public AddProjectService() {
        List<String> listaMicroserviciiAthena = new ArrayList<>();
        listaMicroserviciiAthena.add("eureka-peer");
        listaMicroserviciiAthena.add("config-service");
        listaMicroserviciiAthena.add("zuul-gateway");
        listaMicroserviciiAthena.add("spring-boot-admin");
        listaMicroserviciiAthena.add("utils-service");
        listaMicroserviciiAthena.add("isam-service");
        listaMicroserviciiAthena.add("auth-service");
        listaMicroserviciiAthena.add("userprofile-service");
        listaMicroserviciiAthena.add("localization-service");
        listaMicroserviciiAthena.add("accounts-service");
        listaMicroserviciiAthena.add("interest-rates-service");
        listaMicroserviciiAthena.add("payments-service");
        listaMicroserviciiAthena.add("trasset-ram-service");
        listaMicroserviciiAthena.add("directdebit-service");
        listaMicroserviciiAthena.add("transactions-service");
        listaMicroserviciiAthena.add("cards-service");
        listaMicroserviciiAthena.add("mobile-top-up-service");
        listaMicroserviciiAthena.add("apply-for-cc-marketing-service");
        listaMicroserviciiAthena.add("account-statement-service");
        listaMicroserviciiAthena.add("fx-rates-service");
        listaMicroserviciiAthena.add("scheduling-service");
        listaMicroserviciiAthena.add("locator-service");
        listaMicroserviciiAthena.add("payment-templates-service");

        List<String> listaMicroserviciiNewton = new ArrayList<>();
        listaMicroserviciiNewton.add("accounts");
        listaMicroserviciiNewton.add("transactions-service");
        listaMicroserviciiNewton.add("auth-service");

        Proiect athena = new Proiect("Athena", listaMicroserviciiAthena);
        Proiect newton = new Proiect("Sysapi", listaMicroserviciiNewton);


        this.listaProiecte.add(athena);
        this.listaProiecte.add(newton);
    }

    public List<Proiect> getListaProiecte(){
        return this.listaProiecte;
    }
}
