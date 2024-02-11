import org.jetbrains.annotations.Contract;

public class UserDefinedMethods {
    public static void main(String[] args) {
        char [] characters = {'A','A','B','C','D','D','D'};
        System.out.println(countOfCharacters(characters,'D'));

    }
    @Contract(pure = true)
    public static int countOfCharacters (char [] letters, char searchLetter){
        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) count++;
        }
        return count;
    }
}
