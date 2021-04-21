package com.company.giftforbirthday;

import com.company.giftforbirthday.candy.Chocolate;
import com.company.giftforbirthday.candy.Lollipops;
import com.company.giftforbirthday.packing.GiftBox;
import com.company.giftforbirthday.packing.RectanlgeBox;
import com.company.giftforbirthday.packing.TriangleBox;

import java.util.Scanner;

public class AssemblingGift {

    public void assembling() {
        String strBox;
        String strCandy;
        Scanner point = new Scanner(System.in);
        System.out.println("Choose box which you wish:\nPress 1 to get Triangle box\nPress 2 to get Rectangle box\nPress 3 to get Gift box");
        int checkBox = point.nextByte();
        while (checkBox > 3 || checkBox < 1) {
            System.out.println("Press 1 to get Triangle box\nPress 2 to get Rectangle box\nPress 3 to get Gift box");
            checkBox = point.nextByte();
        }
        switch (checkBox) {
            case 1:
                TriangleBox triangleBox = new TriangleBox();
                triangleBox.color();
                triangleBox.shape();
                break;
            case 2:
                RectanlgeBox rectanlgeBox = new RectanlgeBox();
                rectanlgeBox.color();
                rectanlgeBox.shape();
                break;
            case 3:
                GiftBox giftBox = new GiftBox();
                giftBox.color();
                giftBox.shape();
                break;
        }
        System.out.println("Choose candies which you wish:\nPress 1 to get Lollipops\nPress 2 to get Chocolate");
        int lollipopsCheck = point.nextByte();
        while (lollipopsCheck < 1 || lollipopsCheck > 2) {
            System.out.println("Press 1 to get Lollipops\nPress 2 to get Chocolate");
            lollipopsCheck = point.nextByte();
        }
        switch (lollipopsCheck) {
            case 1:
                Lollipops lollipops = new Lollipops();
                lollipops.composition();
                lollipops.sweetness();
                break;
            case 2:
                Chocolate chocolate = new Chocolate();
                chocolate.composition();
                chocolate.sweetness();
                break;
        }
        System.out.println("Congratulation you get gift");
    }
}
