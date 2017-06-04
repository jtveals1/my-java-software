package lab;

/**
 * 
 * @author jtveals
 *
 */
public class LoanApplication {

	private Applicant person;
	
	public LoanApplication(Applicant person){
		this.person = person;
	}
	
	public boolean isApproved(){
		double salary = person.getIncome();
		int years = person.getYearsEmployed();
		boolean approved = false;
		
		if ( salary >= 50000 && years >= 5 ) {
			approved = true;
		}
		return approved;
	}
}
