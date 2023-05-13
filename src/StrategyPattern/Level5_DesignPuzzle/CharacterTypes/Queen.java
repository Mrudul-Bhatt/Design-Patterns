package StrategyPattern.Level5_DesignPuzzle.CharacterTypes;

import StrategyPattern.Level5_DesignPuzzle.Characters;
import StrategyPattern.Level5_DesignPuzzle.WeaponTypes.KnifeBehaviour;

public class Queen extends Characters {
    public Queen() {
        setWeaponsBehaviour(new KnifeBehaviour());
    }
}
