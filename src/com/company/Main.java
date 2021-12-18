package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Boss boss =new Boss();
        boss.setHealth(45);
        boss.setHook(50);
        boss.setWeapon(new Weapon("ak-47", "yes"));

        Skeleton skeleton= new Skeleton();
        skeleton.setHealth(45);
        skeleton.setHook(50);
        skeleton.setGan(456);


        Skeleton skeletonn= new Skeleton();
        skeletonn.setHealth(445);
        skeletonn.setHook(501);
        skeletonn.setGan(445664556);



        out.println(skeleton.printInfoforskeleton());
        out.println(skeletonn.printInfoforskeleton());
        out.println(boss.printInfo());



    }





}
