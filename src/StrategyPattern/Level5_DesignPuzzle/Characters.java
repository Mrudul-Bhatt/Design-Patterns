package StrategyPattern.Level5_DesignPuzzle;

import StrategyPattern.Level5_DesignPuzzle.Behaviours.WeaponsBehaviour;

public abstract class Characters {

    WeaponsBehaviour weaponsBehaviour;

    public void setWeaponsBehaviour(WeaponsBehaviour weaponsBehaviour) {
        this.weaponsBehaviour = weaponsBehaviour;
    }

    public void showWeapons() {
        weaponsBehaviour.useWeapon();
    }

    public void fight() {
        System.out.println("Fight");
    }
}
