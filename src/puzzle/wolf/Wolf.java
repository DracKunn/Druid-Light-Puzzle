package puzzle.wolf;

import puzzle.AnimalTotem;

public class Wolf extends AnimalTotem {
    private String eyesOff = "wolf_not_glowing.img";
    private String eyesOn = "wolf_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
