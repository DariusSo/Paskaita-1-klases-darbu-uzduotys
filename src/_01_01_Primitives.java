public class _01_01_Primitives {
    public static void main(String[] args) {
        //1. Valiutos keitykla
        float EUR = 56.78F;
        float GBP = 0.86F * EUR;
        float USD = 1.08F * EUR;
        float JPY = 164.18F * EUR;
        float CAD = 1.47F * EUR;

        System.out.println("56.78 EUR convertavus i USD yra: " + USD);
        System.out.println("56.78 EUR convertavus i GBP yra: " + GBP);
        System.out.println("56.78 EUR convertavus i JPY yra: " + JPY);
        System.out.println("56.78 EUR convertavus i CAD yra: " + CAD);
        System.out.println();
        //2. Temperaturos konverteris

        float F = 65F;
        float C = (F - 32) * 5/9;
        System.out.println("Siandienos temperatura yra: " + C + "°C");
        System.out.println();

        //3. Valiutos keitykla 2
        int pinigai = 100;
        int lygiDalis = pinigai / 25;

        GBP = 0.86F * lygiDalis;
        USD = 1.08F * lygiDalis;
        JPY = 164.18F * lygiDalis;
        CAD = 1.47F * lygiDalis;

        System.out.println("56.78 EUR convertavus i USD yra: " + USD);
        System.out.println("56.78 EUR convertavus i GBP yra: " + GBP);
        System.out.println("56.78 EUR convertavus i JPY yra: " + JPY);
        System.out.println("56.78 EUR convertavus i CAD yra: " + CAD);
        System.out.println();

        //4. Staciakampio plotas

        int a = 5;
        int b = 4;
        int plotas = a * b;

        System.out.println("Staciakampio plotas yra: " + plotas);

        //5. Trikampio plotas

        int ilga = 45;
        int trumpa = 12;
        int trikampioPlotas = ilga * trumpa / 2;

        System.out.println("Trikampio plotas yra: " + trikampioPlotas);

        //6. Kvadrato plotas ir perimetras

        int krastine = 16;
        int kvadratoPlotas = krastine * krastine;
        int kvadratoPerimetras = krastine * 4;

        System.out.println("Kvadrato plotas yra " + kvadratoPlotas + " o perimetras " + kvadratoPerimetras);

        //7. Turis

        int ilgis = 50;
        int plotis = 62;
        int aukstis = 77;

        int V = ilgis * plotis * aukstis;

        System.out.println("Turis yra: " + V);
        System.out.println();

        //8. Atsitiktiniai skaiciai

        float atsitiktinis1 = (int) (Math.random() * 10 + 1);
        float atsitiktinis2 = (int) (Math.random() * 10 + 1);
        float atsitiktinis3 = (int) (Math.random() * 10 + 1);
        float atsitiktinis4 = (int) (Math.random() * 10 + 1);
        float atsitiktinis5 = (int) (Math.random() * 10 + 1);

        float vidurkis = (atsitiktinis1 + atsitiktinis2 + atsitiktinis3 + atsitiktinis4 + atsitiktinis5) / 5;

        System.out.println("Atsitiktiniai skaiciai yra: " + atsitiktinis1 + " " + atsitiktinis2 + " " + atsitiktinis3 + " " + atsitiktinis4 + " " + atsitiktinis5);
        System.out.println("Vidurkis: " + vidurkis);
        System.out.println("");

        //9. Atsitiktiniai nuo -10 iki 10

        int atsitiktinis10 = (int) (Math.random() * 20 - 10);
        System.out.println("Atsitiktinis skaicius yra: " + atsitiktinis10);

        if (atsitiktinis10 > 0) {
            System.out.println("Atsitiktinis skaicius yra teigiamas");
        } else if (atsitiktinis10 == 0 ){
            System.out.println("Atsitiktinis skaicius yra nulis");


        }
        else {
            System.out.println("Atsitiktinis skaicius yra neigiamas");

        }
        //10. Atsitiktinis iki 1000

        int atsitiktinis1001 = (int) (Math.random() * 1000);
        int atsitiktinis1002 = (int) (Math.random() * 1000);
        int atsitiktinis1003 = (int) (Math.random() * 1000);
        int atsitiktinis1004 = (int) (Math.random() * 1000);

        int max = Math.max(atsitiktinis1001, atsitiktinis1002);
        max = Math.max(max, atsitiktinis1003);
        max = Math.max(max, atsitiktinis1004);

        int min = Math.min(atsitiktinis1001, atsitiktinis1002);
        min = Math.min(min, atsitiktinis1003);
        min = Math.min(min, atsitiktinis1004);

        System.out.println("Didziausias skaicius: " + max);
        System.out.println("Maziausias skaicius: " + min);

    }
}
