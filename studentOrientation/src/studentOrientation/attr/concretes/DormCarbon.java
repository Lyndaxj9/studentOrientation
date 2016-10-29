package studentOrientation.attr.concretes;

import studentOrientation.attr.CarbonFPI;

public class DormCarbon implements CarbonFPI {
    //standline
    private double carbon = .000034;
    //game
    private double modifier = carbon * .8;

    public double getValue() {
        return carbon;
    }

    public double getModify() {
        return modifier;
    }
}
