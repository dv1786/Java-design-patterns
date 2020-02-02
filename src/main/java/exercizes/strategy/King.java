package exercizes.strategy;

import exercizes.strategy.behavior_classes.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }
}
