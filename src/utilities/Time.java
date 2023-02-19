package utilities;


public enum Time {
    ONE_PM("час дня"),
    TWO_PM("два часа дня"),
    THREE_PM("три часа дня"),
    FOUR_PM("четыре часа дня"),
    FIVE_PM("пять часов дня"),
    SIX_PM("шесть часов дня"),
    SEVEN_PM("семь часов дня"),
    EIGHT_PM("восемь часов дня"),
    NINE_PM("девять часов дня"),
    TEN_PM("десять часов дня"),
    ELEVEN_PM("одиннадцать часов дня"),
    TWELVE_PM("двенадцать часов дня"),
    UNKNOWN_PM("неизвестное время");

    private final String timeExplanation;

    Time(String timeExplanation) {
        this.timeExplanation = timeExplanation;
    }

    public String getTimeExplanation() {
        return timeExplanation;
    }


    @Override
    public String toString() {
        return getClass() + "{timeExplanation=" + timeExplanation + "}";
    }
}
