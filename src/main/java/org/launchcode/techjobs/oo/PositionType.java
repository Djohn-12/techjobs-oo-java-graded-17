package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return getValue();
    }
}