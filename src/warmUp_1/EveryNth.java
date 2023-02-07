package warmUp_1;

public class EveryNth {
/*    Given a non-empty string and an int N, return the string made starting with char 0, and then every
    Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"*/

    public String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    //  alternative
    public String everyNthCh(String str, int n) {
        String temp=str.substring(0,1);
        for(int i=n;i<str.length();i+=n){
            temp+=str.charAt(i);
        }
        return temp;
    }

}
