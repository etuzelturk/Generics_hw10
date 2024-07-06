import java.util.Arrays;
import java.util.Optional;

public class ArraySearch {
    public static <T> T findElement(T[] array, T el, T defaultValue) {
        return Arrays.stream(array)
                .filter(e -> e.equals(el))
                .findFirst()
                .orElse(defaultValue);
    }
}
