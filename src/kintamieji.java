public class kintamieji {
    public static void main(String[] args) {
        int pirmadieniais = (int) (3 + (Math.random() * 5));
        int antradieniais = (int) (3 + (Math.random() * 5));
        int treciadieniais = (int) (3 + (Math.random() * 5));
        int ketvirtadieniais = (int) (3 + (Math.random() * 5));
        int penktadieniais = (int) (3 + (Math.random() * 5));

        int pamokos = pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais + penktadieniais;
        int minutes = pamokos * 45;
        System.out.println("Pamoku skaicius sia savaite: " + pamokos);
        System.out.println("Tai sudaro " + minutes + " minuciu");

        //2. Laikas

        int sekundes = (int) (43_200 + (Math.random() * 2_548_800));
        int dienos = sekundes / 86400;
        int valandos = (sekundes % 86400) / 3600;
        int minutes1 = ((sekundes % 86400) % 3600) / 60;
        int likusiosS = ((sekundes % 86400) % 3600) % 60;

        System.out.println("Rezultatas: " + dienos + "d " + valandos + "val " + minutes1 + "min " + likusiosS + "sec.");

        //3. Akvariumas

        int a = (int) ((Math.random() * 10));
        int b = (int) (1 + (Math.random() * 2));
        int n = (int) (1 + (Math.random() * 29));

        int isViso = a + (b * n);
        System.out.println("Zuvu akvariume yra " + a + ", jeigu Petriukas kiekviena diena ides po " + b + ", tai praejus " + n + " dienu tures " + isViso);

        //4. Tunelis

        int tunelis = 264;
        int v = (int) (20 + (Math.random() * 40));
        float MPerSekunde = v / 3.6F;
        float iveiktas = tunelis / MPerSekunde;

        System.out.printf("Vaziuojant " + v + " km/h greiciu tuneli iveiksime per " + "%.2f" + "s", iveiktas);
        System.out.println();
        //5. Taupykle

        Taupykle JonoTaupykle = new Taupykle();
        int randomA = (int) ((Math.random() * 100));
        int randomB = (int) ((Math.random() * 100));
        int randomC = (int) ((Math.random() * 100));
        JonoTaupykle.a = randomA * 0.05F;
        JonoTaupykle.b = randomB * 0.20F;
        JonoTaupykle.c = randomC * 1.00F;
        JonoTaupykle.bendras = JonoTaupykle.a + JonoTaupykle.b + JonoTaupykle.c;
        System.out.println("Taupykleje yra " + randomA + " monetos po 5ct, " + randomB + " po 20ct ir " + randomC + " po 1 Eur");
        System.out.println("Is viso Jono taupykleje yra: " + JonoTaupykle.bendras + " Eur");

        Taupykle TomoTaupykle = new Taupykle();
        int randomD = (int) ((Math.random() * 100));
        int randomE = (int) ((Math.random() * 100));
        int randomF = (int) ((Math.random() * 100));
        TomoTaupykle.a = randomD * 0.05F;
        TomoTaupykle.b = randomE * 0.20F;
        TomoTaupykle.c = randomF * 1.00F;
        TomoTaupykle.bendras = TomoTaupykle.a + TomoTaupykle.b + TomoTaupykle.c;
        System.out.println("Taupykleje yra " + randomD + " monetos po 5ct, " + randomE + " po 20ct ir " + randomF + " po 1 Eur");
        System.out.println("Is viso Tomo taupykleje yra: " + TomoTaupykle.bendras + " Eur");

        boolean arJonasDaugiau = JonoTaupykle.bendras > TomoTaupykle.bendras;

        System.out.println("Ar Jono taupykleje daugiau pinigu? " + arJonasDaugiau);
    }
}

