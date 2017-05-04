/**
 * Created by A.Zotov on 03.05.2017.
 */
public class ArrayRevertPrint
{
    public static void main(String[] args)
    {
        String array[] = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Violent"};

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
