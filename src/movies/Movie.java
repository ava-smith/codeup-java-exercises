package movies;

import java.util.Arrays;

public class Movie {
    private String category;
    private String name;
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCategory(String category) {
        this.category = category;
    }


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(MoviesArray.findAll()));
    }

}
