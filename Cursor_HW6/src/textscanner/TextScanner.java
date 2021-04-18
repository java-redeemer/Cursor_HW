package textscanner;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextScanner {
    private final String text;
    private final int lettersCount;
    private final int whitespacesCount;
    private final int numbersCount;
    private final int punctuationsCount;
    private final Map<Character, Integer> charactersMap;
    private final Map<String, Integer> wordsMap;
    private final String shortestWord;
    private final String longestWord;

    public TextScanner (String text) {
        this.text = text;
        this.lettersCount = computeCharacterCount ();
        this.whitespacesCount = computeWhitespaceCount ();
        this.numbersCount = computeNumberCount ();
        this.punctuationsCount = computePunctuationCount ();
        this.charactersMap = computeCharactersMap ();
        this.wordsMap = computeWordsMap ();
        this.shortestWord = computeShortestWord ();
        this.longestWord = computeLongestWord ();
    }

    public TextScanner (Path filePath) {
        this.text = readFromFile(filePath);
        this.lettersCount = computeCharacterCount ();
        this.whitespacesCount = computeWhitespaceCount ();
        this.numbersCount = computeNumberCount ();
        this.punctuationsCount = computePunctuationCount ();
        this.charactersMap = computeCharactersMap ();
        this.wordsMap = computeWordsMap ();
        this.shortestWord = computeShortestWord ();
        this.longestWord = computeLongestWord ();
    }

    public String getText() {
        return text;
    }

    public int getLettersCount () {
        return lettersCount;
    }

    public int getWhitespacesCount () {
        return whitespacesCount;
    }

    public int getNumbersCount () {
        return numbersCount;
    }

    public int getPunctuationsCount () {
        return punctuationsCount;
    }

    public Map<Character, Integer> getCharactersMap () {
        return charactersMap;
    }

    public Map<String, Integer> getWordsMap () {
        return wordsMap;
    }

    public String getShortestWord() {
        return shortestWord;
    }

    public String getLongestWord() {
        return longestWord;
    }

    private int computeCharacterCount () {
        return (int) text.chars().filter(Character::isLetter).count();
    }

    private int computeWhitespaceCount () {
        return (int) text.chars().filter(Character::isSpaceChar).count();
    }

    private int computeNumberCount () {
        return (int) text.chars().filter(Character::isDigit).count();
    }

    private int computePunctuationCount () {
        return (int) text.chars().filter(this::isPunctuation).count();
    }

    private Map<Character, Integer> computeCharactersMap () {
        return text.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(TreeMap::new, (m, k) -> m.put(k, m.containsKey(k) ? (m.get(k) + 1) : 1), TreeMap::putAll);
    }

    private Map<String, Integer> computeWordsMap () {
        String filteredString = text.toLowerCase().chars()
                .filter(c -> Character.isLetter(c) || Character.isWhitespace(c))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return Arrays.stream(filteredString.split("[ \n]"))
                .map(s -> s = s.trim())
                .filter(s -> s.length() > 3)
                .collect(TreeMap::new, (m, k) -> m.put(k, m.containsKey(k) ? (m.get(k) + 1) : 1), TreeMap::putAll);
    }

    private String computeShortestWord () {
        Map.Entry<String, Integer> shortestWordEntry = wordsMap.entrySet().stream()
                .min(Comparator.comparingInt(e -> e.getKey().length()))
                .orElseThrow(NoSuchElementException::new);
        return shortestWordEntry.getKey() + ", count:" + shortestWordEntry.getValue();
    }

    private String computeLongestWord () {
        Map.Entry<String, Integer> longestWordEntry = wordsMap.entrySet().stream()
                .max(Comparator.comparingInt(e -> e.getKey().length()))
                .orElseThrow(NoSuchElementException::new);
        return longestWordEntry.getKey() + ", count:" + longestWordEntry.getValue();
    }

    private String readFromFile(Path filePath) {
        try (InputStream inputStream = Files.newInputStream(filePath)) {
            if (inputStream.available() > 0) {
                byte[] bytes = new byte[inputStream.available()];
                int readBytesCount = inputStream.read(bytes);
                return new String(bytes, 0, readBytesCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private boolean isPunctuation(int codePoint) {
        return isPunctuation((char) codePoint);
    }

    private boolean isPunctuation(char c) {
        return List.of(',', '.', '!','?', ':', ';').contains(c);
    }

    @Override
    public String toString() {
        return  "letterCount=" + lettersCount + ';' + " spaceCount=" + whitespacesCount + ';' + " numberCount=" + numbersCount + ';' + " punctuationCount=" + punctuationsCount + ';' + " shortestWord=" + shortestWord + ';' + " longestWord=" + longestWord + '}';
    }
}

