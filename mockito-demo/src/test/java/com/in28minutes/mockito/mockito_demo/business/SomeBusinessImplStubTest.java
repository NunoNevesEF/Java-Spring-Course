package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void test() {
		DataService dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(25,result);
		
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retreiveAllData() {
		return new int[]{25,15,5};
	}
	
}
