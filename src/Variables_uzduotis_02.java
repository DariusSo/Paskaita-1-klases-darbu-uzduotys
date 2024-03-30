public class Variables_uzduotis_02 {
    public static void main(String[] args) {

        Suo reksas = new Suo();

        reksas.vardas = "Reksas";
        reksas.amzius = 5;
        reksas.arDresuotas = true;
        reksas.veisle = "Aviganis";

        char raide = (char) reksas.vardas.charAt(2);

        System.out.println("Suns vardas yra " + reksas.vardas);
        System.out.println("Suns amzius yra " + reksas.amzius);
        System.out.println("Ar suo yra dresuotas? " + reksas.arDresuotas);
        System.out.println("Suns veisle yra " + reksas.veisle);
        System.out.println("Atrojo indekso varde raide yra " + raide);
        System.out.println();

        Suo keksas = new Suo();

        keksas.vardas = "Keksas";
        keksas.amzius = 3;
        keksas.arDresuotas = false;
        keksas.veisle = "Pinceris";

        char raide1 = (char) keksas.vardas.charAt(2);

        System.out.println("Kito suns vardas yra " + keksas.vardas);
        System.out.println("Kito suns amzius yra " + keksas.amzius);
        System.out.println("Ar kitas suo yra dresuotas? " + keksas.arDresuotas);
        System.out.println("Kito suns veisle yra " + keksas.veisle);
        System.out.println("Atrojo indekso varde raide yra " + raide1);
        System.out.println();


        String sujungtiVardai = reksas.vardas + keksas.vardas;
        int varduIlgis = sujungtiVardai.length();
        String raides = sujungtiVardai.substring(2,6);
        boolean arVienodi = reksas.vardas == keksas.vardas;
        char raide5 = (char) sujungtiVardai.charAt(5);

        System.out.println("Sujungus sunis turesime padara vardu " + sujungtiVardai);
        System.out.println("Vardo ilgis yra " + varduIlgis);
        System.out.println("Jeigu pasiimam 2-6 vardo raides gauname: " + raides);
        System.out.println("Jeigu dar nepastebejom, tai i klausima ar suniuku vardai yra vienodi atsakysime " + arVienodi);
        System.out.println("Sujungto sunio vardo penkto indekso raide yra " + raide5);


    }
}


