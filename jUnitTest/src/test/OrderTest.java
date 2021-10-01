package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Order;

class OrderTest {
	
	private Order order;
	
	@BeforeEach
	void setup() {
		this.order = new Order(10, "RubiksCube", 50.0);
	}
	

	@Test
	void Should_ReturnTrue_When_ItemNameMatches() {
		
		//when
		String testItemName = order.getItemName();
		
		//then
		assertEquals("RubiksCube", testItemName);
		
	}
	
	@Test
	void Should_ReturnTrue_When_QuantityMatches() {
		
		
		//when
		int testQuantity = order.getQuantity();
		
		//then
		assertEquals(10, testQuantity);
		
	}
	
	@Test
	void Should_ReturnTrue_When_PriceMatches() {
		
		
		//when
		double testPrice = order.getPrice();
		
		//then
		assertEquals(50.0, testPrice);
		
	}
	
	
	@Test
	void Should_ReturnTrue_When_setItemNameWorks() {
		
		
		//when
		Order order1 = order.setItemName("Book");
		
		//then
		assertEquals(order1, order);
		
	}
	
	@Test
	void Should_ReturnTrue_When_setPriceWorks() {
		
		
		//when
		Order order1 = order.setPrice(60.5);
		
		//then
		assertEquals(order1, order);
		
	}
	
	@Test
	void Should_ReturnTrue_When_setQuantityWorks() {
		
		
		//when
		Order order1 = order.setQuantity(8);
		
		//then
		assertEquals(order1, order);
		
	}
	
	@Test
	void Should_ReturnTrue_When_setPriceWithTexWorks() {
		
		
		//when
		Order order1 = order.setPriceWithTex(80.5);
		
		//then
		assertEquals(order1, order);
		
	}
	
	@Test
	void Should_ReturnTrue_When_PriceWithTexMatchesWorks() {
		
		
		Order order1 = order.setPriceWithTex(80.5);
		//when
		double priceWithTex1 = order.getPriceWithTex();
		
		//then
		assertEquals(priceWithTex1, 80.5);
		
	}
	
}












