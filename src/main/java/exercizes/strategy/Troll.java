package exercizes.strategy;

import exercizes.strategy.behavior_classes.AxeBehavior;

public class Troll extends Character{
    public Troll() {
        weapon = new AxeBehavior();
    }
}
