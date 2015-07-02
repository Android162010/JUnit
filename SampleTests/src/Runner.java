
public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Money m1 = new Money("dollars", 3.0);
	m1.checkTypesOfCurrency();
	System.out.println(m1.getTypeOfCurrency());
	System.out.print(m1.getAmount());

	
	}

}
