import static org.junit.Assert.*;
import org.junit.Test;
public class EdgeConvertCreateDDLTest {

  @Test
  public void testDatabaseName() {
    CreateDDLMySQL ddl = new CreateDDLMySQL();
    assertEquals("This DB name should be null",null, ddl.getDatabaseName());
    assertEquals("This product name should be MySQL","MySQL", ddl.getProductName());
    assertEquals("This SQL String should be string", "MySQLDB", ddl.getSQLString());
  }
}
