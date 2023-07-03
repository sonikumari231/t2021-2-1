import java.util.HashMap;
import java.util.Map;

class NumberMultiples {
    public static Map<Integer, Integer> countMultiples(int[] numbers) {
        Map<Integer, Integer> multiples = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            multiples.put(i, 0);
        }

        for (int num : numbers) {
            for (int factor : multiples.keySet()) {
                if (num % factor == 0) {
                    multiples.put(factor, multiples.get(factor) + 1);
                }
            }
        }

        return multiples;
    }

    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = countMultiples(inputNumbers);
        System.out.println(result);
    }
}
