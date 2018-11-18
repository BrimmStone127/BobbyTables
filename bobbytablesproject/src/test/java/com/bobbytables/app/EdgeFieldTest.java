package com.bobbytables.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
   
	EdgeField testObj;

	@Before
	public void setUp() throws Exception {
        	testObj = new EdgeField("1|2");
        	runner();
	}
	
	public void runner() {
		testGetNumFigure();
		testGetName();
		testSetTableID();
		testSetTableBound();
		testSetFieldBound();
		testSetDisallowNull();
		testSetIsPrimaryKey();
		testSetDefaultValue();
		testSetDataType();
		testSetVarcharValue();
	}

	@Test
	public void testGetNumFigure() {
		assertEquals("NumFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName() {
		assertEquals("Name was intialized to 2, so it should be 2","2",testObj.getName());
	}

	@Test
	public void testGetTableID() {
		assertEquals("Table ID was initialized to 3, so it should be 3",3,testObj.getTableID());
	}

	@Test
	public void testSetTableID() {
		testObj.setTableID(3);
		assertEquals("Table ID was initialized to 3, so it should be 3",3,testObj.getTableID());
	}


	@Test
	public void testSetTableBound() {
		testObj.setTableBound(3);
		assertEquals("TableBound was intilized to 3, so it should be 3",3, testObj.getTableBound());
	}

	@Test
	public void testSetFieldBound() {
		testObj.setFieldBound(5);
		assertEquals("Fieldbound was intilized to 5 so it should be 5",5, testObj.getFieldBound());
	}

	@Test
	public void testSetDisallowNull() {
		testObj.setDisallowNull(true);
		assertEquals("DisallowNull should be true",true,testObj.getDisallowNull());
	}

	@Test
	public void testSetIsPrimaryKey() {
		testObj.setIsPrimaryKey(true);
		assertEquals("IsPrimaryKey should be true",true,testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetDefaultValue() {
		testObj.setDefaultValue("3");
		assertEquals("DefaultValue should be 3","3",testObj.getDefaultValue());
	}

	@Test
	public void testSetVarcharValue() {
		testObj.setVarcharValue(5);
		assertEquals("Varchar value should be 5",5,testObj.getVarcharValue());
	}

	@Test
	public void testSetDataType() {
		testObj.setDataType(1);
                assertEquals("DataType should be what you set it to 1",1,testObj.getDataType());
	}


}
