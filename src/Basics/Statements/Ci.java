package Basics.Statements;

import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class Ci {
    int p = 5000;
    float r= 5;
    float t= 5;

    double TotalAmount= p*Math.pow(1+(r/100),t);
    double interest = TotalAmount-p;

}

