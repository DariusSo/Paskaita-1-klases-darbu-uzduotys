public class Variables_uzduotis_04 {
    public static void main(String[] args) {

        Darbuotojas jonas = new Darbuotojas();
        jonas.vardas = "Jonas";
        jonas.pavarde = "Jonaitis";
        jonas.pareigos = "Svieto lygintojas";
        jonas.asmensKodas = 36904208008L;
        jonas.lytis = 'V';
        jonas.arVairuoja = false;

        System.out.println("Vardas: " + jonas.vardas);
        System.out.println("Pavarde: " + jonas.pavarde);
        System.out.println("Uzimamos pareigos: " + jonas.pareigos);
        System.out.println("Asmens kodas: " + jonas.asmensKodas);
        System.out.println("Lytis: " + jonas.lytis);
        System.out.println("Ar vairuoja? " + jonas.arVairuoja);
        System.out.println("Jusu paraiska kreditui atmesta.");
        System.out.println();

        Darbuotojas sarunas = new Darbuotojas();
        sarunas.vardas = "Sarunas";
        sarunas.pavarde = "Genys";
        sarunas.pareigos = "Lektorius";
        sarunas.asmensKodas = 39403278521L;
        sarunas.lytis = 'V';
        sarunas.arVairuoja = true;

        System.out.println("Vardas: " + sarunas.vardas);
        System.out.println("Pavarde: " + sarunas.pavarde);
        System.out.println("Uzimamos pareigos: " + sarunas.pareigos);
        System.out.println("Asmens kodas: " + sarunas.asmensKodas);
        System.out.println("Lytis: " + sarunas.lytis);
        System.out.println("Ar vairuoja? " + sarunas.arVairuoja);
        System.out.println();

        String sujungtosPareigos = jonas.pareigos + sarunas.pareigos;
        int pareiguIlgis = sujungtosPareigos.length();
        String iskirptosRaides = sujungtosPareigos.substring(3,9);
        boolean arVienodosPareigos = jonas.pareigos == sarunas.pareigos;
        char raide3 = sujungtosPareigos.charAt(3);

        System.out.println("Sujungtos preigos: " + sujungtosPareigos);
        System.out.println("Sujungtu pareigu raidziu skaicius: " + pareiguIlgis);
        System.out.println("3-9 indekse esancios raides: " + iskirptosRaides);
        System.out.println("Ar abieju pareigos vienodos? " + arVienodosPareigos);
        System.out.println("Sujungtu pareigu treciame indekse esanti raide: " + raide3);

    }
    static class Darbuotojas {

        String vardas;
        String pavarde;
        String pareigos;
        long asmensKodas;
        char lytis;
        boolean arVairuoja;


    }


}
