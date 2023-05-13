package StrategyPattern.Level5_DesignPuzzle.CharacterTypes;

import StrategyPattern.Level5_DesignPuzzle.Characters;
import StrategyPattern.Level5_DesignPuzzle.WeaponTypes.SwordBehaviour;

public class King extends Characters {
    public King() {
        setWeaponsBehaviour(new SwordBehaviour());
    }
}
