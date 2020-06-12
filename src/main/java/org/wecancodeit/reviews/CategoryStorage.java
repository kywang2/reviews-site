package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {

    Map<String, Category> categories = new HashMap<>();

    public CategoryStorage() {
        Ben ben1 = new Ben("Ben Affleck", "Actor", "08/15/1972",
                "American Actor and Filmmaker", "BenThereDoneThat",
                "../../images/Ben_Affleck.jpg", "4.25 out of 5", "A good ol’ boy from Bas-tan.");
        Ben ben2 = new Ben("Benjamin Franklin", "Founding Father/Inventor", "01/17/1706",
                "Benjamin Franklin  was an American polymath", "Ben", "../../images/Benjamin_Franklin.jpg",
                "5 out of 5", "A figure who revolutionized American history and modern society");
        ArrayList<Ben> allBens = new ArrayList<>();
        allBens.add(ben1);
        allBens.add(ben2);
        categories.put("Actors", new Category("Actors", allBens));
    }

    public Category findCategoryByName(String category) {
        return categories.get(category);

    }

    public Collection<Category> getAllCategories() {
        return categories.values();
    }
}
