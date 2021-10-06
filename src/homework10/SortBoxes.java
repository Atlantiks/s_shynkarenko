package homework10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SortBoxes {
    static List<Box> allBoxes = new ArrayList<>();
    static List<Box> heavyBoxes = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int length = (int)(Math.random() * 500);
            int depth = (int)(Math.random() * 500);
            int height = (int)(Math.random() * 500);
            double weight = (int)(Math.random() * 500);
            allBoxes.add(new Box(length, depth, height, weight));
        }

        System.out.println("Всего коробок до перемещения в исходной коллекции: " + allBoxes.size());
        repositionHeavyBoxes(allBoxes);
        System.out.println("Всего коробок после перемещения в исходной коллекции: " + allBoxes.size());
        System.out.println("Всего больших коробок после перемещения: " + heavyBoxes.size());
        for (int i = 0; i < heavyBoxes.size(); i++) {
            System.out.println("Вес коробки " + (i + 1) + " составляет " + heavyBoxes.get(i).weight + " гр.");
        }

    }

    public static void repositionHeavyBoxes(List<Box> boxes) {
        Iterator<Box> iter = boxes.iterator();
        Box nextBox;
        while(iter.hasNext()) {
            nextBox = iter.next();
            if (nextBox.weight > 300) {
                heavyBoxes.add(nextBox);
                iter.remove();
            }
        }
    }
}
