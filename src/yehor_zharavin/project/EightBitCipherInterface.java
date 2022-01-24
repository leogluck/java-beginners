package yehor_zharavin.project;

public interface EightBitCipherInterface {
    String encode(String text, char code);
    String decode(String encodedText, char code);
}
