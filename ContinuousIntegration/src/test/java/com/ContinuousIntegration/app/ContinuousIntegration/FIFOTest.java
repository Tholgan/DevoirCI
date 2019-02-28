package com.ContinuousIntegration.app.ContinuousIntegration;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
class FIFOTest extends TestCase {
	

	void test() {
		fail("Not yet implemented");
	}
	
	
	static Stream<Arguments> chargerJeuTestAdd() throws Throwable
	{
		return Stream.of(Arguments.of(2,2), Arguments.of(1,1));
	}
	
	@ParameterizedTest(name = "test numero {index}, on test la valeur {0} et on attend le résultat {1}")
	@MethodSource("chargerJeuTestAdd")
	public void testAdd(Integer myInt, Integer result) throws Exception{
		FIFO fifo1 = new FIFO();
		fifo1.add(myInt);
		assertEquals(result, fifo1.first());
	}
	
	
	
	
	static Stream<Arguments> chargerJeuTestFirstSingleton() throws Throwable
	{
		return Stream.of(Arguments.of(2,2), Arguments.of(1,1));
	}
	
	@ParameterizedTest(name = "test numero {index}, on test la valeur {0} et on attend le résultat {1}")
	@MethodSource("chargerJeuTestFirstSingleton")
	public void testFirstSingleton(Integer myInt, Integer result) throws Exception{
		FIFO fifo1 = new FIFO();
		fifo1.add(myInt);
		assertEquals(result, fifo1.first());
	}
	
	
	
	static Stream<Arguments> chargerJeuTestEmptyFalse() throws Throwable
	{
		return Stream.of(Arguments.of(false));
	}
	
	@ParameterizedTest(name = "test numero {index}, on test la valeur {0} et on attend le résultat {0}")
	@MethodSource("chargerJeuTestEmptyFalse")
	public void testIsEmptyFalse(boolean result) throws Exception{
		FIFO fifo1 = new FIFO();
		fifo1.add(1);
		assertEquals(result, fifo1.isEmpty());
	}
	
	static Stream<Arguments> chargerJeuTestEmptyTrue() throws Throwable
	{
		return Stream.of(Arguments.of(true));
	}
	
	@ParameterizedTest(name = "test numero {index}, on test la valeur {0} et on attend le résultat {0}")
	@MethodSource("chargerJeuTestEmptyTrue")
	public void testIsEmptyTrue(boolean result) throws Exception{
		FIFO fifo1 = new FIFO();
		assertEquals(result, fifo1.isEmpty());
	}
	
	
	static Stream<Arguments> chargerJeuTestRemoveFirst() throws Throwable
	{
		return Stream.of(Arguments.of(1, 2, 3, 2), Arguments.of(3, 1, 2, 1) );
	}
	
	@ParameterizedTest(name = "test numero {index}, on test la valeur {0}, {1}, {2} et on attend le résultat {3}")
	@MethodSource("chargerJeuTestRemoveFirst")
	public void testRemoveFirst(Integer myInt1, Integer myInt2, Integer myInt3, Integer result) {
		FIFO fifo = new FIFO();
		fifo.add(myInt1);
		fifo.add(myInt2);
		fifo.add(myInt3);
		fifo.removeFirst();
		assertEquals(result, fifo.first());
	}
	
	static Stream<Arguments> chargerJeuTestSize() throws Throwable
	{
		return Stream.of(Arguments.of(1) );
	}
	
	@ParameterizedTest(name = "test numero {index}, on test et on attend le résultat {0}")
	@MethodSource("chargerJeuTestSize")
	public void testSize(int result) {
		FIFO fifo = new FIFO();
		fifo.add(1);
		assertEquals(result, fifo.size());
	}
	
	static Stream<Arguments> chargerJeuTestSizeNull() throws Throwable
	{
		return Stream.of(Arguments.of(0) );
	}
	
	@ParameterizedTest(name = "test numero {index}, on test et on attend le résultat {0}")
	@MethodSource("chargerJeuTestSizeNull")
	public void testSizeNull(int result) {
		FIFO fifo = new FIFO();
		assertEquals(result, fifo.size());
	}

}
