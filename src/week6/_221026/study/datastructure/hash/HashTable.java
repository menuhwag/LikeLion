package week6._221026.study.datastructure.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTable {
    private int size = 10000;
    private List<Node>[] table = new List[size];

    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i) << (i % 5);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        if (this.table[hashCode] == null) {
            this.table[hashCode] = new ArrayList<>();
        }
        this.table[hashCode].add(new Node(key, value));
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }
}
