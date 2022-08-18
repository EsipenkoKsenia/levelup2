package ru.levelup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/animals.csv"));

        // считываем построчно
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Animals> animalsList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Animals animals = new Animals();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    animals.setLogin(data);
                else if (index == 1)
                    animals.setName(data);
                else if (index == 2)
                    animals.setAge(Integer.parseInt(data));
                else if (index == 3)
                    animals.setBonus(Integer.parseInt(data));
                else
                    System.out.println("Некорректные данные::" + data);
                index++;
            }
            index = 0;
            animalsList.add(animals);
        }

        //закрываем наш ридер
        reader.close();

        System.out.println(animalsList);

    }
}
