
//WAP to sorting string without using string Methods?.
public class SecondQuestion
{
    public static void main(String[] args) {
        String str = "saurabh";
        char charArray[] = new char[str.length()];
        str = str.toLowerCase();
        int index = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    charArray[index++] = (char) i;
                }
            }
        }

        System.out.println(charArray);
    }
}
