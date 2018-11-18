package com.bobbytables.app;

import static org.junit.Assert.*;
import org.junit.Test;
public class EdgeConvertCreateDDLTest {
  CreateDDLMySQL ddl = new CreateDDLMySQL();

  @Test
  public void testDatabaseName() {
    assertEquals("This DB name should be null",null, ddl.getDatabaseName());
  }
  @Test
  public void testProductName() {
    assertEquals("This product name should be MySQL","MySQL", ddl.getProductName());
  }
  
  /*@Test
  public void testSQLString() {
    ddl.getSQLString();
    assertEquals("This DB name should be MySQLDB","MySQLDB", ddl.getDatabaseName());
  }*/
}
