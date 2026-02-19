package com.arc.threads.basics;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CounterThree c1 = new CounterThree("c1", 1);
        Thread t1 = new Thread(c1);

        t1.start();
        Thread.sleep(2000);
        c1.stop();

        // 1-
//        Thread t1 = new Thread(new CounterThree("c1", 1));
//        t1.start();

//        Thread t2 = new Thread(new CounterThree("c2", 2));
//        t2.start();

        //        CounterTwo c1 = new CounterTwo("c1");
        //        CounterTwo c2 = new CounterTwo("c2");
        //        CounterTwo c3 = new CounterTwo("c3");
        //
        //        Thread t1 = new Thread(c1);
        //        Thread t2 = new Thread(c2);
        //        Thread t3 = new Thread(c3);
        //
        //        t1.start();
        //        t2.start();
        //        t3.start();


        //        Counter c1 = new Counter("counter1");
        //        Counter c2 = new Counter("counter2");
        //
        //        c1.start();
        //        c2.start();

    }
}


// Running state
// Waiting state   -- waits for other thread to finish job

// Sleeping thread -- sleeps certain period of time (called sleep interval)
// terminated state-- when it successfully complete and otherwise terminates