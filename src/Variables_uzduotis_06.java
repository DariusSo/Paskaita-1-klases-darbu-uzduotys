import java.math.BigDecimal;
import java.math.RoundingMode;

public class Variables_uzduotis_06 {
    public static void main(String[] args) {

        float atsitiktinis = (float) ((Math.random() * 20));

        BigDecimal pirmasSkBgDc = new BigDecimal(atsitiktinis);
        BigDecimal antrasskBgDc = new BigDecimal(atsitiktinis);

        BigDecimal sumBgDc = pirmasSkBgDc.add(antrasskBgDc);
        BigDecimal skirtBgDc = pirmasSkBgDc.subtract(antrasskBgDc);
        BigDecimal multBgDc = pirmasSkBgDc.multiply(antrasskBgDc);
        BigDecimal divdBgDc = pirmasSkBgDc.divide(antrasskBgDc, 30, RoundingMode.HALF_UP);

        int palyginimas = pirmasSkBgDc.compareTo(antrasskBgDc);
        boolean arLygus = palyginimas == 0;

        System.out.println("Sudetis: " + sumBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nAtimtis: " + skirtBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nDaugyba: " + multBgDc.setScale(2, RoundingMode.HALF_UP)
                + "\nDalyba: " + divdBgDc.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Ar skaiciai lygus? " + arLygus);


    }
}
