package by.academy.deal;

public enum Status {
    NEW("New"), IN_PROGRESS("In Progress"), DONE("Done");
    private String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
