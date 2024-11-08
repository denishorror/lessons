package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
//        Today today = new Today(WeekDays.MONDAY);
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        var w1 = WeekDays.FRIDAY;
        var w2 = WeekDays.FRIDAY;
        var w3 = WeekDays2.FRIDAY;
        System.out.println(w1 == w2);
//        System.out.println(w1 == w3); так нельзя
        System.out.println(w1.equals(w3));
        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

@AllArgsConstructor
@Getter
enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
}

@AllArgsConstructor
@Getter
enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

@AllArgsConstructor
class Today {
    WeekDays weekDay;

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Let's sleep...");
                break;
        }
        System.out.println(String.format("Mood this day is: %s", weekDay.getMood()));
    }
}
