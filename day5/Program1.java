import java.util.Scanner;

class Program1{
    public static void main(String[] args){

        double randomValue = Math.random();
        int randomInt = (int)(randomValue*100);
        //System.out.println("RandomValue::"+randomInt);
        int guessedNumber = -1;
        do{
            System.out.println("Guess the number");
            Scanner scanner = new Scanner(System.in);

            guessedNumber = scanner.nextInt();

            if(guessedNumber>randomInt){
                System.out.println("Number selected is very high");
            }else if(guessedNumber<randomInt){
                System.out.println("Number selected is very low");
            }else{
                System.out.println("Number matched");
            } 
        }while(guessedNumber!=randomInt);

        System.out.println("Program Exit");

    }
}