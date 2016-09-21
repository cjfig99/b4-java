import javax.swing.JOptionPane;

public class RunHere {

	public static void main(String[] args) {
		
		/*
		 * GRADED
		 * 1. add a drink dropdown JOP
		 * 2. when both pizza and drink have been selected JOP result
		 * "thank you for ordering a combo pizza and root beer"
		 */
		
		
		Object[] possibilities = {"Our special", "pepperoni", "cheese", "combo", "pineapple", "chicken"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please select a pizza",
		                    "Order a pizza",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    "Our special");

		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    setLabelD(s);
		    return;
		}

		//If you're here, the return value was null/empty.
		setLabelD("Come on, order a pizza");
		

		
		

	}// end of main
	
	public static void setLabelD(String setString){
		
		Object[] possibilities = {"Water", "Cocacola", "Pepsi", "Dr.Pepper", "Mtn. Dew", "Root beer"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please select a drink",
		                    "Select a Drink",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    "Water");

		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    setLabelD(s);
		    return;
		}

		//If you're here, the return value was null/empty.
		setLabelD("Come on, order a drink");
		
		
		
	}// end of setLabel
	
	

}// end of class
