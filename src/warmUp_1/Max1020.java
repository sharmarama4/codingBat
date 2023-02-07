package warmUp_1;

public class Max1020 {
    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
    or return 0 if neither is in that range.


             max1020(11, 19) → 19
     max1020(19, 11) → 19
     max1020(11, 9) → 11*/
    public int max1020(int a, int b) {
        boolean aInRange = a >= 10 && a <= 20;
        boolean bInRange = b >= 10 && b <= 20;
        if(aInRange&& bInRange){
            if(a>b){
                return a;
            }else{
                return b;
            }

        }
        else if(aInRange){
            return a;
        }
        else if(bInRange){
            return b;

        }
        return 0;
    }
}
