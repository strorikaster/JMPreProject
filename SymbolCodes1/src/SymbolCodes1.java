/**
 * Created by A.Zotov on 19.04.2017.
 */

public class SymbolCodes1 {
    public static void main(String[] args) {

        int[] number = new int[512];

        for(int i=0; i < number.length; i++ ){
            System.out.print("Код символа UTF-8 "+ (char)(number[i] = i) + " - ");
            System.out.println(i);
        }
    }
}
