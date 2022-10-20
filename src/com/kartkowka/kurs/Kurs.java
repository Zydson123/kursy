package com.kartkowka.kurs;

import java.util.ArrayList;

public class Kurs {
    private final String nazwa;
    private final Prowadzący prowadzący;
    private final String opis;
    private final int cena;
    private final ArrayList<Uczestnik> Uczestnicy = new ArrayList<Uczestnik>();

    public Kurs(String nazwa, Prowadzący prowadzący, String opis, int cena) {
        this.nazwa = nazwa;
        this.prowadzący = prowadzący;
        this.opis = opis;
        this.cena = cena;
    }

    public void dodajUczestnika(Uczestnik uczestnik){
        if(uczestnik.getKasa() - getCena() >= 0 && Uczestnicy.size()<12){
            if(!getUczestnicy().contains(uczestnik)) {
                uczestnik.setKasa(uczestnik.getKasa() - getCena());
                System.out.println("Dodano uczestnika: " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " do kursu pod nazwą: " + getNazwa());
                Uczestnicy.add(uczestnik);
            }
            else{
                System.out.println("Uczestnik: " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " już jest w tym kursie");
            }
        }
        else if(uczestnik.getKasa() - getCena() <= 0 && Uczestnicy.size()<12){
            System.out.println("Uczestnik: " + uczestnik.getImie() + " " + uczestnik.getNazwisko() + " ma tylko: " + uczestnik.getKasa() + "zł i nie starczy mu to żeby wziąć udział w kursie pod nazwą " + getNazwa());
        }
        else{
            System.out.println("Uczestnik: " + uczestnik.getImie() + " nie może wziąc udziału w kursie ponieważ jest więcej niż 12 osób w kursie");
        }
        }
    public String getNazwa() {
        return nazwa;
    }

    public Prowadzący getProwadzący() {
        return prowadzący;
    }

    public String getOpis() {
        return opis;
    }

    public int getCena() {
        return cena;
    }

    public ArrayList<Uczestnik> getUczestnicy() {
        return Uczestnicy;
    }

    @Override
    public String toString() {
        return "Kurs pod nazwą: " + getNazwa() + " z uczestnikami: " + getUczestnicy() + " Jest prowadzony przed: " + getProwadzący() + " kosztuje: " + getCena();
    }
}
