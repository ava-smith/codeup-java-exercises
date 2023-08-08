package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?");
        System.out.println("0 - exit \n1 - view all movies \n2 - view movies in the animated category \n3 - view movies in the drama category \n4 - view movies in the horror category \n5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        int userChoice = input.getInt(0, 5);
    }
}
