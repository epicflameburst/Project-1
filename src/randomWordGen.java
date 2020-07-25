import java.util.Random;

public class randomWordGen {
public static void main(String[] args) {
String[] wordBank = { "one", "two", "three", "four" };
String randomWord = getRandomWord(wordBank);
System.out.println(randomWord);
}

static String getRandomWord(String[] array) {
Random random = new Random();
int index = random.nextInt(array.length);
return array[index];

}

static String getRandomWordWithLength(String[] array, int len) {
Random random = new Random();

for (int i = 0; i < 500; i++) {
int index = random.nextInt(3);
String selectedString = array[index];
if (selectedString.length() > len)
return selectedString;
}
return null;

}

}