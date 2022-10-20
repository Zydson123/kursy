package com.kartkowka.kurs;

public class Uczestnik extends Osoba {
    private int kasa;

    public Uczestnik(String imie, String nazwisko, int kasa) {
        super(imie, nazwisko);
        this.kasa = kasa;
    }

    public int getKasa() {
        return kasa;
    }

    public void setKasa(int kasa) {
        this.kasa = kasa;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko();
    }
}

