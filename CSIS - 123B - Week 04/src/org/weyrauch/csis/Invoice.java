package org.weyrauch.csis;

public class Invoice {
	
	private String PartNumber;
	private String Description;
	private int Quantity;
	private double PricePerItem;
	

	Invoice(String partnumber, String description, int quantity, double priceperiten) {

		Description = description;		
		PricePerItem = priceperiten;
		PartNumber = partnumber;
		Quantity = quantity;
	}
	Invoice() {

		Description = "";		
		PricePerItem = 0;
		PartNumber = "";
		Quantity = 0;
	}
	
	// Public methods to set the encapsulated class variables
	public void setQuantity(int Q){
		
		Quantity = Q;
	}
	
	public void setPartNumber(String PN){
			
		PartNumber = PN;
	}
	
	public void setPricePerItem(double PPI){
		
		PricePerItem = PPI;
	}
	
	public void setDescription(String Desc){
		
		Description = Desc;
			
	}
	
	// Methods to retrieve encapsulated class variables
	public int getQuantity(){
		
		return Quantity;
	}
	
	public String getPartNumber(){
			
		return PartNumber;
	}
	
	public double getPricePerItem(){
		
		return PricePerItem;
	}
	
	public String getDescription(){
		
		return Description;		
		
	}
	
	//Method to calculate the total invoice amount
	public double getInvoiceAmount(){
		
		
		
		double invoiceAmount = (PricePerItem*Quantity);
		
		if(invoiceAmount >= 0)
			return invoiceAmount;
		else 
			return 0;
		
	
		
		
	}
	
	

}
