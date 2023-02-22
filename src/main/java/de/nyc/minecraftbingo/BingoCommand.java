package de.nyc.minecraftbingo;

import de.nyc.minecraftbingo.Enums.GameMode;
import de.nyc.minecraftbingo.Utils.GenerateBingoCard;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BingoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("You are not a Player!");
            return true;
        }

        Player player = ((Player) sender).getPlayer();
        assert player != null;

        GenerateBingoCard generateBingoCard = new GenerateBingoCard(GameMode.CLASSIC);

        System.out.println("BINGO MAP: ");
        for(int i = 0; i < 25; i++) {
            Material material = generateBingoCard.getBingoMap().get(i);
            System.out.println("[" + i + "] " + material);
            player.sendMessage("[" + i + "] " + material);
        }

        return false;
    }
}
