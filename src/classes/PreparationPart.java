package classes;

import utilities.*;

import java.util.ArrayList;
import java.util.Objects;


public class PreparationPart implements IDoPreparations {
    private ArrayList<String> necessaryItems;
    private int itemNum;
    private String destroyedItem;
    private String whatHeGonnaStich;

    public PreparationPart(ArrayList<String> necessaryItems) {
        this.necessaryItems = necessaryItems;
    }

    @Override
    public void doYourPart(MainCharacter character) {
        for (int i = 0; i < necessaryItems.size(); i++) {
            setItemNum(i);
            isRememberedWhere(character);
            isTookItem(character);
        }
        isDestroyItem(character, "рубашка");
        isGetAfterDestroy(character, "тесьма");
        isStitching(character, "летнее пальто");
    }


    public void isRememberedWhere(MainCharacter character) {
        System.out.println(character.getName() + " вспомнил где лежит " + necessaryItems.get(itemNum));
    }


    public void isTookItem(MainCharacter character) {
        System.out.println(character.getName() + " взял " + necessaryItems.get(itemNum));
    }

    public void isDestroyItem(MainCharacter character, String destroyWhat) {
        System.out.println(character.getName() + " разорвал " + destroyWhat);
        necessaryItems.remove(destroyWhat);
        setDestroyedItem(destroyWhat);
    }

    public void isGetAfterDestroy(MainCharacter character, String whatHeGet) {
        System.out.println("После разрыва " + destroyedItem + " " + character.getName() + " получил " + whatHeGet);
        necessaryItems.add(whatHeGet);
        setWhatHeGonnaStich(whatHeGet);
    }

    public void isStitching(MainCharacter character, String isStitchTo) {
        System.out.println(character.getName() + " пришил " + whatHeGonnaStich + " к " + isStitchTo);
        necessaryItems.remove(whatHeGonnaStich);
        necessaryItems.remove(isStitchTo);
        necessaryItems.add(isStitchTo + " с пришитым(ой) " + whatHeGonnaStich);
    } //stitching - пришивать


    @Override
    public ArrayList<String> showResult() {
        return necessaryItems;
    }


    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }


    public void setDestroyedItem(String destroyedItem) {
        this.destroyedItem = destroyedItem;
    }


    public void setWhatHeGonnaStich(String whatHeGonnaStich) {
        this.whatHeGonnaStich = whatHeGonnaStich;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreparationPart testobj = (PreparationPart) obj;
        return itemNum == testobj.itemNum && necessaryItems.equals(testobj.necessaryItems) && destroyedItem.equals(testobj.destroyedItem) && whatHeGonnaStich.equals(testobj.whatHeGonnaStich);
    }

    @Override
    public int hashCode() {
        return Objects.hash(necessaryItems, itemNum, destroyedItem, whatHeGonnaStich);
    }


    @Override
    public String toString() {
        return getClass() + "{necessaryItems=" + necessaryItems + ", " + "destroyedItem=" + destroyedItem + "," + "whatHeGonnaStich=" + whatHeGonnaStich +
                "}";
    }
}




















 /*   public void createArrayList(String item1,String item2,String item3,String item4) {
        ArrayList<String> necessaryItems = new ArrayList<>();
        necessaryItems.add(item1);
        necessaryItems.add(item2);
        necessaryItems.add(item3);
        necessaryItems.add(item4);
        this.necessaryItems = necessaryItems;

    } */