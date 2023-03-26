import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(20);//1
        for (int i = 0; i <= 20; i++) {
            integers.add(RandomUtil.getRandomNumber());
        }
        Set<Integer> unUnikum = new HashSet<>();//2
        List<Integer> unikum = new ArrayList<>();

        for (Integer inter : integers) {
            if (!unUnikum.add(inter)) {
                unikum.add(inter);
            }
        }
        System.out.println("Не повторяющиеся числа: " + unUnikum);
        System.out.println("Повторяющиеся числа: " + unikum);
    }
}
