package Exceptions;

public class SalesPerson extends Employee implements Comparable<SalesPerson> {
	private String certificationNumbe;

	public SalesPerson(String name, int age, double salary,String certificationNumb) {
		super(name, age, salary);
		try {
			requireValidCertificationNumber(certificationNumb);
			this.certificationNumbe=certificationNumb;
		}
		catch(InvalidEmployeeCertException e) {
			System.out.println("Error setting certification number: " + e.getMessage());
		}
		
	}
	private static boolean checkString(String s) {
		if(s==null||s.length()!=7)
			return false;
		if(s.indexOf('-')!=3)
			return false;
		String ch = s.substring(0, 3);
	    String letters = s.substring(4, 7);
	    for(char c:ch.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
	    }
	    
        return  letters.matches("[A-Za-z]{3}");

	}
	
	private static String requireValidCertificationNumber(String certNum) throws  InvalidEmployeeCertException{
		if(!checkString(certNum)) {
			throw new InvalidEmployeeCertException("Certification number must be in the format ###???.");
		}
		return certNum;
	}
	@Override
	public String toString() {
		return "SalesPerson [certificationNumbe=" + certificationNumbe + super.toString() + "]";
	}
	
	
    @Override
    public int compareTo(SalesPerson other) {
        return Double.compare(this.getSalary(), other.getSalary());
    }
	
	
}
