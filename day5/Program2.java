import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Program2{
    public static void main(String[] args){
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Before Formatting: " + currentTime);  


        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentTime.format(formater);

        System.out.println("After Formatting: " + formattedDateTime);  

        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("MM:dd:yyyy HH:mm:ss");
        String formattedDateTime1 = currentTime.format(formater1);

        System.out.println("After Formatting: " + formattedDateTime1);  
        System.out.println("---------------------------------------" );  
    }
}