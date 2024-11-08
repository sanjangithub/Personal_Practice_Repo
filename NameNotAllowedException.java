public class NameNotAllowedException extends RuntimeException 
{
    public NameNotAllowedException()
    {
        System.out.println("This name is not allowed here. Please try again.");
    }
}
