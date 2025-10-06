package string.streams;

import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        String result = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
