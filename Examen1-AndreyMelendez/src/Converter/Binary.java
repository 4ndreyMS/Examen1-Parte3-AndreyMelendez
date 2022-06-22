package Converter;

public class Binary implements ConvertInterface{
    @Override
    public String fromDecimal(int pNumber) {
        return Integer.toBinaryString(pNumber);
    }

    @Override
    public int toDecimal(String pNumber) {
        return Integer.parseInt(pNumber,2);
    }
}
