public class storyLine {
    private int mstoryID;

    private  int mOptionID;


    public storyLine(int storyText, int optionID){
        mstoryID=storyText;
        mOptionID=optionID;
    }





    public int getOptionID() {
        return mOptionID;
    }

    public void setOptionID(int optionID) {
        mOptionID = optionID;
    }
}
