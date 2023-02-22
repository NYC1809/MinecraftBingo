package de.nyc.minecraftbingo.Utils;

import de.nyc.minecraftbingo.Enums.Items;
import de.nyc.minecraftbingo.Enums.GameMode;
import org.bukkit.Material;

import java.util.*;

public class GenerateBingoCard {

    List<Material> materialEasy = new ArrayList<>();
    List<Material> materialMedium = new ArrayList<>();
    List<Material> materialHard = new ArrayList<>();

    Set<Integer> usedNumbers = new HashSet<>();

    Map<Integer, Material> bingoMap = new HashMap<>();

    public GenerateBingoCard(GameMode gameMode) {
        addMaterialFromEnum();
        switch (gameMode) {
            case CLASSIC:
                Random random = new Random();
                // HARD
                for(int i = 0; i < gameMode.getAmountHard(); i++) {
                    int number;
                    do {
                        number = random.nextInt(25);
                    } while (usedNumbers.contains(number));
                    usedNumbers.add(number);

                    int random_material = random.nextInt(materialHard.size());
                    Material material = materialHard.get(random_material);
                    bingoMap.put(number, material);
                }
                // HARD
                // MEDIUM
                for(int i = 0; i < gameMode.getAmountMedium(); i++) {
                    int number;
                    do {
                        number = random.nextInt(25);
                    } while (usedNumbers.contains(number));
                    usedNumbers.add(number);

                    int random_material = random.nextInt(materialMedium.size());
                    Material material = materialMedium.get(random_material);
                    bingoMap.put(number, material);
                }
                // MEDIUM
                // EASY
                for(int i = 0; i < gameMode.getAmountEasy(); i++) {
                    int number;
                    do {
                        number = random.nextInt(25);
                    } while (usedNumbers.contains(number));
                    usedNumbers.add(number);

                    int random_material = random.nextInt(materialEasy.size());
                    Material material = materialEasy.get(random_material);

                    bingoMap.put(number, material);
                }
                //EASY
                break;
            case EASY:
                //TODO: Implement EASY GameMode
                break;
            case MEDIUM:
                //TODO: Implement MEDIUM GameMode
                break;
            case HARD:
                //TODO: Implement HARD GameMode
                break;
            case EXTREME:
                //TODO: Implement EXTREME GameMode
                break;
            case FULL_BINGO:
                //TODO: Implement FULL_BINGO GameMode
                break;
        }
    }

    public void addMaterialFromEnum() {
        for(Items item : Items.values()) {
            switch (item.getDifficulty()) {
                case "easy":
                    materialEasy.add(Material.getMaterial(String.valueOf(item)));
                    break;
                case "medium":
                    materialMedium.add(Material.getMaterial(String.valueOf(item)));
                    break;
                case "hard":
                    materialHard.add(Material.getMaterial(String.valueOf(item)));
                    break;
                default:
                    System.out.println("Item " + item.name() + " has wrong difficulty set!");
                    break;
            }
        }
    }

    public Map<Integer, Material> getBingoMap() {
        return bingoMap;
    }
}
