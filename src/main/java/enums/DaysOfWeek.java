package enums;

public class DaysOfWeek {
    void method (String dayOfWeek) {
        System.out.println(String.format("Today is %s", dayOfWeek));
    }

    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        daysOfWeek.method("Monday");
    }
}
