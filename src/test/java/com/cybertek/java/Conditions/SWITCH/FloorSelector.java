package com.cybertek.java.Conditions.SWITCH;

public class FloorSelector {
    public static void main (String [] args){
        int floorNum = 1;
        switch (floorNum){
            case 1:
                System.out.print("Floor 1 selected. companies: Lobby, Verizon, Starbucks");
              //  break; // Exit this case

            case 2:
                    System.out.print("Floor 2 selected. companies: CyberTek, NASA, INTELSAT");
                    break;

            case  3:
                    System.out.print("Floor 3 selected. companies: Lobby, Verizon, Starbucks");
                    break;

            case  4:
                    System.out.print("Floor 4 selected. companies: LYFT, BOFA, StakeHouse");
                    break;
            default: // if it doesn't match

                    System.out.print("invalid number of the floor "+floorNum);
                    break;



        }
    }
}
