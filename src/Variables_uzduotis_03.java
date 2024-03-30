public class Variables_uzduotis_03 {
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

