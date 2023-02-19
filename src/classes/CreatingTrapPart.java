package classes;

import utilities.*;

import java.util.ArrayList;
import java.util.Objects;


public class CreatingTrapPart extends AbstractClass implements IDoPreparations {
    private ArrayList<String> someSecretItems;
    private String unitedItem;

    public CreatingTrapPart(String secretSpotName, ArrayList<String> someSecretItems) {
        super(secretSpotName);
        this.someSecretItems = someSecretItems;
    }

    @Override
    public void doYourPart(MainCharacter character) {
        takeItemsFromStash(character);
        uniteItemsFromStash(character, "деревянная дощечка", "железная дощечка");
        createDecorations(character, "бумага", "тесемка");
    }

    public void takeItemsFromStash(MainCharacter character) {
        for (int i = 0; i < someSecretItems.size(); i++) {
            System.out.println(character.getName() + " достал из " + getName() + " " + someSecretItems.get(i));
        }
    }

    public void uniteItemsFromStash(MainCharacter character, String unit1, String unit2) {
        System.out.println(character.getName() + " объеденил " + unit1 + " и " + unit2);
        someSecretItems.remove(unit1);
        someSecretItems.remove(unit2);
        String createdItem = (unit1 + " соединенный(ая) с " + unit2);
        someSecretItems.add(createdItem);
        setUnitedItem(createdItem);
    }

    public void createDecorations(MainCharacter character, String packIn, String packCloseBy) {
        System.out.println(character.getName() + " упаковал " + unitedItem + " в " + packIn + " запечатав их с помощью " + packCloseBy);
        someSecretItems.add(unitedItem + " в " + packIn + " запечатанный(ая) с помощью " + packCloseBy);
        someSecretItems.remove(unitedItem);
    }

    @Override
    public ArrayList<String> showResult() {
        return someSecretItems;
    }

    public void setUnitedItem(String unitedItem) {
        this.unitedItem = unitedItem;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) return false;
        CreatingTrapPart testobj = (CreatingTrapPart) obj;
        return someSecretItems.equals(testobj.someSecretItems) && unitedItem.equals(testobj.unitedItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(someSecretItems, unitedItem);
    }

    @Override
    public String toString() {
        return getClass() + "{secretSpotName=" + getName() + ", " + "someSecretItems=" + someSecretItems + ", " + "unitedItem=" + unitedItem +
                "}";
    }
}
