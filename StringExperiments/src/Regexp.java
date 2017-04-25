/**
 * Created by A.Zotov on 13.04.2017.
 */

public class Regexp {

            public static void main(String[] args)
            {
                String str = "Петя заработал 4300 рублей, Вася заработал 3530 рублей, Катя заработала 2050 рублей";

//                String strArr[] = ((str.replaceAll("[^0-9/s0-9]+", "//s"))).replaceFirst("//s", "").split("//s");
//
//                Integer cashMoney[] = new Integer[strArr.length];
//
//                int sum = 0;
//                for(int i=0; i < strArr.length;i++){
//                  cashMoney[i] = Integer.parseInt(strArr[i]);
//                    sum += cashMoney[i];
//
//                }


                String [] salary=str.replaceAll("^[^0-9]+","").split("[^0-9]+");

                for (int i=0; i<3; i++){
                    System.out.println(salary[i]);
            }





                int vasyaSal=Integer.parseInt(salary[0]);
                int petyaSal=Integer.parseInt(salary[1]);
                int mashaSal=Integer.parseInt(salary[2]);
                int totalSal=vasyaSal+mashaSal+petyaSal;


                System.out.println("Сумма заработанных денег " + totalSal + " рублей");
            }


}
