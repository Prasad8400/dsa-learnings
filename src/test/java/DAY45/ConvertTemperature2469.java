package DAY45;

import java.util.Arrays;

public class ConvertTemperature2469 {
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] ans = new double[] { celsius + 273.15, celsius * 1.80 + 32.00 };
        System.out.println(Arrays.toString(ans));
    }

}
