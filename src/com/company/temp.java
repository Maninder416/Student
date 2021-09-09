package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class temp {
    public double testing2(){
        String grade= "5";
        double fee= 0;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (grade.equals("1")) {
            fee = 100 * 1.5;

        } else if (grade.equals("2")) {
            fee = (100 * 1.5) + (100 * 1.5) * 0.30;

        } else if (grade.equals("3")) {
            fee = ((100 * 1.5) + (100 * 1.5) * 0.30) + (((100 * 1.5) + (100 * 1.5) * 0.30) * 0.30);
        } else if (grade.equals("4")) {
            fee = (((100 * 1.5) + (100 * 1.5) * 0.30) + (((100 * 1.5) + (100 * 1.5) * 0.30) * 0.30)) + (((100 * 1.5) + (100 * 1.5) * 0.30) + (((100 * 1.5) + (100 * 1.5) * 0.30) * 0.30)) * 0.30;
        }else if(grade.equals("5")){
            fee=(((100 * 1.5) + (100 * 1.5) * 0.30) + (((100 * 1.5) + (100 * 1.5) * 0.30) * 0.30)) + (((100 * 1.5) + (100 * 1.5) * 0.30) + (((100 * 1.5) + (100 * 1.5) * 0.30) * 0.30)) * 0.30;
            fee= fee+fee*0.30;
        }
        return Double.valueOf(decimalFormat.format(fee));
    }

    public static void main(String[] args) {
        temp temp= new temp();
        System.out.println(temp.testing2());

    }
}
