package com.lesson.my_exercises.command2;

import java.util.Stack;

public class TransactionManager {
    Stack<Transaction> history = new Stack<>();

    void executeTransaction(Transaction tx){
        tx.execute();
        history.push(tx);
    }
    void undoLastTransaction(){
        if (!history.isEmpty()) {
            Transaction lastTx = history.pop();
            System.out.print("[UNDO] ");
            lastTx.undo();
        } else {
            System.out.println("No transaction to undo.");
        }
    }
}
