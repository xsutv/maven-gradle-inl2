package se.yrgo.models;

import org.junit.jupiter.api.Test;
import se.yrgo.utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {


	//VG
	@Test
	public void testDueDate() {
		Customer customer = new Customer("", "", "",
				"", "", "@gmail.com", 555, GenderType.MALE);
		Book bok = new Book(1, "Falafel", "", "", "", 0);
		Loan loan = new Loan(1,customer, bok );
		assertEquals(LocalDate.now().plusDays(14), loan.getDueDate());
   }
}