package StrategyPattern.Level5_DesignPuzzle;

import StrategyPattern.Level5_DesignPuzzle.CharacterTypes.King;
import StrategyPattern.Level5_DesignPuzzle.WeaponTypes.KnifeBehaviour;

public class PlayGame {
    public static void main(String[] args) {
        Characters king = new King();
        king.showWeapons();

        king.setWeaponsBehaviour(new KnifeBehaviour());

        king.showWeapons();

    }
}
