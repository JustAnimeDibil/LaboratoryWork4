package classes;

import utilities.*;


public class Clock extends AbstractClass {

    public Clock(String clockname) {
        super(clockname);
    }

    public void isStriking(MainCharacter character, Time time) {
        /* Обработка проверяемого исключения (checked) try-catch */
        try {
            switch (time) {
                case ONE_PM, TWO_PM, THREE_PM, FOUR_PM, FIVE_PM, SIX_PM, NINE_PM, EIGHT_PM, SEVEN_PM, ELEVEN_PM, TWELVE_PM, TEN_PM:
                    System.out.println(getName() + " пробили " + time.getTimeExplanation());
                    character.isWokeUp();
                    break;
                default:
                    System.out.println(getName() + " молчат, сейчас " + time.getTimeExplanation());
                    break;

            }
        } catch (HappyWokeUpFailException WokeUpFail) {
            System.out.println(WokeUpFail.getMessage());
            character.isFeeling(HumanFeelings.STRESSFUL);

        }
    }

    /* Cтатический вложенный класс enum (static nested class) */
    public static enum Time {
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


    }
}



