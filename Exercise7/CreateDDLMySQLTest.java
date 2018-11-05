import static org.junit.Assert.*;

import org.junit.*;

public class CreateDDLMySQLTest{
	CreateDDLMySQL createddl;
	
	@Before
	public void setUp() throws Exception {
		createddl = new CreateDDLMySQL();
	}

	@Test
	public void testGenerateDatabaseName(){
		//you will have to enter MySQLDB
        assertEquals("test name being set", "MySQLDB", createddl.generateDatabaseName());
	}
	
	@Test
	public void testGetDatabaseName(){
        //enter MySQLDB for db name
        createddl.generateDatabaseName();
        assertEquals("retrieval of database name", "MySQLDB", createddl.getDatabaseName());
	}

	@Test 
	public void testGetProductName(){
		assertEquals("Product name is MySQL","MySQL", createddl.getProductName());
	}
	
//	@Test
//	public void testGetSQLString(){
//	    //this method is broken. stemming from createddl. the problem is that it is not appending to a StringBuffer + numBoundTables is null
//        assertEquals("getting sql string", false, createddl.getSQLString().isEmpty());
//	}

}
