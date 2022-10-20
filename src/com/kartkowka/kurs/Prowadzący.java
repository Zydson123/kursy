package com.kartkowka.kurs;

public final class Prowadzący extends Osoba{
    private final String umiejetnosci;

    public Prowadzący(String imie, String nazwisko, String umiejetnosci) {
        super(imie, nazwisko);
        this.umiejetnosci = umiejetnosci;
    }
    @Override
    public String toString() {
        return getImie() + " " + getNazwisko();
    }
}
