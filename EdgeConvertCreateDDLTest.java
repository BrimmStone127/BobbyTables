import static org.junit.Assert.*;
import org.junit.Test;
public abstract class EdgeConvertCreateDDLTest extends EdgeConvertCreateDDL {

  @Override
  public abstract String getDatabseName();
  public abstract String getProductName();
  public abstract String getSQLString();
  public abstract void createDDL();

  @Test
  public void testDatabaseName() {
    EdgeConvertCreateDDL tester = new EdgeConvertCreateDDL();
    assertEquals("Database name should be Dicks", "Dicks", tester.getDatabaseName());
  }
}
