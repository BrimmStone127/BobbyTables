package com.bobbytables.app;

import static org.junit.Assert.*;
import org.junit.*;

public class EdgeTableTest{
  
	EdgeTable testObj;


	@Before
	public void setUp() throws Exception {
		testObj = new EdgeTable("1|2");
		runner();
	}

	public void runner(){
		testGetNumFigure();
	 	testGetName();
	 	//testAddRelatedTable();
		//testGetRelatedTablesArray();
		//testGetRelatedFieldsArray();
		//testSetRelatedField();
		//testGetRelatedTablesArray();
		//testGetNativeFieldsArray();
		//testAddNativeField(1);
	}

	@Test
   public void testGetNumFigure() {
      assertEquals("NumFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
   }
   
	@Test
   public void testGetName() {
      assertEquals("Name was intialized to 2, so it should be 2","2",testObj.getName());
   }
   
/*
	@Test
   public void testAddRelatedTable() {
      testObj.addRelatedTable(new Integer(relatedTable));
		assertArrayEquals("Name was intialized to 2, so it should be 2",testObj.getRelatedTablesArray(),testObj.getRelatedTablesArray());
   }
   
	@Test
   public void testGetRelatedTablesArray() {
		assertArrayEquals("Name was intialized to 2, so it should be 2",testObj.getRelatedTablesArray(),testObj.getRelatedTablesArray());
   }
   
	@Test
   public void testGetRelatedFieldsArray() {
      assertArrayEquals("Name was intialized to 2, so it should be 2",testObj.getRelatedFieldsArray(),testObj.getRelatedFieldsArray());
   }
   
	@Test
   public void testSetRelatedField(int index, int relatedValue) {
      testObj.setRelatedField(index, relatedValue);
		assertArrayEquals("Name was intialized to 2, so it should be 2",testObj.getRelatedFieldsArray(),testObj.getRelatedFieldsArray());
   }
   
	@Test
   public void testGetNativeFieldsArray() {
      assertArrayEquals("Name was intialized to 2, so it should be 2",testObj.getNativeFieldsArray(),testObj.getNativeFieldsArray());
   }


*/
}
