package string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String name1="lisjen";
        String name2="silent";
        System.out.println(Algo(name1, name2));
    }
    public static boolean Algo(String str1,String str2){
        if(str1.length() != str2.length()) return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return  Arrays.equals(arr1,arr2);
        
    }
}
