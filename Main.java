package com.company;

import java.util.Scanner;

//at^2/2 + vt max distance, where a is the positive acceleration (at accelerated motion) 1 m/s2 ≤ ap ≤ 3 m/s2
//vt-at^2/2  min distance, where a is the negative acceleration (at decelerated motion)  1 m/s2 ≤ an ≤ 3 m/s2
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT: Car’s initial speed 20 km/h ≤ v0 ≤ 80 km/h;");
        int initialSpeed = in.nextInt();
        System.out.println("INPUT: Intial distance to the intersection 10 m ≤ x0 ≤ 150 m;");
        int initialDistance = in.nextInt();
        System.out.println("INPUT: Duration of the yellow light 2 s ≤ t yellow ≤ 5 s;");
        int yellowLightTime = in.nextInt();
        System.out.println("INPUT: positive acceleration (at accelerated motion) 1 m/s2 ≤ ap ≤ 3 m/s2");
        int positiveAccelaration = in.nextInt();
        System.out.println("INPUT: negative acceleration (at decelerated motion) 1 m/s2 ≤ an ≤ 3 m/s2");
        int negativeAccelaration = in.nextInt();


        makingDecision(initialSpeed, initialDistance, yellowLightTime, positiveAccelaration, negativeAccelaration);
    }

    public static void makingDecision(int initialSpeed, int initialDistance, int yellowLightTime, int positiveAccelaration, int negativeAccelaration) {

        int speed = (int) (initialSpeed * 0.27777);

        int maximumDistance = (positiveAccelaration * yellowLightTime * yellowLightTime / 2) + speed * yellowLightTime;
        int minimumDistance = speed * yellowLightTime - (negativeAccelaration * yellowLightTime * yellowLightTime / 2);

        if (initialDistance < minimumDistance) {
            System.out.println("don't stop");
        }
        if (initialDistance > maximumDistance) {
            System.out.println("stop");
        } else if (initialDistance > minimumDistance && initialDistance < maximumDistance) {
            System.out.println("don't stop");
        }
    }
}
