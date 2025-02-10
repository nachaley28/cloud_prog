public class HelloGitHub{
  public static void main(String[] args){
  

System.out.print("Hello GitHUB");
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
System.out.println("Current Date and Time: " + now.format(formatter));

  }
}

