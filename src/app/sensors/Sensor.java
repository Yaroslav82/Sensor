package app.sensors;

import app.entities.Substance;

public abstract class Sensor {

    protected Substance substance;

    public abstract void update();
}
