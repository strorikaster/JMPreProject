/**
 * Created by A.Zotov on 26.01.2017.
 */
public class Comparison1 {
    public static void main (String[] args){

        int vasyaAge = 1;
        int kolyaAge = 105;
        int petyaAge = 1;

        int oldest = 9;
        int youngest = 5;
        int middle = 7;

        if(vasyaAge > kolyaAge && vasyaAge > petyaAge){
            oldest = vasyaAge;
            if (kolyaAge > petyaAge){
                middle = kolyaAge;
                youngest = petyaAge;
            }else{
                middle = petyaAge;
                youngest = kolyaAge;
            }
        }
        if(vasyaAge == kolyaAge && vasyaAge > petyaAge){
            oldest = vasyaAge;
            middle = kolyaAge;
            youngest = petyaAge;
        }else{
            if (vasyaAge == kolyaAge && vasyaAge < petyaAge) {
            oldest = petyaAge;
            middle = kolyaAge;
            youngest = vasyaAge;
            }
        }

        if(kolyaAge > vasyaAge && kolyaAge > petyaAge){
            oldest = kolyaAge;
            if(vasyaAge > petyaAge){
                middle = vasyaAge;
                youngest = petyaAge;
            }else{
                middle = petyaAge;
                youngest = vasyaAge;
            }
        }

        if(vasyaAge == petyaAge && vasyaAge > kolyaAge){
            oldest = vasyaAge;
            middle = petyaAge;
            youngest = kolyaAge;
        }else{
            if (vasyaAge == petyaAge && vasyaAge < kolyaAge) {
                oldest = kolyaAge;
                middle = petyaAge;
                youngest = vasyaAge;
            }
        }

        if(petyaAge > vasyaAge && petyaAge > kolyaAge){
            oldest = petyaAge;
            if(vasyaAge > kolyaAge){
                middle = vasyaAge;
                youngest = kolyaAge;
            }else{
                middle = kolyaAge;
             youngest = vasyaAge;
            }
        }

        if(petyaAge == kolyaAge && petyaAge > vasyaAge){
            oldest = petyaAge;
            middle = kolyaAge;
            youngest = vasyaAge;
        }else{
            if (petyaAge == kolyaAge && petyaAge < vasyaAge) {
                oldest = vasyaAge;
                middle = kolyaAge;
                youngest = petyaAge;
            }
        }

        if (vasyaAge == kolyaAge && kolyaAge   == petyaAge){
            oldest  = vasyaAge;
            middle = kolyaAge;
            youngest = petyaAge;
        }

            System.out.println("Oldest = " + oldest);
            System.out.println("Middle = " + middle);
            System.out.println("Youngest = " + youngest);
    }
}
