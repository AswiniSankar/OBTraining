package com.corejava.assignments.day8.threads;

import java.util.LinkedList;

public class ProducerAndConsumerThread {
    public static void main(String[] args)
        throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final Product pc = new Product();
  
       
        Thread t1 = new Thread(new Runnable() { // Create producer thread
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
  
     
        Thread t2 = new Thread(new Runnable() {    // Create consumer thread
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
  
       
        t1.start();  // Start both threads
        t2.start();
  
     
    }
  
    // This class has a list, producer (adds items to list
    // and consumer (removes items).
    public static class Product {
  
        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 3;
  
        // Function called by producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();
  
                    System.out.println("Producer produced-"
                                       + value);
  
                  
                    list.add(value++);
  
                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();
  
                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(1000);
                }
            }
        }
  
        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0)
                        wait();
  
                    // to retrieve the first job in the list
                    int val = list.removeFirst();
  
                    System.out.println("Consumer consumed-"
                                       + val);
  
                    // Wake up producer thread
                    notify();
  
                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
}