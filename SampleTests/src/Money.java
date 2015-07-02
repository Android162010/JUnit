
public class Money {
	
	private String typeOfCurrency,ame,jap,mex,dne;
	
	private double amountOfCurrency ;
	
	
	public Money(String type, double amount){
	typeOfCurrency = type;
	amountOfCurrency = amount ;	
		
		ame = "American";
		jap = "Japan";
		mex ="Mexico";
		dne= "Does Not Exist yet";
	}
	 
	public void checkTypesOfCurrency(){
		
		
		if(typeOfCurrency.equals("dollars")){
			typeOfCurrency = ame;
		
		}
		if(typeOfCurrency.equals("yen")){
			typeOfCurrency = jap;
		
		}
		if(typeOfCurrency.equals("pesos")){
			typeOfCurrency = mex;
		
		}			
		
				
	}
	public String getTypeOfCurrency(){
		
		return typeOfCurrency;
	}
	
	public double getAmount(){
		return amountOfCurrency ;
		
	}
	
	
	

}
