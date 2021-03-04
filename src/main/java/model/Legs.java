package model;

public class Legs{
   private String thingUnder="floor";
   public void putOn(String thing){
        thingUnder=thing;
    }

    public String getThingUnder() {
        return thingUnder;
    }
}
