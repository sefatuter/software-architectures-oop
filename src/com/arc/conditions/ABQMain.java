package com.arc.conditions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ABQMain {
    public static void main(String[] args) {

        Buffer buffer = new ConditionTestABQ();

        Buffer buffer2 = new ABQ();

        Buffer buffer3 = new ConditionTestABQSynchronized();

        ExecutorService executer = Executors.newCachedThreadPool();

        //1-
//        executer.execute(new ProducerABQ(buffer));
//        executer.execute(new ConsumerABQ(buffer));

        //2-
//        executer.execute(new ProducerABQ(buffer2));
//        executer.execute(new ConsumerABQ(buffer2));

        //3-
        executer.execute(new ProducerABQ(buffer3));
        executer.execute(new ConsumerABQ(buffer3));

        executer.shutdown();

    }
}
