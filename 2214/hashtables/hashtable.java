package hashtables;

import java.io.*;
import java.util.*;

public class hashtable {

    private int[] list;
    private int[} bucket;
    private int bucketIndex = 0;

    public hashtable() {
        list = new int[10];
        bucket = new int[10];
    }

    public hashtable(int[] list) {
        this.list = list;
        bucket = new int[10];
    }

    public void put(char ch, int data) {
        int index = ch % 10;
        if ((this.at(ch)) == 0) {
            list[index] = data;
        } else {
            bucket[bucketIndex] = data;
            bucketIndex++;
        }
    }

    public int at(char ch) {
        int index = ch % 10;
        return list[index];
    }

    public int[] getTable() {
        return list;
    }

    public int[] getBucket() {
        return bucket;
    }
}
