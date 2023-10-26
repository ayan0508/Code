import java.util.Random;
import java.util.*;

public class First {
    public static void main(String[] args) {
         List<Integer> myList = List.of(1, 2, 3, 4, 5,6,7);
        List<Integer> list = new ArrayList<>(myList);
        shuffleList(list);
        System.out.println("Shuffled list: " + list);
    }

    public static <T> void shuffleList(List<T> list) {
        Random random = new Random();
        int n = list.size();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}