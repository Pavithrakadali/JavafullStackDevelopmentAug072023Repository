package Inheritance;

//1st assignment


interface Company
{
	void ComDetails(String name, final int id);
}

interface CompanyProducts
{
	void ProductDetails(String prdname,String prdType );
}

interface ProductCost
{
	void ProductPrice(int netamt, int disount);
}


interface FeedBack
{
	void SuggestUs(String feedback);
}


class ShowProductDetails implements Company,CompanyProducts,ProductCost,FeedBack
{
	public void ComDetails(String name, int id)
	{
		
		System.out.println("Company Name : "+name);
		System.out.println("Company Registration number : "+id);
	}
	

	public void ProductDetails(String prdname, String prdType)
	{
		
		System.out.println("Product Name : "+prdname);
		System.out.println("Product type : "+prdType);
	}
	
	
	public void ProductPrice(int netamt, int disount)
	{
		
		int a=(netamt/100)*disount;
		int total=netamt-a;
		
		System.out.println(" Net amout : "+netamt);
		System.out.println("Discout Allowed : "+a);
		System.out.println("Total amount : "+total);
	}

	
	public void SuggestUs(String feedback)
	{
		
		System.out.println(" What is your openion about our product : "+feedback);
	}

	void displayEnd()
	{
		System.out.println("thank you, please visit again");
	}
}



public class DEmo1 {

	public static void main(String[] args) {

		ShowProductDetails obj =new ShowProductDetails();
		obj.ComDetails("Hp", 5324);
		obj.ProductDetails("laptop", "Electronic device");
		obj.ProductPrice(45000, 15);
		obj.SuggestUs("good");
	   obj.displayEnd();
	   }

}
	
