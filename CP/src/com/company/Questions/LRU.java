package com.company.Questions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRU {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}


class LRUCache {
    static LinkedList<Integer> queue;
    static int size;
    static HashMap<Integer,Integer> map;
    LRUCache(int cap) {
        // Intialize the cache capacity with the given
        // cap
        queue = new LinkedList<>();
        size = cap;
        map=new LinkedHashMap<>();
    }

    // This method works in O(1)
    public static int get(int key) {
        // your code here
        int res=-1;
        if(map.containsKey(key)){
            res=map.get(key);
            queue.remove(new Integer(key));
            queue.addLast(key);
        }
        return res;
    }

    // This method works in O(1)
    public static void set(int key, int value) {
        // your code here
        if (map.containsKey(key)){
            queue.remove(new Integer(key));
            map.put(key,value);
            queue.addLast(key);
        }else {
            if (map.size()==size){
                int elem=queue.removeFirst();
                map.remove(elem);
            }
            map.put(key,value);
            queue.addLast(key);
        }
    }
}
