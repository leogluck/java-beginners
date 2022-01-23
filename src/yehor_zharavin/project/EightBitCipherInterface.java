package yehor_zharavin.project;

public interface EightBitCipherInterface {
    public String encode(String text, char code);
    public String decode(String encodedText, char code);
}
