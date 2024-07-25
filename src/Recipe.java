import java.io.*;

class Recipe implements Serializable{
    private String recipeName;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }
    public static void main(String[] args) throws Exception{
        ObjectOutputStream saveFavourites = null;
        boolean isFavourite = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\USER\\IdeaProjects\\nutritionApp\\src\\recipe.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // display each line to the console

                }
            }
        Recipe favouriteRecipe = new Recipe("Crock Pot Roast");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("favourite_recipe.txt"))){
            outputStream.writeObject(favouriteRecipe);
        }
    }

}
