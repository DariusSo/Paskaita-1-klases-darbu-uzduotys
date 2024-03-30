import java.math.BigDecimal;
import java.math.RoundingMode;

public class Variables_uzduotis_05 {
    public static void main(String[] args) {

        //1 uzduotis

        int pirmasSkInt = 5;
        int antrasSkInt = 89;

        int sumInt = pirmasSkInt + antrasSkInt;
        int skirtInt = pirmasSkInt - antrasSkInt;
        int multInt = pirmasSkInt * antrasSkInt;
        int divdInt = antrasSkInt / pirmasSkInt;

        System.out.println("Sudetis: " + sumInt + "\nAtimtis: " + skirtInt + "\nDaugyba: " + multInt + "\nDalyba: " + divdInt);
        System.out.println();

        //2 uzduotis

        float pirmasSkFloat = 88.46F;
        float antrasSkFloat = -456.12F;

        float sumFloat = pirmasSkFloat + antrasSkFloat;
        float skirtFloat = pirmasSkFloat - antrasSkFloat;
        float multFloat = pirmasSkFloat * antrasSkFloat;
        float divdFloat = antrasSkFloat / pirmasSkFloat;

        System.out.println("Sudetis: " + sumFloat + "\nAtimtis: " + skirtFloat + "\nDaugyba: " + multFloat + "\nDalyba: " + divdFloat);
        System.out.println();

        //3 uzduotis

        BigDecimal pirmasSkBgDc = new BigDecimal(12.456);
        BigDecimal antrasskBgDc = new BigDecimal(2.89);

        BigDecimal sumBgDc = pirmasSkBgDc.add(antrasskBgDc);
        BigDecimal skirtBgDc = pirmasSkBgDc.subtract(antrasskBgDc);
        BigDecimal multBgDc = pirmasSkBgDc.multiply(antrasskBgDc);
        BigDecimal divdBgDc = pirmasSkBgDc.divide(antrasskBgDc, 30, RoundingMode.HALF_UP);

        System.out.println("Sudetis: " + sumBgDc + "\nAtimtis: " + skirtBgDc + "\nDaugyba: " + multBgDc + "\nDalyba: " + divdBgDc);
        System.out.println();

        //4 uzduotis

        System.out.println("Sudetis: " + sumBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nAtimtis: " + skirtBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nDaugyba: " + multBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nDalyba: " + divdBgDc.setScale(2, RoundingMode.HALF_UP));

    }
}
