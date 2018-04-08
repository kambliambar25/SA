import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        Integer[] intArray = {1975, 2003, 1979, 1992, 1983, 1999, 1987};
        System.out.println("Integer[] Array - before sorting : ");
        for(Integer iValue : intArray) {
            System.out.println(iValue);
        }
        Arrays.sort(intArray);
        System.out.println("\nInteger[] Array - after sorting in ascending order : ");
        for(Integer iValue : intArray) {
            System.out.println(iValue);
        }
    }
}
