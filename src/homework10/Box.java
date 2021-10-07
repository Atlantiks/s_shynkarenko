package homework10;

import lombok.Data;

@Data

public class Box {
    int length;
    int depth;
    int height;
    double weight;

    Box(int l, int d, int h, double w) {
        length = l;
        depth = d;
        height = h;
        weight = w;
    }


}
