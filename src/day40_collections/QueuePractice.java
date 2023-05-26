package day40_collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> ad = new ArrayDeque<>();
        Queue<Integer> ll = new LinkedList<>();

        pq.addAll(Arrays.asList(1,3,6,45,23,5));
        ad.addAll(Arrays.asList(1,3,6,45,23,5));
        ll.addAll(Arrays.asList(1,3,6,45,23,5));

        pq.add(45);
        pq.add(5);
        pq.add(45);

        System.out.println(pq);
        System.out.println(ad);
        System.out.println(ll);

        System.out.println(ad.poll());

        System.out.println(ad);

        System.out.println(((List) ll).get(1));

        System.out.println(ad.remove());

        System.out.println(ad);


    }
}
