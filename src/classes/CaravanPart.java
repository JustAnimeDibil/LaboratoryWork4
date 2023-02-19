package classes;

import utilities.*;

import java.util.Objects;


public class CaravanPart extends AbstractClass {
    private String withCaravanName;
    private String bigLocation;
    private String mediumLocation;
    private String smallLocation;
    private String theyDo;

    public CaravanPart(String caravanName, String withCaravanName) {
        super(caravanName);
        this.withCaravanName = withCaravanName;
    }

    public void doDream(MainCharacter character) {
        System.out.println(character.getName() + " грезит о том, что:");
        whereIsThey(character, "Африка", "Египет", "оазис");
        whatTheyDoing(character, "отдыхают");
        whatHeDoing(character, "пьет из ручья ");
        character.isFeeling(Feelings.WONDERFUL);
    }


    public void whereIsThey(MainCharacter character, String bigLocation, String mediumLocation, String smallLocation) {
        System.out.println(character.getName() + ", " + getName() + " и " + getWithCaravan() + " находятся в " + bigLocation + " " + mediumLocation + " " + smallLocation);
        setBigLocation(bigLocation);
        setMediumLocation(mediumLocation);
        setSmallLocation(smallLocation);
    }

    public void whatTheyDoing(MainCharacter character, String theyDo) {
        System.out.println("Находясь в " + getBigLocation() + " " + getMediumLocation() + " " + getSmallLocation() + " " + character.getName() + ", " + getName() + " и " + getWithCaravan() + " - " + theyDo);
        setWhatTheyDo(theyDo);
    }

    public void whatHeDoing(MainCharacter character, String heDo) {
        System.out.println("Пока " + getName() + " и " + getWithCaravan() + " " + getWhatTheyDo() + ", " + character.getName() + " - " + heDo);
    }


    public String getWithCaravan() {
        return withCaravanName;
    }

    public String getBigLocation() {
        return bigLocation;
    }

    public String getMediumLocation() {
        return mediumLocation;
    }

    public String getSmallLocation() {
        return smallLocation;
    }

    public String getWhatTheyDo() {
        return theyDo;
    }

    public void setBigLocation(String bigLocation) {
        this.bigLocation = bigLocation;
    }

    public void setMediumLocation(String mediumLocation) {
        this.mediumLocation = mediumLocation;
    }

    public void setSmallLocation(String smallLocation) {
        this.smallLocation = smallLocation;
    }

    public void setWhatTheyDo(String theyDo) {
        this.theyDo = theyDo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        CaravanPart testobj = (CaravanPart) obj;
        return withCaravanName.equals(testobj.withCaravanName) && bigLocation.equals(testobj.bigLocation) && mediumLocation.equals(testobj.mediumLocation) && smallLocation.equals(testobj.smallLocation) && theyDo.equals(testobj.theyDo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withCaravanName, bigLocation, mediumLocation, smallLocation, theyDo);
    }

    @Override
    public String toString() {
        return getClass() + "caravanName=" + getName() + ", " + "withCaravanName=" + withCaravanName + ", " + "bigLocation=" + bigLocation + ", " + "mediumLocation=" + mediumLocation + ", " + "smallLocation=" + smallLocation + ", " + "theyDo=" + theyDo;
    }
}
