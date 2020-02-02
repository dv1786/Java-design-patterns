package exercizes.strategy;

import exercizes.strategy.behavior_classes.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public Character() {
    }

    public void fight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
