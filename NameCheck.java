import java.util.Scanner;

public class NameCheck
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        try {
            System.out.println("Enter your name - ");
        String name = new Scanner(System.in).nextLine();

        if(name.equalsIgnoreCase("sanjan"))
        {
            throw new NameNotAllowedException();
        }

        else 
        {
            System.out.println(name.toUpperCase());
        }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}