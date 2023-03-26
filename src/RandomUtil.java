import java.util.Random;
public class RandomUtil {

    Random random = new Random();
    public static int getRandomNumber() {
        return (int) (Math.random() * (9 - 1)) + 1;
    }
}

