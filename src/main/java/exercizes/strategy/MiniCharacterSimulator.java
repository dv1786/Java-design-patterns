package exercizes.strategy;

import exercizes.strategy.behavior_classes.AxeBehavior;

public class MiniCharacterSimulator {
    public static void main(String[] args) {
        Character character = new King();
        character.fight();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}
