package com.example.shoppinglist.data;

import com.example.shoppinglist.model.Cocktail;

import java.util.List;
import java.util.UUID;

public class CocktailDataProvider {

    public static List<Cocktail> getCocktails() {
        return List.of(
                new Cocktail()
                        .setCocktailId(UUID.fromString("23b3d85a-3928-41c0-a533-6538a71e17c4"))
                        .setName("Margerita")
                        .setGlass("Cocktail glass")
                        .setInstructions("Rub the rim of the glass with the lime slice to make the salt stick to it. Take care to moisten..")
                        .setImage("https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg")
                        .setIngredients(List.of("Tequila", "Triple sec", "Lime juice", "Salt")),
                new Cocktail()
                        .setCocktailId(UUID.fromString("d615ec78-fe93-467b-8d26-5d26d8eab073"))
                        .setName("Blue Margerita")
                        .setGlass("Cocktail glass")
                        .setInstructions("Rub rim of cocktail glass with lime juice. Dip rim in coarse salt..")
                        .setImage("https://www.thecocktaildb.com/images/media/drink/qtvvyq1439905913.jpg")
                        .setIngredients(List.of("Tequila", "Blue Curacao", "Lime juice", "Salt")));
    }
}
