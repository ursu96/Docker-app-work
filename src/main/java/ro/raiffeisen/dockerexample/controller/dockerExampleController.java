package ro.raiffeisen.dockerexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.raiffeisen.dockerexample.main.DockerExampleApplication;
import ro.raiffeisen.dockerexample.model.Angajat;
import ro.raiffeisen.dockerexample.model.Proiect;
import ro.raiffeisen.dockerexample.service.AddProjectService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


@RestController
public class dockerExampleController {
    static Logger log = Logger.getLogger(DockerExampleApplication.class.getName());

    @Autowired
    private Angajat a;

    @GetMapping(value = "/a")
    public String getHome(){
        String message = "Hello World";
        log.info(message);
        return message;
    }

    @GetMapping(value = "/angajati")
    public List<Angajat> getAngajati(){
        a.setNume("Ursulescu");
        a.setPrenume("Alexandru");
        a.setVarsta(22);
        List<Angajat> listaAngajati = new ArrayList<>();
        listaAngajati.add(a);
        listaAngajati.add(a);

        log.info("Numarul de angajati:" + listaAngajati.size());
        return listaAngajati;
    }

    @GetMapping(value="/proiecte")
    public List<Proiect> getProiect(){
        AddProjectService proiecte = new AddProjectService();
        for(Proiect p: proiecte.getListaProiecte()){
            log.info(p.getNume());
            log.info(p.getListaMicroservicii().toString());
        }
        return proiecte.getListaProiecte();
    }
}
