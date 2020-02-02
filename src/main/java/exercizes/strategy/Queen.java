package exercizes.strategy;

import exercizes.strategy.behavior_classes.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }
}
