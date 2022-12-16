import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.time.ZonedDateTime;

class Program3{
    public static void main(String[] args){
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Before Formatting: " + currentTime);  
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        
        ZoneId localZone = ZoneId.systemDefault();
        System.out.println("local zone: " + localZone); 
     
        ZonedDateTime localZonedDateTime = currentTime.atZone(localZone);
        System.out.println("local zone date time default format: " + localZonedDateTime); 
        System.out.println("local zone date time with format: " + formater.format(localZonedDateTime)); 
        System.out.println("---------------------------------------" );  

        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkZonedDateTime = localZonedDateTime.withZoneSameInstant(newYorkZone);
        System.out.println("new york zone date time default format: " + newYorkZonedDateTime); 
        System.out.println("new york zone date time with format: " + formater.format(newYorkZonedDateTime)); 
    }
}