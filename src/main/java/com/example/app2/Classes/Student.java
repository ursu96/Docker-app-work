package com.example.app2.Classes;

import java.util.List;

public class Student {
    private String nume;
    private String prenume;
    private List<Integer> note;

    public Student(String nume, String prenume, List<Integer> note) {
        this.nume = nume;
        this.prenume = prenume;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void setNote(List<Integer> note) {
        this.note = note;
    }
}
