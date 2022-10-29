import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Assignment6A{
    public static void main(String[] args)
    {
        Assignment6A A = new Assignment6A();

        int[] array = new int[10];
        int size = 10;
        A.create_random_array(array, size);

        System.out.println("[Is It Sorted?]");
        System.out.print("Random Array: " );
        for (int i = 0; i < size; i++)
        {
            if(i == 9)
            {
                System.out.print(array[i]);
            }
            else
            {
                System.out.print(array[i] + ", " );
            }
        }
        System.out.println(" ");

        if (A.is_array_sorted(array, size) == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        A.sort_array(array, size);

        for (int i = 0; i < size; i++)
        {
            if(i == 9)
            {
                System.out.print(array[i]);
            }
            else
            {
                System.out.print(array[i] + ", " );
            }
        }




    }

    public void create_random_array (int[] array, int array_size)
    {
        Random rand = new Random();
        int min = -501, max = 501;

        for (int i = 0; i < array_size; i++)
        {
            array[i] = rand.nextInt(min,max);
        }

    }

    public boolean is_array_sorted (int[] array, int array_size)
    {
        for (int i = 0; i < array_size; i++)
        {
            if(i == 9)
            {
                break;
            }
            else
            {
                if (array[i] > array[i + 1])
                {
                    return false;
                }
                else
                {
                    // do nothing
                }
            }
        }
        return true;
    }

    public void sort_array (int[] array, int array_size)
    {
        for (int step = 0; step < array_size - 1; step++) 
        {
            int min_idx = step;
      
            for (int i = step + 1; i < array_size; i++) 
            {
              if (array[i] < array[min_idx]) {
                min_idx = i;
              }
            }
      
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}