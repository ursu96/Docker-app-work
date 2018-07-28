package com.example.app2.Classes;

import java.util.Map;

public class StudentMap {
    private String Nume;
    private String prenume;
    private Map<String, Integer> noteMaterii;

    public StudentMap(String nume, String prenume, Map<String, Integer> noteMaterii) {
        Nume = nume;
        this.prenume = prenume;
        this.noteMaterii = noteMaterii;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Map<String, Integer> getNoteMaterii() {
        return noteMaterii;
    }

    public void setNoteMaterii(Map<String, Integer> noteMaterii) {
        this.noteMaterii = noteMaterii;
    }
}
