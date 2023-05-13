package StrategyPattern.Level5_DesignPuzzle.WeaponTypes;

import StrategyPattern.Level5_DesignPuzzle.Behaviours.WeaponsBehaviour;

public class KnifeBehaviour implements WeaponsBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Uses knife");
    }
}
