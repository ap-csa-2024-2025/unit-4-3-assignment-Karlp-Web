import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    for (int i = 1; i <= 25; i += 1) //problem 1
    {
      if (i % 2 == 1)
      {
        System.out.println(i + " ");
      }
    }

    for (int i = 17; i <= 73; i++ )
    {
      System.out.print(i + " ");

      if (i % 10 == 6)
      {
        System.out.println();
      }
    }
  }









}
