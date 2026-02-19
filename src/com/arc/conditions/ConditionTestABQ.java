package com.arc.conditions;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTestABQ implements Buffer{
    private final Condition canRead;
    private final Condition canWrite;

    private final ReentrantLock lock;

    private int buffer = -1;
    private boolean isOccupied;

    public ConditionTestABQ(){
        lock = new ReentrantLock();
        canRead = lock.newCondition();
        canWrite = lock.newCondition();
    }

    public void set(int value) throws InterruptedException {
        lock.lock();
        if (isOccupied){
            canWrite.await();
        }
        buffer = value;
        isOccupied = true;
        canRead.signal();
        lock.unlock();
    }

    public int get() throws InterruptedException{
        lock.lock();
        if (!isOccupied){
            canRead.await();
        }
        int getValue = buffer;
        isOccupied = false;
        canWrite.signal();
        lock.unlock();

        return getValue;
    }
}
