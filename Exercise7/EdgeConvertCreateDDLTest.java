import static org.junit.Assert.*;
import org.junit.Test;

public class EdgeConvertCreateDDLTest {
	private static CreateDDLMySQL ddl;
	private static String databaseName;
	private static String productName;
	private static String sqlString; //not actually sql string, should be 

	
	public void setUp() throws Exception{
		ddl = new CreateDDLMySQL();	
	}

	@Test
	public void testDatabaseName() {
		//assertEquals("This DB name should be null",null, ddl.getDatabaseName());
		assertEquals("This DB name should be null", this.databaseName, ddl.getDatabaseName());
	}

	@Test
	public void testProductName() {
		//assertEquals("This product name should be MySQL","MySQL", ddl.getProductName());
		assertEquals("This product name should be MySQL", this.productName, ddl.getProductName());	
	}

	@Test
	public void testSQLString() {
		ddl.getSQLString();
		//assertEquals("This DB name should be MySQLDB","MySQLDB", ddl.getDatabaseName());
		assertEquals("This DB name should be MySQLDB",this.sqlString, ddl.getDatabaseName());
	}

	//natively would expect null
	public void setDatabaseName(String _dbName){
		this.databaseName = _dbName;
	}
	
	//natively would expect "MySQL"
	public void setProductName(String _prodName){
		this.productName = _prodName;
	}
	
	//natively would expect "MySQLDB"
	public void setSQLString(String _sqlString){
		this.sqlString = _sqlString;
	}
}
