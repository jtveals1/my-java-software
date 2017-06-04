package lab;

/**
 * PhoneBill.java
 * @author jtveals
 * 9-22-16
 */
public class PhoneBill {
	private String customerName;
	private String accountNumber;
	private String customerAddress;
	private String billingPeriod;
	private String billingDate;
	private double previousBill;
	private double currentBill;
	private double monthlyServicePlan;
	private double usageCharges;
	private double additionalCharges;
	private double taxesAndFees;
	private int    pageNumber;
	private double lateFees;
	
	/**
	 * Default Constructor
	 */
	
	public PhoneBill() {
		customerName = "";
		accountNumber = "";
		customerAddress = "";
		billingPeriod = "";
		billingDate = "";
		previousBill = 0;
		currentBill = 0;
		monthlyServicePlan = 0;
		usageCharges = 0;
		additionalCharges = 0;
		taxesAndFees = 0;
		pageNumber = 0;
		lateFees = 0;
		
	}
	
	/**
	 * Constructor
	 * @param customerName
	 * @param accountNumber
	 * @param customerAddress
	 */
	
	public PhoneBill(String customerName,String accountNumber, String customerAddress) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.customerAddress = customerAddress;
		billingPeriod = "";
		billingDate = "";
		previousBill = 0;
		currentBill = 0;
		monthlyServicePlan = 0;
		usageCharges = 0;
		additionalCharges = 0;
		taxesAndFees = 0;
		pageNumber = 0;
		lateFees = 0;
	}
	
	/**
	 * setCustomerName
	 * @param name
	 */
	
	public void setCustomerName(String name) {
		customerName = name;
	}
	
	/**
	 * getCustomerName
	 * @return customerName
	 */
	
	public String getCustomerName() {
		return customerName;
	}
	
	/**
	 * setAccountNumber
	 * @param accountNumber
	 */
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * getAccountNumber
	 * @return accountNumber
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * setCustomerAddress
	 * @param address
	 */
	
	public void setCustomerAddress(String address) {
		customerAddress = address;
	}

	/**
	 *getCustomerAddress 
	 * @return customerAddress
	 */
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	/**
	 * setBillingPeriod
	 * @param billingPeriod
	 */
	
	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
	}
	
	/**
	 * getBillingPeriod
	 * @return billingPeriod
	 */
	
	public String getBillingPeriod() {
		return billingPeriod;
	}
	
	/**
	 * setBillingDate
	 * @param date
	 */
	
	public void setBillingDate(String date) {
		billingDate = date;
	}
	
	/**
	 * getBillingDate
	 * @return billingDate
	 */
	
	public String getBillingDate() {
		return billingDate;
	}
	
	/**
	 * setPreviousBill
	 * @param bill
	 */
	
	public void setPreviousBill(double bill) {
		previousBill = bill;
	}
	
	/**
	 * getPreviousBill
	 * @return previousBill
	 */
	
	public double getPreviousBill() {
		return previousBill;
	}
	
	/**
	 * setCurrentBill
	 * @param bill
	 */
	
	public void setCurrentBill(double bill) {
		currentBill = bill;
	}
	
	/**
	 * getCurrentBill
	 * @return currentBill
	 */
	
	public double getCurrentBill() {
		return currentBill;
	}
	
	/**
	 * setMonthlyServicePlan
	 * @param serviceCharges
	 */
	
	public void setMonthlyServicePlan(double serviceCharges) {
		monthlyServicePlan = serviceCharges;
	}
	
	/**
	 * getMonthlyServicePlan
	 * @return monthlyServicePlan
	 */
	
	public double getMonthlyServicePlan() {
		return monthlyServicePlan;
	}
	
	/**
	 * setUsageCharges
	 * @param charges
	 */
	
	public void setUsageCharges(double charges) {
		usageCharges = charges;
	}
	
	/**
	 * getUsageCharges
	 * @return usageCharges
	 */
	
	public double getUsageCharges() {
		return usageCharges;
	}
	
	/**
	 * setAdditionalCharges
	 * @param charges
	 */
	
	public void setAdditionalCharges(double charges) {
		additionalCharges = charges;
	}
	
	/**
	 * getAdditionalCharges
	 * @return additionCharges
	 */
	
	public double getAdditionalCharges() {
		return additionalCharges;
	}
	
	/**
	 * setTaxesAndFees
	 * @param fees
	 */
	
	public void setTaxesAndFees(double fees) {
		taxesAndFees = fees;
	}
	
	/**
	 * getTaxesAndFees
	 * @return taxesAndFees
	 */
	
	public double getTaxesAndFees() {
		return taxesAndFees;
	}
	
	/**
	 * setPageNumber
	 * @param pageNumber
	 */
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	/**
	 * getPageNumber
	 * @return pageNumber
	 */
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	/**
	 * setLateFees
	 * @param lateFees
	 */
	
	public void setLateFees(double lateFees) {
		this.lateFees = lateFees;
	}
	
	/**
	 * getLateFees
	 * @return
	 */
	
	public double getLateFees() {
		return lateFees;
	}
	
	/**
	 * calculateBillDifference
	 * @param previousBill
	 * @param currentBill
	 * @return previousBill - currentBill
	 */
	
	public double calculateBillDifference() {
		return Math.abs(previousBill - currentBill);
	}
	
	/**
	 * calculateBill
	 * @currentBill
	 */
	
	public double calculateBill() {
		currentBill = monthlyServicePlan + usageCharges + additionalCharges + taxesAndFees;
		return currentBill;
	}
	
	/**
	 * calculateLateBill
	 * @return currentBill + lateFees
	 */
	
	public double calculateLateBill() {
		return currentBill + lateFees;
		
	}
}