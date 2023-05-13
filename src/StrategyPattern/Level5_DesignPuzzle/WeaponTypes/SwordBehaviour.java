package StrategyPattern.Level5_DesignPuzzle.WeaponTypes;

import StrategyPattern.Level5_DesignPuzzle.Behaviours.WeaponsBehaviour;

public class SwordBehaviour implements WeaponsBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Uses sword");
    }
}
