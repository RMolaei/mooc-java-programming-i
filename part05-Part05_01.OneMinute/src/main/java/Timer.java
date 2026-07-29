/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Molaei
 */
public class Timer {

    ClockHand second = new ClockHand(60);
    ClockHand hundredthsOfaSecond = new ClockHand(100);

    public Timer() {
        //
    }

    public void advance() {
        hundredthsOfaSecond.advance();
        if (hundredthsOfaSecond.value() == 0) {
            second.advance();
        }
    }

    @Override
    public String toString() {
        return second + ":" + hundredthsOfaSecond;
    }
}
