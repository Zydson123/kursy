package com.kartkowka.kurs;

public class Main {
    //utwórz klasę kurs, z własnościami prywatnymi: nazwa,prowadzący, opis,cena i uczestnicy
    //klasa osoba, klasa prowadzący i uczestnik
    //prowadzący i uczestnik rozszerzają osobę
    //prowadzący: umiejętności,
    //uczetnik: fundusz
    //metoda dodaj uczestnika do kursu, uczestnik musi mieć kase na kurs oraz musi mu to usunąc te fundusze
    //jeżeli nie ma miejsca w kursie to nieważne ile ma kasy nie wejdzie (max 12 uczestników)
    //toString wypisuje prowadzącego na kursie
    public static void main(String[] args) {
        Uczestnik kubaBed = new Uczestnik("Jakub", "Bedlińśki", 500);
        Uczestnik WojtekBrandys = new Uczestnik("Wojtek", "Brandys", 300);
        Uczestnik KingaGolebiewska = new Uczestnik("Kinga", "Golebiewska", 2400);
        Uczestnik MarianPsi = new Uczestnik("Marian", "Psi", 600);
        Prowadzący JanuszKowalski = new Prowadzący("Janusz", "Kowalski", "Java");
        Prowadzący MateuszBosak = new Prowadzący("Mateusz", "Bosak", "Java");
        Kurs JavaSrednio = new Kurs(
                "Java Dla Srednio-zaawansowanych",
                JanuszKowalski,
                "Tutaj nauczysz sie języka C++ na poziomie średnio-zaawansowanym",
                400
        );
        Kurs CppPro = new Kurs(
                "C++ dla profesjonalistów",
                MateuszBosak,
                "Tutaj nauczysz sie języka C++ na poziomie Profesjonalnym",
                550
        );
        JavaSrednio.dodajUczestnika(kubaBed);
        JavaSrednio.dodajUczestnika(WojtekBrandys);
        JavaSrednio.dodajUczestnika(KingaGolebiewska);
        CppPro.dodajUczestnika(MarianPsi);
        CppPro.dodajUczestnika(KingaGolebiewska);
        CppPro.dodajUczestnika(KingaGolebiewska);
        JavaSrednio.dodajUczestnika(MarianPsi);
        System.out.println(JavaSrednio);
        System.out.println(CppPro);

    }
}