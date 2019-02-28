package com.ContinuousIntegration.app.ContinuousIntegration;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriTableauTest {
	int ca[] = {1,4,3,2};
	

	@Test
	void test() {
	}
	
	@Test
	public void testTrieCroissant() {
		int tab[] = {1,2,3,4};
		TriTableau.triCroissant(ca);
		assertArrayEquals(ca, tab);
	}
	
	@Test
	public void testTrieDecroissant() {
		int tab[] = {4,3,2,1};
		TriTableau.triDecroissant(ca);
		assertArrayEquals(ca, tab);
	}

}
