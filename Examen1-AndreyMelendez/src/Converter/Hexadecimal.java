package Converter;

public class Hexadecimal implements ConvertInterface {
    @Override
    public String fromDecimal(int pNumber) {
        return Integer.toHexString(pNumber);
    }

    @Override
    public int toDecimal(String pNumber) {
        return Integer.parseInt(pNumber,16);

    }
}
