public class _02_01_Objects_String {
    public static void main(String[] args) {

        String vardas = "Darius";
        int raidziuSkaicius = vardas.length();
        int raideA = vardas.indexOf('a');
        int raideI = vardas.indexOf('a');
        int raideE = vardas.indexOf('a');
        StringBuilder sb = new StringBuilder(vardas);
        sb.deleteCharAt(raidziuSkaicius - 1);
        sb.deleteCharAt(0);
        System.out.println(sb);

        //Bonus

        String zodis = "alabama";
        int ilgis1 = zodis.length();
        String beRaidziu = zodis.replace("a", "");
        int ilgis2 = beRaidziu.length();
        int raidziuKiekis = ilgis1 - ilgis2;
        System.out.println("Zodyje alabama yra " + raidziuKiekis + " a raides.");


    }
}
