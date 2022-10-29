package org.example;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        ArrayList<Double> niz = new ArrayList<Double>();
        for(;;) {
            if (unos.hasNextDouble())
                niz.add(unos.nextDouble());
            else if (unos.next().equalsIgnoreCase("stop"))
                break;
        }
        Double suma=Double.valueOf(0), standDev=Double.valueOf(0);
        Double min=niz.get(0), max=niz.get(0);
        for(int i=1; i<niz.size(); i++){
            if(niz.get(0)<min)
                min=niz.get(0);
            if(niz.get(0)>max)
                max=niz.get(0);
        }
        for(Double x:niz) {
            suma = suma + x;
        }
        Double sr_vr=suma/niz.size();
        for(Double x:niz)
            standDev=standDev+Math.pow(x-sr_vr,2);
        standDev=Math.sqrt(standDev/(niz.size()-1));


    }
}