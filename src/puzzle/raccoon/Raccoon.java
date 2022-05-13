package puzzle.raccoon;

import puzzle.AnimalTotem;

public class Raccoon extends AnimalTotem {
    private String eyesOff = "raccoon_not_glowing.img";
    private String eyesOn = "raccoon_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
