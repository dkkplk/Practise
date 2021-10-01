import java.util.List;

import javax.xml.ws.Response;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = null;
		double output = calculateNav(date);
		System.out.println(output);

	}

	private static double calculateNav(String date) {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
	    Response response = restTemplate.getForObject(
	                           "http://services.groupkt.com/country/get/iso2code/IN",
	                            Response.class);
		return 0;
	}

}

class HoldingDatum{
    public String date;
    public String security;
    public int quantity;
    public String portfolio;
}

class Holding{
    public int totalRecords;
    public int recordsPerPage;
    public int page;
    public String nextPage;
    public List<HoldingDatum> data;
}

class PricingDatum{
    public String date;
    public String security;
    public double price;
}

class Pricing{
    public int totalRecords;
    public int recordsPerPage;
    public int page;
    public String nextPage;
    public List<PricingDatum> data;
}
