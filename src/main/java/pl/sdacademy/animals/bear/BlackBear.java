package pl.sdacademy.animals.bear;

import pl.sdacademy.clock.Clock;

import java.time.LocalDate;

public class BlackBear extends Bear {
    public BlackBear(double weight, Clock clock) {
        super(weight, clock);
    }

    @Override
    boolean isHibernating() {
        return false;
    }


    public BlackBear(double weight) {
        super(weight);
    }

}