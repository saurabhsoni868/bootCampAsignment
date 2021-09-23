class CustomException extends Exception
{
    String message;

    CustomException(String message)
    {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

public class QuestionThirteen {
    public static void main(String[] args)
    {
        try
        {
            throw new CustomException("This is a custom exception");
        }
        catch (CustomException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally handled CustomException");
        }
    }
}
