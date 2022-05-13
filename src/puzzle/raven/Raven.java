package puzzle.raven;

import puzzle.AnimalTotem;

public class Raven extends AnimalTotem {
    private String eyesOff = "raven_not_glowing.img";
    private String eyesOn = "raven_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
