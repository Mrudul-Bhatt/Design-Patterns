package TemplatePattern.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        // read the user's response
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null)
            return "no";

        return answer;
    }

}
