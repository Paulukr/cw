package cw;

import java.util.Locale;

public class NthSeries {
	
	public static String seriesSum(int n) {
		float divider = 1;
    final float increment = 3;
    int count = 0;
    double sum = 0;
    while(count ++ < n){
      sum += 1.0/divider;
      divider += increment;
    }
    Locale.setDefault(Locale.US);
    return String.format("%.2f", Math.round(sum * 100)/100.0);
	}
}
