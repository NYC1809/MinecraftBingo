package de.nyc.minecraftbingo.Enums;

public enum GameMode{

    CLASSIC(17,5,3, 5),
    EASY(25,0,0, 5),
    MEDIUM(0,25,0,5),
    HARD(0,0,25,5),
    EXTREME(0,5,20,20),
    FULL_BINGO(17,5,3,25);

    private final int amountEasy;
    private final int amountMedium;
    private final int amountHard;
    private final int amountObtainedToWin;


    GameMode(int amountEasy, int amountMedium, int amountHard, int amountObtainedToWin) {
        this.amountEasy = amountEasy;
        this.amountMedium = amountMedium;
        this.amountHard = amountHard;
        this.amountObtainedToWin = amountObtainedToWin;
    }


    public int getAmountEasy() {
        return amountEasy;
    }

    public int getAmountMedium() {
        return amountMedium;
    }

    public int getAmountHard() {
        return amountHard;
    }

    public int getAmountObtainedToWin() {
        return amountObtainedToWin;
    }
}
