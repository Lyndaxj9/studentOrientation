package studentOrientation.attr.concretes;

import studentOrientation.attr.CarbonFPI;

public class TourCarbon implements CarbonFPI {
    //walk
    private double carbon = .000004;
    //bus
    private double modifier = carbon * 500;

    public double getValue() {
        return carbon;
    }

    public double getModify() {
        return modifier;
    }
}
