package exam.ocpjp.v1.q031;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {
//	Locale CurrencySymbol CurrencyCode
//	US		$				USD
	public static void main(String[] args) {
		double d =15;
		Locale l = new Locale("en", "US"); //獲得某個國家或地區的具體格式
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);//貨幣的format
		//或是可以寫成 NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(formatter.format(d));

	}

}
