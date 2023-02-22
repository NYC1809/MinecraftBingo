package de.nyc.minecraftbingo.GameModes;

import de.nyc.minecraftbingo.Utils.Main;

public class GameModeManager {

    private Main plugin;
    private final GameMode[] gameModes;
    private GameMode selectedGameMode;


    public GameModeManager(Main plugin) {
        this.plugin = plugin;
        gameModes = new GameMode[5];

        gameModes[GameMode.CLASSIC] = new ClassicGameMode();
        gameModes[GameMode.EASY] = new EasyGameMode();
        gameModes[GameMode.MEDIUM] = new MediumGameMode();
        gameModes[GameMode.HARD] = new HardGameMode();
        gameModes[GameMode.FULL_BINGO] = new FullBingoGameMode();

    }

    public void setGameModes(int gameModeID) {
        if(selectedGameMode != null) {
            selectedGameMode.stop();
        }
        selectedGameMode = gameModes[gameModeID];
        selectedGameMode.start();
    }

    public void stopGameMode() {
        if(selectedGameMode != null) {
            selectedGameMode.stop();
            selectedGameMode = null;
        }
    }

    public GameMode getSelectedGameMode() {
        return selectedGameMode;
    }


}
