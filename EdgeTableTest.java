import static org.junit.Assert.*;
import org.junit.Test;

public class EdgeTableTest extends EdgeTable {
  
  @Before
  public void setUp() throws Exception{
    testObj = new EdgeTable("1|BolognaSandwich");
    runner();
  }

  public void runner(){
    getNumFigureTest();
    getNameTest();
  }

  @Test 
  public void getNumFigureTest(){
    assertEquals("numFigureTest initialized to 1, expected output - 1",1,testObj.getNumFigure());
  }

  @Test
  public void getNameTest(){
    assertEquals("Name set to 'BolognaSandwich', expected output - 'BolognaSandwich'", "BolognaSandwich", testObj.getName());
  }

}
