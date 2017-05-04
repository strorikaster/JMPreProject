/**
 * Created by A.Zotov on 03.05.2017.
 */

public class PassportSeries
{
    public static void main(String[] args)
    {
        int passSeries[] = new int [10000];
        //filling array
        for (int i=1000; i < passSeries.length; i++){

            passSeries[i] = i;
        }
        //print array
        for (int item : passSeries) {
                if (item >= 1000) {
                    System.out.println(item);
                }
            }
    }
}