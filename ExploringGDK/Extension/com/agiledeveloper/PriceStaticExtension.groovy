package com.agiledeveloper;

class PriceStaticExtension{
    public static double getPrice(String slefType, String ticker){
	def url = "http://ichart.finance.yahoo.com/table.csv?s=$ticker".toURL();
	def data = url.readLines()[1].split(",")

	Double.parseDouble(data[-1]);
    }
}
