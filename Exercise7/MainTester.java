import java.util.*;
import java.io.*;

public class MainTester{

  public static void main(String[] args){
    MainTester main = new MainTester();
    main.read();
  }

  public void read(){
    Scanner scan = new Scanner(System.in);
    String command = scan.nextLine();
    String[] commandSplit = command.split(" ");

    if(commandSplit[0].equals("-h")){
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
      read();
    }else if(commandSplit[0].equals("-n")){
      try{
	System.out.println("TEST OBJECT"+commandSplit[1]);
      }catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST OBJECT NOT SPECIFIED. '-h' FOR HELP");
      }
      read();
    }else if(commandSplit[0].equals("-f")){
      try{
	System.out.println("TEST FILE "+commandSplit[1]);
      }catch(ArrayIndexOutOfBoundsException exception){
	System.out.println("ERROR: TEST FILE NOT SPECIFIED. '-h' FOR HELP");
      }
      read();
    }else if(commandSplit[0].equals("exit")){
      System.exit(0);
    }else{
      System.out.println("Command not recognized, enter -h to view help menu");
      read();
    }
  }

}
