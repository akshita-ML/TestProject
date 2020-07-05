package hackerrank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Fomat {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println("US: "+(us.format(payment)));

           // NumberFormat india = NumberFormat.getInstance(Locale.ENGLISH);
            Locale locale = new Locale("en");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat)numberFormat).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol("");
            ((DecimalFormat) numberFormat).setDecimalFormatSymbols(decimalFormatSymbols);
            System.out.println("India: Rs."+(numberFormat.format(payment).trim()));

            
          //  System.out.println("India: Rs."+(numberFormat.format(payment)));

            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println("China: "+(china.format(payment)));
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("France: "+(france.format(payment)));
            
	        scanner.close();

	}

}
