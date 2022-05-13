package puzzle;

public abstract class AnimalTotem {
    private static final boolean DEFAULT_OFF_STATE = false;
    private boolean eyesAreGlowing = DEFAULT_OFF_STATE;
    private String eyes;

    public void eyesToggle(String eyesOff, String eyesOn) {
        if (eyesAreGlowing) {
            eyesAreGlowing = false;
            eyes = "not_glowing.img";
        } else {
            eyesAreGlowing = true;
            eyes = "glowing.img";
        }

    }
}


