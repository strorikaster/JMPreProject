/**
 * Created by A.Zotov on 03.05.2017.
 */
public class ChessDeck
{
    public static void main(String[] args)
    {


        String chessDeck[][] = new String[8][8];
        String chessDeckHorizontal[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int j = 0; j < chessDeckHorizontal.length; j++){
            for (int i = 0; i < chessDeckHorizontal.length; i++){
               chessDeck[j][i] = chessDeckHorizontal[i] + (j+1);
            }
            //System.out.println();
        }

        for (int j = 0; j < chessDeck.length; j++){
            for (int i = 0; i < chessDeck[j].length; i++){
                if (j%2 == 0 && i%2 == 0||j%2!= 0 && i%2 !=0) {
                    System.out.print("\033[31m" + chessDeck[j][i] + " ");
                }else{
                        System.out.print("\033[0m" + chessDeck[j][i] + " ");
                }
            }
            System.out.println();
        }
    }
}
