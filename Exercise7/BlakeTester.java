import java.util.*;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class BlakeTester{
  
  /*
   *Test EdgeConvertCreateDDLTest.java
   *Test EdgeTableTest.java
   *Example Command:
   *java MainTester -n "EdgeConvertCreateDDLTest, testProductName, MySQL"
  */

  public static void main(String[] args){
    BlakeTester test = new BlakeTester();
    test.read(args);
    try{
      EdgeConvertCreateDDLTest edgeConvert = new EdgeConvertCreateDDLTest();
      EdgeTableTest edgeTest = new EdgeTableTest();
      edgeConvert.setUp();
      edgeConvert.setProductName("MySQL");
      edgeConvert.testProductName(); 
      
      edgeTest.setUp();
      edgeTest.setRelatedFields(1);
      edgeTest.relatedFieldsTest();
    } catch(Exception e){
      e.printStackTrace();
    }
  }


  public void read(String[] arguments){
    String[] readArgs = arguments;
    //Scanner scan = new Scanner(System.in);
    //String command = scan.nextLine();
    //String[] commandSplit = command.split(" ")
    if(readArgs[0].equals("-h")){
      System.out.println();
      System.out.println("************* H E L P ***************************");
      System.out.println();
      System.out.println();
      System.out.println("------------ COMMANDS ---------------------------");
      System.out.println("-n <test_object> ---------- Run tests utilizing a test object");
      System.out.println("-f <test_file>  ----------- Run tests utilizing a test object file");
      System.out.println("exit           ------------ Exit application");
      System.out.println("-------------------------------------------------");
      System.out.println();
    }else if(readArgs[0].equals("-n")){
      try{
	System.out.println(readArgs[0]);
	System.out.println("TEST OBJECT"+readArgs[1]);
      }catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST OBJECT NOT SPECIFIED. '-h' FOR HELP");
      }
    }else if(readArgs[0].equals("-f")){
      try{
	System.out.println("TEST FILE "+readArgs[1]);
      		File file = new File("" + readArgs[1]);
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
	}catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST FILE NOT SPECIFIED. '-h' FOR HELP");
      }
	catch(IOException io){
		io.printStackTrace();
	}
    }else if(readArgs[0].equals("exit")){
      System.exit(0);
    }else{
      System.out.println("Command not recognized, enter -h to view help menu");
    }
  }

}
