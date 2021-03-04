package model;

public class Human {
   private Head[] heads = new Head[]{new Head(), new Head()};
   private Arm[] arms = new Arm[]{new Arm(),new Arm()};
   private Legs legs = new Legs();
   private EmotionalState emotionalState = EmotionalState.CALM;

   public void toSee(int headNumber, Human human){
        if (headNumber<0) headNumber=0;
        if (headNumber>1) headNumber=1;
        int things = heads[headNumber].toSee(human);
        if (things>0) emotionalState=EmotionalState.SHOCKED;
        if (things>=3) heads[headNumber].setJawState(JawState.DROPPED);
    }

    public EmotionalState getEmotionalState() {
        return emotionalState;
    }

    public Arm[] getArms() {
        return arms;
    }

    public Head[] getHeads() {
        return heads;
    }

    public Legs getLegs() {
        return legs;
    }
}

