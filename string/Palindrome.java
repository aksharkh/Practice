package string;

public class Palindrome {
    public static void main(String[] args){
        String str="P #e  e# p";
        System.out.println(Algo(str));
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome1(str));
        System.out.println(Algo1(str));


    }

    public static boolean Algo(String str){
        int start=0,end=str.length()-1;
        while(start<end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {

        String r="";

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=48 && s.charAt(i)<=57){

                if(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=48 && s.charAt(i)<=57){
                    r=r+s.charAt(i);
                }
                else{
                    r = r +  (s.charAt(i) + 32);
                }
            }
        }

        int i=0;
        int j=r.length()-1;

        while (i<j){
            if(r.charAt(i)==r.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;

    }

    public static boolean isPalindrome1(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0, j = cleaned.length() - 1;

        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean Algo1(String str){
        int l=0, e= str.length()-1;

        while (l<e){
            if(str.charAt(l)!= str.charAt(e)){
                return false;

            }
            l++;
            e--;
        }
        return true;

    }

}
