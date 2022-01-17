package yehor_zharavin.project;

public interface EightBitCipherInterface {
    public String encode(String text, byte code);
    public String decode(String encodedText, byte code);
}
