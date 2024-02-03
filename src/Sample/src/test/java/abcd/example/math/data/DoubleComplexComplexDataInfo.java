package abcd.example.math.data;

import abcd.example.math.Complex;

public class DoubleComplexComplexDataInfo {
    public double input1;
    public Complex input2;
    public Complex expected;

    public DoubleComplexComplexDataInfo(double input1, Complex input2, Complex expected)
    {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }
}
