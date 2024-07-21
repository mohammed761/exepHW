package Exceptions;

import java.util.Arrays;

public class run {

	public static void main(String[] args) {
        // Create SalesPerson with valid data
        SalesPerson sp1 = new SalesPerson("John Doe", 28,5000, "123-ABC");
        System.out.println(sp1);
        System.out.println("-----------------");

        // Create SalesPerson with invalid data (negative salary)
        SalesPerson sp2 = new SalesPerson("Jane Doe", 20,1000, "12A-BC3");
        System.out.println(sp2);
        System.out.println("-----------------");
        SalesPerson[] salesPeople = {sp1, sp2};
        Arrays.sort(salesPeople);

        // Printing the sorted SalesPerson objects
        for (SalesPerson sp : salesPeople) {
            System.out.println(sp);
        }
        
	}

}
