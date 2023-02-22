package de.nyc.minecraftbingo.GameModes;

public abstract class GameMode{

    public static final int CLASSIC = 0,
                            EASY = 1,
                            MEDIUM = 2,
                            HARD = 3,
                            FULL_BINGO = 4;

    public abstract void start();
    public abstract void stop();

}
