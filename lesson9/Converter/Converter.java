package lesson9.Converter;

public class Converter
{
    public int convertToInt (byte byte1)
    { return byte1;}
    public int convertToInt (short short1)
    {return short1;}
    public int convertToInt2(int int1)
    {return int1;}
    public int convertToInt(long long1)
    {return (int) long1;}
    public int convertToInt3(char char1)
    {return char1;}
    public int convertToInt(float float1)
    {return (int) float1;}
    public int convertToInt(double double1)
    {return (int) double1;}
    public int convertToInt1 (String string1)
    {return Integer.parseInt(string1);}
}