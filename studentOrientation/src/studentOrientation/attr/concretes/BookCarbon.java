package studentOrientation.attr.concretes;

import studentOrientation.attr.CarbonFPI;

public class BookCarbon implements CarbonFPI {
    //mando
    private double carbon = .000054;
    //uni
    private double modifier = carbon * .7;

    public double getValue() {
        return carbon;
    }

    public double getModify() {
        return modifier;
    }
}
