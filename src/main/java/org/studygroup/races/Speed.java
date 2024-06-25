package org.studygroup.races;

public enum Speed {
    DEFAULT(9), SLOW(7.5);

    private double speed;

    Speed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
