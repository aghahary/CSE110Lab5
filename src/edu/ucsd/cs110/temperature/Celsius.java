package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature returnTemp = new Fahrenheit(((this.getValue()*9)/5) + 32);
        return returnTemp;
    }

    public String toString()
    {
        String toReturn = this.getValue() + " C";
        return toReturn;
    }
}