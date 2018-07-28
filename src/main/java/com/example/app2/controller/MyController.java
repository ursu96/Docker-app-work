package com.example.app2.controller;

import com.example.app2.App2Application;
import com.example.app2.Classes.Student;
import com.example.app2.Classes.StudentMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Configuration
@RestController
public class MyController {

    static Logger log = Logger.getLogger(App2Application.class.getName());

    @Value("${endpoint.welcome}")
    private String mesaj;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String afiseazaMesajAppYML(){
        log.warning(mesaj);
        return mesaj;
    }

    @RequestMapping(value = "/ursu/",method = RequestMethod.GET)
    public String deBine(){
        String mesaj = "Asa ma baiatule";
        System.out.println(mesaj);
        return mesaj;
    }

    @RequestMapping(value = "/jsonList",method = RequestMethod.GET)
    public List<Student> jsonList(){
        List<Student> listaStudenti = new ArrayList<>();
        List<Integer> listaNoteUrsulescu = new ArrayList<>();
        listaNoteUrsulescu.add(10);
        listaNoteUrsulescu.add(10);
        listaNoteUrsulescu.add(10);
        List<Integer> listaNoteGica = new ArrayList<>();
        listaNoteGica.add(9);
        listaNoteGica.add(9);
        listaNoteGica.add(9);

        listaStudenti.add(new Student("Ursulescu", "Alexandru", listaNoteUrsulescu));
        listaStudenti.add(new Student("Gica", "Contra", listaNoteGica));

        return listaStudenti;
    }

    @RequestMapping(value = "/jsonMap",method = RequestMethod.GET)
    public List<StudentMap> afiseazaStudent(){
        List<StudentMap> listaStudenti = new ArrayList<>();
        Map<String, Integer> noteMaterii = new HashMap<>();
        noteMaterii.put("CTS", 10);
        noteMaterii.put("SDD", 5);
        noteMaterii.put("C#", 9);

        listaStudenti.add(new StudentMap("Ursulescu", "Alexandru",noteMaterii));
        listaStudenti.add(new StudentMap("Banica", "Ionel",noteMaterii));



        return listaStudenti;
    }


}
