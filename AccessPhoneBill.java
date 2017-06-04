package lab;

import javax.swing.JOptionPane;

/**
 * AccessPhoneBill.java
 * @author Jason Veals
 * 9-22-16
 */

public class AccessPhoneBill {
	
	public static void main(String[] args) {
		
		PhoneBill myBill = new PhoneBill("Jason Veals",
				 "12434546-9",
				 "6647 Piney Mtn Road\n" +
				 "Durham, NC 27713");
		setPhoneBill(myBill);
		String customerInfo = getCustomerInfo(myBill);
		String charges      = getCharges(myBill);
		String total        = getTotal(myBill);
		String output = customerInfo + charges + total;
		
		JOptionPane.showMessageDialog(null, output, "VERIZON", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
		public static void setPhoneBill( PhoneBill myBill) {
			myBill.setBillingPeriod("Aug 1 - Aug 31");
			myBill.setBillingDate("08 04 2016");
			myBill.setPageNumber(1);
			myBill.setPreviousBill(156.77);
			myBill.setMonthlyServicePlan(78.99);
			myBill.setUsageCharges(2.32);
			myBill.setAdditionalCharges(40.01);
			myBill.setTaxesAndFees(20.43);
			myBill.setLateFees(10);
		}
		
		public static String getCustomerInfo( PhoneBill myBill) {
			String customerInfo = 
				String.format("Customer Name          Account Number        Billing Period        Bill Date         Page\n" +
		                      "---------------------------------------------------------------------------------------------------------------\n" +
				              myBill.getCustomerName()  + "                  " +
		                      myBill.getAccountNumber() + "                " +
				              myBill.getBillingPeriod() + "      " +
		                      myBill.getBillingDate()   + "     " +
				              myBill.getPageNumber()    + "          \n\n" +
		                      "YOUR PHONE BILL\n" +  
		                      "---------------------------------------------------------------------------------------------------------------\n" +
				              "Balance Summary\n" + 
		                      "Previous Balance:             " + myBill.getPreviousBill() +
		                      "\n\n\n\n\n" +
		                      "---------------------------------------------------------------------------------------------------------------\n");
		    return customerInfo;
		}
		
		public static String getCharges( PhoneBill myBill) {
			String charges =
				String.format("Monthly Service Charge        " + myBill.getMonthlyServicePlan() + "\n" +
						      "Additional Usage Charges      " + myBill.getUsageCharges()       + "\n" + 
						      "Other Charges                         " + myBill.getAdditionalCharges()  + "\n" +
						      "Taxes, Surcharges, Fees     " + myBill.getTaxesAndFees()       + "\n");
			return charges;
		}
		
		public static String getTotal( PhoneBill myBill) { 
			String total = 
				String.format("                                               $ %.2f\n\n",myBill.calculateBill()) +
				String.format("   Total Due by Sept 3         $ %.2f\n",myBill.getCurrentBill()) +
		        String.format("Total due after Sept 3        $ %.2f\n",myBill.calculateLateBill());
			return total;
		}
		
}

