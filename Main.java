/**
 * @input  user chooses one of two options
 * @output different 
 * @logic  the user chooses one of two options to decide their path the user also has some 
 *         of their choices chosen for them by calculating their stats and random numbers
 * @date   8/--/2016
 */
import java.util.Scanner;
public class ConvertToDecimalToBinaryToHexa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter what you want to convert from,(decimal,binary,hexa) : ");
        String from = input.next();
        System.out.print("Enter what you want to convert to,(decimal,binary,hexa) : ");
        String to = input.next();
        System.out.print("Enter the number you want to convert: ");
        int fromNum = input.nextInt();
            if ("decimal".equals(from)){
                if ("binary".equals(to)){
                    System.out.println("from " + from + " to " + to);
                }else if ("hexa".equals(to)){
                    System.out.println("from " + from + " to " + to);
                }
            }
      
      
            if ("binary".equals(from)){
                if ("decimal".equals(to)){
                    System.out.println("from " + from + " to " + to);
                }else if ("hexa".equals(to)){
                    System.out.println("from " + from + " to " + to);
                }
            }
      
      
            if ("hexa".equals(from)){
                if("decimal".equals(to)){
                 System.out.println("from " + from + " to " + to);
                } else if ("binary".equals(to)){
                    System.out.println("from " + from + " to " + to);
                }
            }
            System.out.println("End");
        }
    }
/* System.out.print("Enter what you want to convert from,(decimal,binary,hexa) : ");
  String from = input.next();
  System.out.print("Enter what you want to convert to,(decimal,binary,hexa) : ");
  String to = input.next();
  System.out.print("Enter the number you want to convert: ");
  int fromNum = input.nextInt();
  if (from == "decimal"){
    if (to == "binary"){
        String binary = "";
  if (fromNum > 0){
    while (fromNum > 0){
      int remainder = fromNum % 2;
        binary += remainder;
        fromNum = (fromNum / 2);
        }   
    }
    else if (fromNum < 0){
        int posTen = Math.abs(fromNum);
        while (posTen > 0){
      int remainder = posTen % 2;
        binary += remainder;
        posTen = (posTen / 2);
        }   
        String negative = "-";
        binary = negative + binary;
      }
    System.out.println(binary);
    }
    else if (to == "hexa"){
              String hexa = "";
              if (fromNum > 0){
                while (fromNum > 0){
                  int remainder = fromNum % 16;
                  if (remainder < 10){
                  hexa += remainder;
                  fromNum = (fromNum / 16);
                  }else if (remainder > 10){
                      char remainderChar = 'Z';
                        switch (remainder){
                            case 10:
                                remainderChar = 'A';
                                break;
                            case 11:
                                remainderChar = 'B';
                                break;
                            case 12:
                                remainderChar = 'C';
                                break;
                            case 13:
                                remainderChar = 'D';
                                break;
                            case 14:
                                remainderChar = 'E';
                                 break;
                            case 15:
                                remainder = 'F';
                                break;
                    }
                        hexa += remainderChar;
                        System.out.println(remainderChar);
                        fromNum = (fromNum / 16);
                        System.out.println(fromNum);
                        
                  }
        }
                
    System.out.println(hexa);
    }
    else if (fromNum < 0){
        int posTen = Math.abs(fromNum);
        while (posTen > 0){
      int remainder = posTen % 16;
        hexa += remainder;
        posTen = (posTen / 16);
        }   
        String negative = "-";
        hexa = negative + hexa;
      }
    System.out.println(hexa);
    }
  }*/
