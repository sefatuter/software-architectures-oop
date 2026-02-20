package com.arc.gui.multithread_gui;

import javax.swing.*;
import java.util.concurrent.ExecutionException;

public class BC extends SwingWorker<Long, Object> {
    private final int n;
    private final JLabel resultJLabel;

    public BC(int n, JLabel resultJLabel) {
        this.n = n;
        this.resultJLabel = resultJLabel;
        execute(); // Automatically start the calculation
    }

    @Override
    protected Long doInBackground() throws Exception {
        long nthFib = fibonacci(n);
        return nthFib;
    }

    public long fibonacci(long number) {
        if (number < 0) {
            return -1; // Error case
        }
        if (number <= 1) {
            return number;
        }

        long prev = 0;
        long current = 1;

        for (long i = 2; i <= number; i++) {
            long next = prev + current;
            // Check for overflow
            if (next < 0) {
                return -1; // Indicate overflow
            }
            prev = current;
            current = next;
        }
        return current;
    }

    @Override
    protected void done() {
        try {
            Long result = get();
            if (result == -1) {
                resultJLabel.setText("Error: Number too large or invalid");
            } else {
                resultJLabel.setText("Fibonacci(" + n + ") = " + result);
            }
        } catch (InterruptedException | ExecutionException e) {
            resultJLabel.setText("Error calculating Fibonacci number");
        }
    }
}
