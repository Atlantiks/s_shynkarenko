package homework8;

import java.util.Arrays;

public class MyStringCollectionImpl implements StringCollection {
    private String[] data;
    private int index;

    public MyStringCollectionImpl(String[] data) {
        this.data = data;
        this.index = data.length;
    }

    public MyStringCollectionImpl(){
        this.data = new String[]{};
        index = 0;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index > this.index - 1)
            throw new IndexOutOfBoundsException("Index beyond collection size");
        else
            return data[index];
    }

    @Override
    public boolean add(String str) {
        String[] output = new String[data.length + 1];

        System.arraycopy(data, 0, output, 0, data.length);
        output[output.length - 1] = str;
        data = output;
        index++;
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        String[] output = new String[data.length + 1];

        if (index < 0 || index > data.length) return false;

        for (int i = 0, j = 0; i < data.length; i++, j++) {
            if (i != index) output[j] = data[i];
            else {
                output[j] = str;
                i--;
                index = -1;
            }
        }
        data = output;
        return true;
    }

    @Override
    public boolean delete(String str) {
        if (!contains(str)) return false;

        String[] output = new String[data.length - 1];
        int index = 0;

        for (String x : data) {
            if (x == null) continue;
            if (!x.equals(str)) output[index++] = x;
        }
        data = output;
        delete(str);
        return true;
    }

    @Override
    public boolean contains(String str) {
        for (String x : this.data) {
            if (x == null) continue;
            if (x.equals(str)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        MyStringCollectionImpl alfa = (MyStringCollectionImpl)collection;
        for (String x : this.data) {
            if (!alfa.contains(x)) return false;
        }
        return true;

    }

    @Override
    public boolean clear() {
        data = new String[]{};
        index = 0;
        return true;
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
