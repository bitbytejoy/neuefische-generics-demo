package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog implements NeuefischeListItem {
    private String name;
    private String breed;
    private int age;
}
