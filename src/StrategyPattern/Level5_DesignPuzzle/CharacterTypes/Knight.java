package StrategyPattern.Level5_DesignPuzzle.CharacterTypes;

import StrategyPattern.Level5_DesignPuzzle.Characters;
import StrategyPattern.Level5_DesignPuzzle.WeaponTypes.BowAndArrowBehaviour;

public class Knight extends Characters {
    public Knight() {
        setWeaponsBehaviour(new BowAndArrowBehaviour());
    }
}
