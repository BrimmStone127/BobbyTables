import java.util.*;
import java.io.*;

public class MainTester{
  
  /*
   *Test EdgeConvertCreateDDLTest.java
   *Test EdgeTableTest.java
   *Example Command:
   *java MainTester -n "EdgeConvertCreateDDLTest, testProductName, MySQL"
  */

  public static void main(String[] args){
    MainTester main = new MainTester();
    main.read(args);
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
	String[] info = readArgs[1].split(",");
	if(info[0].equals("EdgeConvertCreateDDLTest")){
	  try{
	    EdgeConvertCreateDDLTest ecc = new EdgeConvertCreateDDLTest();
	    ecc.setUp();
	    ecc.setProductName(info[2]);
	    ecc.testProductName();
	  }catch(Exception e){e.printStackTrace();}
	}else if(info[0].equals("EdgeTableTest")){
	  try{
	    EdgeTableTest ett = new EdgeTableTest();
	    ett.setUp();
	    ett.setRelatedFields(1);
	    ett.relatedFieldsTest();
	  }catch(Exception e){e.printStackTrace();}
	}else{
	  System.out.println("ERROR");
	}
      }catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST OBJECT NOT SPECIFIED. '-h' FOR HELP");
      }
    }else if(readArgs[0].equals("-f")){
      try{
	System.out.println("TEST FILE "+readArgs[1]);
      }catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST FILE NOT SPECIFIED. '-h' FOR HELP");
      }
    }else if(readArgs[0].equals("exit")){
      System.exit(0);
    }else{
      System.out.println("Command not recognized, enter -h to view help menu");
    }
  }

}
