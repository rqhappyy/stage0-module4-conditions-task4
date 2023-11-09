package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int max1;
        max1 = first>=second? first:second;
        int max2;
        max2 = second>=third? second:third;
        int max;
        max = max1>=max2? max1:max2;
        System.out.println(max);
    }
}
