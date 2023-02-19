package classes;

import utilities.*;


public class Clock extends AbstractClass {

    public Clock(String clockname) {
        super(clockname);
    }

    public void isStriking(MainCharacter character, Time time) {
        switch (time) {
            case ONE_PM, TWO_PM, THREE_PM, FOUR_PM, FIVE_PM, SIX_PM, NINE_PM, EIGHT_PM, SEVEN_PM, ELEVEN_PM, TWELVE_PM, TEN_PM:
                System.out.println(getName() + " пробили " + time.getTimeExplanation());
                character.isWokeUp(character);
                break;
            default:
                System.out.println(getName() + " молчат, сейчас " + time.getTimeExplanation());
                break;

        }
    }


    @Override
    public String toString() {
        return getClass() + "{name=" + getName() + "}";
    }
}



