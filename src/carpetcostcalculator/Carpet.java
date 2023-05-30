package carpetcostcalculator;

public class Carpet {
    double cost;

    public Carpet() {
        cost = 0;
    }

    public  Carpet(double cost) {

        if ( cost<0);
        this.cost= cost;
    }

public double getCost(){
    return cost;
}
}

