// Name: Zulkifli Salami
// Date: 01/29/2023
// App Name: AstrologicalZodiacSignApp
// App Description: Java App that determines user's zodiac sign according to user input. Input is
// validated, then Zodiac sign is displayed.

// import java scanner
import java.util.Scanner;

// Class
public class AstrologicalZodiacSignApp 
{
    // Constant aka final
    // Set Title
    static final String SET_TITLE = "\033]0;%s\007";
    // Clear terminal
    static final String CLEAR_TERMINAL = "\033c";

    // Constants to check for range
    static final Integer MINIMUM_INPUT = 1;
    static final Integer MAXIMUM_MONTH = 12;
    static final Integer MAXIMUM_DAY = 31;


    // Constants for date
    static final Integer MINIMUM_ARIES = 321;
    static final Integer MAXIMUM_ARIES = 419;
    static final Integer MINIMUM_TAURUS = 420;
    static final Integer MAXIMUM_TAURUS = 520;
    static final Integer MINIMUM_GEMINI = 521;
    static final Integer MAXIMUM_GEMINI = 620;
    static final Integer MINIMUM_CANCER = 621;
    static final Integer MAXIMUM_CANCER = 722;
    static final Integer MINIMUM_LEO = 723;
    static final Integer MAXIMUM_LEO = 822;
    static final Integer MINIMUM_VIRGO = 823;
    static final Integer MAXIMUM_VIRGO = 922;
    static final Integer MINIMUM_LIBRA = 923;
    static final Integer MAXIMUM_LIBRA = 1022;
    static final Integer MINIMUM_SCORPIO = 1023;
    static final Integer MAXIMUM_SCORPIO = 1121;
    static final Integer MINIMUM_SAGITTARIUS = 1122;
    static final Integer MAXIMUM_SAGITTARIUS = 1221;
    static final Integer MINIMUM_CAPRICORN1 = 1222;
    static final Integer MAXIMUM_CAPRICORN1 = 1231;
    static final Integer MINIMUM_CAPRICORN2 = 101;
    static final Integer MAXIMUM_CAPRICORN2 = 119;
    static final Integer MINIMUM_AQUARIUS = 120;
    static final Integer MAXIMUM_AQUARIUS = 218;
    static final Integer MINIMUM_PISCES = 219;
    static final Integer MAXIMUM_PISCES = 320;


    // Input Banner 
    static final String INPUT_BANNER = """
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~ Astrological Zodiac Signs ~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    """;

    // Output Banner 
    static final String OUTPUT_BANNER = """
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~ Astrological Zodiac Signs Result ~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    """;

    public static void main(String[] args) 
    {
        
        // Scanner for input
        Scanner scanner  = new Scanner(System.in);
        // Variables
        boolean needInput = true; // check if input needed
        boolean integerNumber = true; // check if integer
        Integer birthdayMonth = 0; // variable to store input Month
        Integer birthdayDay = 0; // variable to store input day
        Integer result = 0; // variable to calculate zodiac sign
        String zodiacSign = ""; // variable to store zodiac sign
        
        // Collect command from java
        try 
        {
            new ProcessBuilder("cmd", "/c").inheritIO().start().waitFor();
        } 
        catch (Exception exception) {}

        // Set TITLE
        System.out.printf(SET_TITLE,"Astrological Zodiac Signs - Zulkifli Salami");

        // Print banner
        System.out.println(INPUT_BANNER);

        // Print app description
        System.out.println("\nThis app will tell your zodiac sign based on your birthday !! \nInput should be in the format ('month' 'day'), only whole numbers allowed.");



        // Repeat input prompt until valid input is entered
        do 
        {
            // Prompt user for input 
            System.out.print("\nEnter your birthday in the mentioned format ('month' 'day'). REMINDER!! Only whole numbers allowed: ");

            // Store input in a integer variable
            try 
            {
                birthdayMonth = scanner.nextInt();
                birthdayDay = scanner.nextInt();
                integerNumber = false;
            } 
            catch (Exception exception) 
            {
                integerNumber = true;
            }
            // Get rid of leftover input
            scanner.nextLine();

            // Check if input is within valid range
            needInput = integerNumber || birthdayMonth < MINIMUM_INPUT || birthdayMonth > MAXIMUM_MONTH || birthdayDay < MINIMUM_INPUT || birthdayDay > MAXIMUM_DAY || birthdayDay == null || birthdayMonth == null;
            if (needInput) 
            {
                System.out.println("\nError!! Input has to be in the format ('month' 'day')\nInput has to be in range 1 to 12 inclusive for 'month'\nInput has to be in range 1 to 31 inclusive for 'day'\nPlease try again, Thank you :)");
                needInput = true;
            } 
            else 
            {
                needInput = false;
            }

        } while (needInput);
        




        // Clear the terminal
        System.out.println(CLEAR_TERMINAL + OUTPUT_BANNER);

        result = (birthdayMonth * 100) + birthdayDay;

        if (result >= MINIMUM_ARIES && result <= MAXIMUM_ARIES)
        {
            zodiacSign = "\nAries\n" + Art.ARIES;
        }
        else if (result >= MINIMUM_TAURUS && result <= MAXIMUM_TAURUS)
        {
            zodiacSign = "\nTaurus\n" + Art.TAURUS;
        }
        else if (result >= MINIMUM_GEMINI && result <= MAXIMUM_GEMINI)
        {
            zodiacSign = "\nGemini\n" + Art.GEMINI;
        }
        else if (result >= MINIMUM_CANCER && result <= MAXIMUM_CANCER)
        {
            zodiacSign = "\nCancer\n" + Art.CANCER;
        }
        else if (result >= MINIMUM_LEO && result <= MAXIMUM_LEO)
        {
            zodiacSign = "\nLeo\n" + Art.LEO;
        }
        else if (result >= MINIMUM_VIRGO && result <= MAXIMUM_VIRGO)
        {
            zodiacSign = "\nVirgo\n" + Art.VIRGO;
        }
        else if (result >= MINIMUM_LIBRA && result <= MAXIMUM_LIBRA)
        {
            zodiacSign = "\nLibra\n" + Art.LIBRA;
        }
        else if (result >= MINIMUM_SCORPIO && result <= MAXIMUM_SCORPIO)
        {
            zodiacSign = "\nScorpio\n" + Art.SCORPIO;
        }
        else if (result >= MINIMUM_SAGITTARIUS && result <= MAXIMUM_SAGITTARIUS)
        {
            zodiacSign = "\nSagittarius\n" + Art.SAGITTARIUS;
        }
        else if ((result >= MINIMUM_CAPRICORN1 && result <= MAXIMUM_CAPRICORN1) || (result >= MINIMUM_CAPRICORN2 && result <= MAXIMUM_CAPRICORN2))
        {
            zodiacSign = "\nCapricorn\n" + Art.CAPRICORN;
        }
        else if (result >= MINIMUM_AQUARIUS && result <= MAXIMUM_AQUARIUS)
        {
            zodiacSign = "\nAquarius\n" + Art.AQUARIUS;
        }
        else if (result >= MINIMUM_PISCES && result <= MAXIMUM_PISCES)
        {
            zodiacSign = "\nPisces\n" + Art.PISCES;
        }

        System.out.printf("\nYour Astrological Zodia sign based on your birthday (%s/%s): %s", birthdayMonth, birthdayDay, zodiacSign);


        // Exit prompt - so the app doesn't close
        System.out.print("\nPress [enter] to exit: "); // print
        scanner.nextLine();
        scanner.close(); // Finished using the input
    }
        

}
