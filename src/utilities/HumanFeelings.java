package utilities;

public enum HumanFeelings {
    HAPPY("радостным"),
    SAD("грусным"),
    SLEEPY("сонным"),
    WONDERFUL("чудесно"),
    STRESSFUL("беспокойно");
    private final String feelingExplanation;

    HumanFeelings(String feelingExplanation) {
        this.feelingExplanation = feelingExplanation;
    }

    public String getFeelingExplanation() {
        return feelingExplanation;
    }


    @Override
    public String toString() {
        return getClass() + "{feelingExplanation=" + feelingExplanation + "}";
    }
}
