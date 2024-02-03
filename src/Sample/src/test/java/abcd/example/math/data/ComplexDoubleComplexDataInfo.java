package abcd.example.math.data;

import abcd.example.math.Complex;

public class ComplexDoubleComplexDataInfo {
    public Complex input1;
    public double input2;
    public Complex expected;

    public ComplexDoubleComplexDataInfo(Complex input1, double input2, Complex expected)
    {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }
}
