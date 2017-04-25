/**
 * Created by A.Zotov on 20.04.2017.
 */
public class StringExperimentsNoRegexp {

          public static void main(String[] args)
        {
            String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30002 рублей";

            String str = ((text.substring(text.indexOf(" "),text.indexOf("рублей"))).trim());
            int intSalary1 = Integer.parseInt(str.substring(str.indexOf(" ")).trim());
            String str1 = ((text.substring(text.lastIndexOf("-"),text.lastIndexOf("рублей")).trim()));
            int intSalary2 = Integer.parseInt(str1.substring(str1.indexOf(" ")).trim());
            String sumSalary = Integer.toString((intSalary1 + intSalary2));
            int lastIntOfSalary = Integer.parseInt((sumSalary.substring(sumSalary.length() - 1, sumSalary.length())));

            String name1 = text.substring(0, text.indexOf(" "));
            String name2 = (text.substring(text.lastIndexOf (" а"), text.lastIndexOf("-"))).trim();
            name2 = (name2.substring(name2.indexOf(" "))).trim();
            String valuta ="";

            switch(lastIntOfSalary){
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    valuta = "рублей";
                    break;
                case 1:
                    valuta = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    valuta = "рубля";
                    break;
                default: valuta = "руб.";
            }

            System.out.println(name1 + " и " + name2 + " заработали вместе " + sumSalary + " " + valuta);
        }
    }

