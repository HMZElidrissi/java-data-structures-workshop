package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();

        // TODO: Ajoutez "premier", "deuxième", "troisième" à la queue
        queue.offer("premier");
        queue.offer("deuxième");
        queue.offer("troisième");
//
//        for(long i=0;i<10000000; i++){
//            queue.offer("premier");
//            System.out.println(queue);
//        }
        while(true){
           if(!queue.offer("premier")){
               System.out.printf("full");
               break;
           }

        }
    }
}