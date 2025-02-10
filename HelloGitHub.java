import java.time.LocalDateTime;  // Import for date and time
import java.time.format.DateTimeFormatter;  // Import for formatting

public class HelloGitHub {
    public static void main(String[] args) {
        // Print greeting message
        System.out.println("Hello, GitHub!");

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Print the current date and time
        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}

public class HelloGitHub{
  public static void main(String[] args){
  

System.out.print("Hello GitHUB");
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
System.out.println("Current Date and Time: " + now.format(formatter));

  }
}

