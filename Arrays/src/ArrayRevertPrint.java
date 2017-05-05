import static java.util.Arrays.fill;
import static java.util.Arrays.sort;

/**
 * Created by A.Zotov on 03.05.2017.
 */
public class ArrayRevertPrint
{
    public static void main(String[] args)
    {
        String array[] = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violent"};

        //reverse output of array
        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }
        //sort(array, 0, 7);
        if (array.length % 2 != 0){
            array[0] = array[6];
            array[1] = array[5];
            array[2] = array[4];
         }
        for(String item : array){
            System.out.println(item);
        }

    }


}
