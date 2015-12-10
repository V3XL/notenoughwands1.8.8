package romelo333.notenoughwands;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import romelo333.notenoughwands.Items.*;

public class ModItems {
    public static WandCore wandCore;
    public static AdvancedWandCore advancedWandCore;
    public static TeleportationWand teleportationWand;

    public static void init() {
        wandCore = new WandCore("wandcore");
        advancedWandCore = new AdvancedWandCore("advanced_wandcore");
        teleportationWand = new TeleportationWand();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        wandCore.registerModel();
        advancedWandCore.registerModel();
    }
}
