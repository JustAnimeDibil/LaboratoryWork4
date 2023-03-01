package classes;

import utilities.*;

import java.util.ArrayList;


public class MainCharacter extends AbstractClass implements HeroInterface {

    public MainCharacter(String name) {
        super(name);
    }

    public void eatWithWhat(String food) {
        System.out.println(getName() + " ест свою еду с " + food);
        isFeeling(HumanFeelings.SLEEPY);
    }

    public void isLayOnCouchAndDream(MainCharacter character, CaravanPart caravan) {
        System.out.println(getName() + " лежит на диване");
        caravan.doDream(character);
    }

    /* Проверяемое исключение (checked) */
    public void isWokeUp() throws HappyWokeUpFailException {
        final double WIN_NUMBERS = 0.9;
        if (Math.random() > WIN_NUMBERS) {
            System.out.println(getName() + " с легкостью проснулся");
            isFeeling(HumanFeelings.HAPPY);
        } else {
            throw new HappyWokeUpFailException(getName() + " еле очнулся");
        }
    }

    public void doPreparation(MainCharacter character, PreparationPart preparation) {
        System.out.println(getName() + " начинает приготовления: ");
        preparation.doYourPart(character);
    }

    public void createSpecialTrap(MainCharacter character, CreatingTrapPart trap) {
        System.out.println("Покончив с этим, " + getName() + ":");
        trap.doYourPart(character);
    }

    @Override
    public void isFeeling(HumanFeelings feeling) {
        System.out.println(getName() + " чувствует себя " + feeling.getFeelingExplanation());
    }

    @Override
    public void showEndResult(PreparationPart prepare, CreatingTrapPart trap) {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(prepare.showResult());
        result.addAll(trap.showResult());
        System.out.println("В итоге " + getName() + " владел: " + result);
    }

    @Override
    public String toString() {
        return getClass() + "{name=" + getName() + "}";
    }
}

