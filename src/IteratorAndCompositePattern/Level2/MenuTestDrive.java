package IteratorAndCompositePattern.Level2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeMenu = new PancakeMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        WaitressV1 waitress = new WaitressV1(pancakeMenu, dinerMenu, cafeMenu);
        waitress.printMenu();

        System.out.println("\n\n\n");

        ArrayList<Menu> menus = new ArrayList<>() {
            {
                add(pancakeMenu);
                add(dinerMenu);
                add(cafeMenu);
            }
        };

        WaitressV2 waitressV2 = new WaitressV2(menus);
        waitressV2.printMenu();
    }
}
