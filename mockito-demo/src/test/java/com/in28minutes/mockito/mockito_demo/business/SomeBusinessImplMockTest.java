package com.in28minutes.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
	@Test
	void findTheGreatestFromSimpleTest() {
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{25,15,5});
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(25,result);
		
	}
	
	@Test
	void findTheGreatestFromOneValueTest() {		
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{5});
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(5,result);
		
	}
	
	@Test
	void findTheGreatestFromEmptyArrayTest() {		
		when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{});
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE,result);
		
	}
}

