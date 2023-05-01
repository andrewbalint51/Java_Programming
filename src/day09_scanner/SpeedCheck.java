package day09_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int speedLimit =  55;
        int currentSpeed;

        System.out.print("Enter your current speed: ");

        currentSpeed = in.nextInt();

        in.close();

        if(currentSpeed>speedLimit){
            System.out.println("You're driving "+(currentSpeed-speedLimit)+" MPH over the speed limit. Slow down!");
        }


    }
}

/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */