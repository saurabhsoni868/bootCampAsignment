package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import main.EmailService;
import main.Order;

class EmailServiceTest {


	EmailService emailService = EmailService.getInstance();
	
	Order order = new Order(10, "Piano", 60.5);
	
	
	@Test
	void Should_Throw_RuntimeException() {
		
		//when
		Executable executable = () -> emailService.sendEmail(order);
		
		//then
		assertThrows(RuntimeException.class, executable);
		
	}
	
	@Test
	void Should_ReturnTrue_When_String_matches_withThatOfOrder() {
		
		//when
		boolean status = emailService.sendEmail(order, "Piano");
		
		//then
		assertTrue(status);
		
	}
	
	@Test
	void Should_ReturnTrue_When_It_Returns_TheInstance() {
		
		
		//when
		EmailService emailService2 = emailService.getInstance();
		
		//then
		assertEquals(emailService2, emailService);
		
		
	}

}








