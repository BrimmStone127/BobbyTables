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
      System.out.println("HELP");
    }else if(commandSplit[0].equals("-n")){
      System.out.println("TEST OBJECT");
    }else if(commandSplit[0].equals("-f")){
      System.out.println("TEST FILE "+commandSplit[1]);
    }else{
      System.out.println("Command not recognized, enter -h to view help menu");
      read();
    }
  }

}
