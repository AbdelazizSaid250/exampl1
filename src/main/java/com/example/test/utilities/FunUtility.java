package com.example.test.utilities;

import org.springframework.stereotype.Component;


@Component
public class FunUtility {

    public void sing(String songName) {
        switch (songName) {
            case DefinedValues.ENTA_OMRI:
                System.out.println("Enta Omriiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii, Entra Omri");
                break;
            case DefinedValues.HOB_EIH:
                System.out.println("Hob Eiiiiiih 2ly Nta Gay t2ol 3leeeeeeh");
                break;
            case DefinedValues.COME_BACK:
                System.out.println("Come Back to me!!!");
                break;
            default:
                System.out.println("Something went wrong");
        }
    }

    public void dance(String danceName) {
        switch (danceName) {
            case DefinedValues.SALSA:
                System.out.println("Let's dance Salsa!");
                break;
            case DefinedValues.HIP_HOP:
                System.out.println("Get ready to bust some moves with Hip Hop!");
                break;
            case DefinedValues.BALLET:
                System.out.println("Time to showcase your grace with Ballet!");
                break;
            default:
                System.out.println("Unknown dance style");
        }
    }
}
