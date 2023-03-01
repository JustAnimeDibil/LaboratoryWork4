
import classes.*;
import utilities.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainCharacter roskolnikov = new MainCharacter("Он");
        roskolnikov.eatWithWhat("хлебом");
        CaravanPart caravan = new CaravanPart("караван", "верблюды");
        roskolnikov.isLayOnCouchAndDream(roskolnikov, caravan);
        Clock clock = new Clock("Часы");
        clock.isStriking(roskolnikov, Clock.Time.SIX_PM);
        /* Анонимный класс */
        JumpInterface doJump = new JumpInterface() {
            @Override
            public void jumpedUp(MainCharacter character) {
                System.out.println(character.getName() + " вскочил");
            }
        };
        doJump.jumpedUp(roskolnikov);
        ArrayList<String> items = new ArrayList<>();
        items.add("рубашка");
        items.add("игла");
        items.add("нитки");
        items.add("летнее пальто");
        PreparationPart preparations = new PreparationPart(items);
        roskolnikov.doPreparation(roskolnikov, preparations);
        ArrayList<String> itemsInStash = new ArrayList<>();
        itemsInStash.add("деревянная дощечка");
        itemsInStash.add("железная дощечка");
        CreatingTrapPart trap = new CreatingTrapPart("заклад", itemsInStash);
        roskolnikov.createSpecialTrap(roskolnikov, trap);
        roskolnikov.showEndResult(preparations, trap);
    }
}