import java.util.Scanner;
public class Converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter what you want to convert from,(decimal,binary,hexa) : ");
        String from = input.next();
        switch(from){
            case "decimal":
                System.out.print("Enter what you want to convert to,(binary or hexa) : ");
                break;
            case "binary":
                System.out.print("Enter what you want to convert to,(decimal or hexa) : ");
                break;
            case "hexa":
                System.out.print("Enter what you want to convert to,(decimal or binary) : ");
                break;
        }
        String to = input.next();
        String fromNumber = "";
        int fromNum = 0;
        if (from == "hexa"){
        System.out.print("Enter the number you want to convert: ");
        fromNumber = input.next();
        }else{
        System.out.print("Enter the number you want to convert: ");
        fromNum = input.nextInt();
        }
            if ("decimal".equals(from)){
                if ("binary".equals(to)){
                    String binary = "";
                    if (fromNum > 0){
                        while (fromNum > 0){
                            long remainder = fromNum % 2;
                            binary += remainder;
                            fromNum = (fromNum / 2);
                        }
                    }else if (fromNum < 0){
                        long posTen = Math.abs(fromNum);
                        while (posTen > 0){
                            long remainder = posTen % 2;
                            binary += remainder;
                            posTen = (posTen / 2);
                            }
                            String negative = "-";
                            binary = negative + binary;
                        }
                        System.out.println(binary);
                        
                        }else if ("hexa".equals(to)){
                            String hexa = "";
                            if (fromNum > 0){
                                while (fromNum > 0){
                                    int remainder = (int) (fromNum % 16);
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
                                        fromNum = (fromNum / 16);
                                    }
                                }
                            }
                                else if (fromNum < 0){
                                    fromNum = Math.abs(fromNum);
                                    while (fromNum > 0){
                                    int remainder = (int) (fromNum % 16);
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
                                        fromNum = (fromNum / 16);
                                        }   
                                        String negative = "-";
                                        hexa = negative + hexa;
                                      }
                                    System.out.println(hexa);
                        }
            }
            if ("binary".equals(from)){
                if ("decimal".equals(to)){
                    int decimal = 0;
                    int p = 0;
                    while(true){
                        if(fromNum == 0){
                          break;
                        }else {
                            int temp = fromNum % 10;
                            decimal += temp*Math.pow(2, p);
                            fromNum = fromNum/10;
                            p++;
                        }
                    }
                    System.out.println(decimal);
                    
                   }else if ("hexa".equals(to)){
                    
                    
                }
            }
        
            if ("hexa".equals(from)){
                if("decimal".equals(to)){

                    
                    
                    
                    
                } else if ("binary".equals(to)){
                    
                    
                    
                    
                    
                    
                }
            }
            System.out.println("End");
        }
    }
