package puzzle.stag;

import puzzle.AnimalTotem;

public class Stag extends AnimalTotem {
    private String eyesOff = "stag_not_glowing.img";
    private String eyesOn = "stag_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
