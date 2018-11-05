import static org.junit.Assert.*;
import org.junit.*;

public class EdgeTableTest{
  
  private EdgeTable testObj;
  private int relatedFields; 
  private int numFigure;
  private String name;  

  
  public void setUp() throws Exception{
    testObj = new EdgeTable("1|BolognaSandwich");
    runner();
  }

  public void runner(){
    getNumFigureTest();
    getNameTest();
    relatedFieldsTest();
  }

  @Test
  public void relatedFieldsTest(){
    testObj.addNativeField(1);
    //value was 1
    assertEquals("Field added to NativeField array, expected field - 1",this.getRelatedFields(),testObj.getNativeFieldsArray());
  }

  @Test 
  public void getNumFigureTest(){
    assertEquals("numFigureTest initialized to 1, expected output - 1",1,testObj.getNumFigure());
  }

  @Test
  public void getNameTest(){
    assertEquals("Name set to 'BolognaSandwich', expected output - 'BolognaSandwich'", "BolognaSandwich", testObj.getName());
  }

  public void setRelatedFields(int _relatedFields){
    this.relatedFields = _relatedFields;
  }

  public int getRelatedFields(){
    return this.relatedFields;
  }
  
  public void setNumFigure(int _numFigure){
    this.numFigure = _numFigure;
  }
  
  public void setName(String _name){
    this.name = _name;
  }
}
