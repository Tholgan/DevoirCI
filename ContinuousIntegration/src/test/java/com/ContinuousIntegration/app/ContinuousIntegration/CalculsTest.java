package com.ContinuousIntegration.app.ContinuousIntegration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class CalculsTest extends TestCase {
	Calculs ca = null;
	Calculs ca2 = null;
	Calculs ca3 = null;
	Calculs ca4 = null;
	
	protected void setUp() throws Exception {
    	ca = new Calculs(2,2);
     	ca2 = new Calculs(1,1);
    	ca3 = new Calculs(2,2);
    	ca4 = new Calculs(10,8);
	}

	public void testMultiplier(){
		int result = ca.multiplier();
		assertEquals("MultiplierKO", 4, result);
	}
		
	public void testAdditionner(){
		int result = ca2.additionner();
		assertEquals("AdditionnerKO", 2, result);
	}
		
	public void testDiviser(){
		int result = ca3.diviser();
		assertEquals("DiviserKO", 1, result);
	}
		
	public void testSoustraire(){
		int result = ca4.soustraire();
		assertEquals("SoustraireKO", 2, result);
	}
		
	public void testDiviserErreur(){
		Calculs ca = new Calculs(2,0);
		int result = ca.diviser(); 
		assertEquals(0, result);
	}
	
	public void testr(){
		Calculs ca = new Calculs(2,0);
		int result = ca.diviser(); 
		assertEquals(0, result);
	}
	
	@ParameterizedTest(name = "test numero {index}, on test les valeurs {0},{1} et on attend le résultat {2}")
	@MethodSource("chargerJeuTest")
	
	void additionnerTest(int nb1, int nb2, int result)
	{
		Calculs calc = new Calculs(nb1, nb2);
		assertEquals(result, calc.additionner());
	}
	/*
	static Stream<Arguments> chargerJeuTest() throws Throwable
	{
		return Stream.of(Arguments.of(2,2,4), Arguments.of(4,8,12),	Arguments.of(8,8,2));
	}*/
}