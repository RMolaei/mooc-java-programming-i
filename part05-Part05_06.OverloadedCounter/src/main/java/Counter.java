/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Molaei
 */
public class Counter {

    private int cnt;

    public Counter(int startValue) {
        this.cnt = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.cnt;
    }

    public void increase() {
        this.cnt++;
    }

    public void decrease() {
        this.cnt--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.cnt = this.cnt + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.cnt = this.cnt - decreaseBy;
        }
    }
}
