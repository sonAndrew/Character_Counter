import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // LOCAL VARIABLES
    String str = "";
    // SCANNER
    Scanner input = new Scanner(System.in);
    // GET STRING INPUT
    System.out.println("Enter the string to be counted.");
    str = input.nextLine();
    // characterCounter() METHOD
    characterCounter(str);
    // SCANNER CLOSE
    input.close();
  }
  public static String characterCounter(String newString)
  {
    // LOCAL VARIABLES
    String localString = newString;
    int length = localString.length( );
    int charCount = 0;
    char temporaryChar = ' ';
    // CHECK NUMBER OF CHARACTER
    if(length > 60)
    {
      // ERROR MESSAGE
      System.out.println("Too many characters.");
    }
    else 
    {
      // GET EACH CHARACTER
      for( int i = 0; i < localString.length( ); i++ )
      {
          temporaryChar = localString.charAt( i );
          charCount++;
          System.out.printf("%n%-2s%-2c%-2s%-3d%-2s","|", temporaryChar, "|", charCount, "|");
      }
    }
    // PRINTS STRING LENGTH
    System.out.print("\n\nString Length: ");
    System.out.print(length);
    return localString;
  }
}