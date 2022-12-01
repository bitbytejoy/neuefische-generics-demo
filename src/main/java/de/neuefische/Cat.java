package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat implements NeuefischeListItem {
    private String name;
    private int age;
}
