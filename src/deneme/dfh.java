package deneme;

import javax.swing.*;

public class dfh {

    public static void main(String[] args) {

        int right = 0;
        int left = 0;
        int forward = 0;
        int achcount = 0;

        boolean restart = true;

        while(restart == true){
            String movement = JOptionPane.showInputDialog("Welcome to my puzzle game. In this game, you try to find the combination of movements to get all 6 achievements. You can go left, right, forward, backward. (backward will just make the forward less) \nLeft: " + left + "\nRight: " + right + "\nForward: " + forward);
            movement = movement.toLowerCase();
            if(movement.equals("right")) {
                right = goright(right);
            }

            if(movement.equals("left")) {
                left = goleft(left);
            }

            if(movement.equals("forward")) {
                forward = goforward(forward);
            }

            if(movement.equals("backward")) {
                forward = gobackward(forward);
            }
        }

        if (right == 12) {
            JOptionPane.showMessageDialog(null, "You got \"for loop achievement!\"");
            right = right - 12;
            ach(achcount, restart);
        }

        if (right == 19 && left == 9 && forward == 8) {
            JOptionPane.showMessageDialog(null, "You got \"Google achievement!\"");
            right = right - 19;
            left = left - 9;
            forward = forward - 8;
            ach(achcount, restart);
        }

        if (forward == -1) {
            JOptionPane.showMessageDialog(null, "You got \"bunk to the wall\" achievement!");
            forward = 0;
            ach(achcount, restart);
        }

        if (right == 6 && left == 6 && forward == 6) {
            JOptionPane.showMessageDialog(null, "You got \"THE HELL\" achievement!");
            ach(achcount, restart);
        }

        if (right == 20 && left == 20) {
            JOptionPane.showMessageDialog(null, "You got \"2 0 2 0\" achievement!");
            ach(achcount, restart);
        }

        if (right == 100 && left == 100 && forward == 100) {
            JOptionPane.showMessageDialog(null, "You got \"100th\" achievement!");
            ach(achcount, restart);
        }

    }

    static int goright(int right) {
        right = right + 1;
        return right;
    }

    static int goleft(int left) {
        left = left + 1;
        return left;
    }

    static int goforward(int forward) {
        forward = forward + 1;
        return forward;
    }

    static int gobackward(int forward) {
        forward = forward - 1;
        return forward;
    }

    static int ach(int achcount, boolean restart) {

        if (achcount >= 6) {
            restart = false;
            JOptionPane.showMessageDialog(null, "Congratulations, you got all 6 achievements! \nWhat now? What happened when you got all 6 of them?\nYou literally wasted your time into this trash game? Really?");
        }

        achcount = achcount + 1;
        return achcount;
    }


}
