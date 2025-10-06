package string.streams;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Stream API in Java";

        long count = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c )
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();

        System.out.println("Number of vowels :" + count);
    }
}
