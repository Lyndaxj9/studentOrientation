package studentOrientation.attr.concretes;

import studentOrientation.attr.CarbonFPI;

public class RegCarbon implements CarbonFPI {
    //forms
    private double carbon = .000044;
    //complab
    private double modifier = carbon * .75;

    public double getValue() {
        return carbon;
    }

    public double getModify() {
        return modifier;
    }
}
