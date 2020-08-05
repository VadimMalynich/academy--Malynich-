package by.academy.homework.homework3.task1;

public enum DayOfWeek {
    MON("понедельник"), TUE("вторник"), WED("среда"), THU("четверг"),
    FRI("пятница"), SAT("суббота"), SUN("воскресенье");
    private String value;

    DayOfWeek(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
