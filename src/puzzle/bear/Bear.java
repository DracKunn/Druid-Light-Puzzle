package puzzle.bear;

import puzzle.AnimalTotem;

public class Bear extends AnimalTotem {

    private boolean eyesAreGlowing = false;
    private  String eyesOff = "bear_not_glowing.img";
    private String eyesOn = "bear_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
