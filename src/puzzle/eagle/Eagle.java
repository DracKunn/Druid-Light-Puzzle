package puzzle.eagle;

import puzzle.AnimalTotem;

public class Eagle extends AnimalTotem{
    private String eyesOff = "eagle_not_glowing.img";
    private String eyesOn = "eagle_glowing.img";

    @Override
    public void eyesToggle(String eyesOff, String eyesOn) {
        super.eyesToggle(eyesOff, eyesOn);
    }
}
