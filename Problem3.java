public class Problem3
{
  public static void main(String[] args)
  {
    double x = 1.2345;

    int xTrunc = (int)(x * 1000); //12345
    int last = xTrunc%10;
    xTrunc = xTrunc / 10;
    int mid = xTrunc%10;
    xTrunc = xTrunc/10;
    int first = xTrunc%10;
    System.out.println(first); 
    System.out.println(mid); 
    System.out.println(last); 

  }
}
