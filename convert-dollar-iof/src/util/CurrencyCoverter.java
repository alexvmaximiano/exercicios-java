package util;

public class CurrencyCoverter {
	
	public static double iof = 0.06;
	
	public static double convert(double qtdDollar, double cotacao ) {
		double reais =  qtdDollar * cotacao;
		double result = reais * (1.00 + iof);
		return result;
		
	
	}

}
