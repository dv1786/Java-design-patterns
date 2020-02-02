package exercizes.strategy;

import exercizes.strategy.behavior_classes.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new BowAndArrowBehavior();
    }
}
