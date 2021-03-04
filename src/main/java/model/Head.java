package model;

public class Head{
   private JawState jawState = JawState.NORMAL;
   private HeadActivity activity =  HeadActivity.NOTHING;
  public int toSee(Human human){
        int things = 0;
        if(human.getHeads()[0].activity == HeadActivity.SMILE) things++;
       if(human.getHeads()[1].activity == HeadActivity.PEEK_TEATH) things++;
       if(human.getLegs().getThingUnder().equals("pult")) things++;
       return things;
    }

    public HeadActivity getActivity() {
        return activity;
    }

    public JawState getJawState() {
        return jawState;
    }

    public void setJawState(JawState jawState) {
        this.jawState = jawState;
    }

    public void setActivity(HeadActivity activity) {
        this.activity = activity;
    }
}
