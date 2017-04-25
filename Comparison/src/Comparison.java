/**
 * Created by в on 24.01.2017.
 */
public class Comparison {
    public static void main(String[] args) {

        int dimaAge = 7;
        int mishaAge = 5;
        int vasyaAge = 18;

        int oldest = 9;
        int youngest = 5;
        int middle = 8;

        if(dimaAge > mishaAge && dimaAge > vasyaAge){
            oldest = dimaAge;
        }else{
            if(mishaAge > dimaAge && mishaAge > vasyaAge){
                oldest = mishaAge;
            }else{
                if(vasyaAge > dimaAge && vasyaAge > mishaAge){
                    oldest = vasyaAge;
                }
            }
        }

        if(dimaAge < mishaAge && dimaAge < vasyaAge){
            youngest = dimaAge;
        }else{
            if(mishaAge < dimaAge && mishaAge < vasyaAge){
                youngest = mishaAge;
            }else{
                if(vasyaAge < dimaAge && vasyaAge < mishaAge){
                    youngest = vasyaAge;
                }
            }
        }

        if(dimaAge > mishaAge && dimaAge < vasyaAge || dimaAge < mishaAge && dimaAge > vasyaAge){
            middle = dimaAge;
        }else{
            if(mishaAge > dimaAge && mishaAge < vasyaAge || mishaAge < dimaAge && mishaAge > vasyaAge){
                middle = mishaAge;
            }else{
                if(vasyaAge > dimaAge && vasyaAge < mishaAge || vasyaAge < dimaAge && vasyaAge > mishaAge){
                    middle = vasyaAge;
                }
            }
        }

        System.out.println("Most old " + oldest);
        System.out.println("Most young " +youngest);
        System.out.println("Middle " +middle);
    }
}
