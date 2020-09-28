package labsheet1;
import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {
        String text="", shortest="";
        int i=0, lowerVowels=0, words=0, charCount=0, edCount=0, totalWords=0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter a piece of text " + (i+1) + ": ");
            text=input.nextLine();

            for(int j=0; j<text.length(); j++)
            {
                char ch = text.charAt(j);

                if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
                    lowerVowels++;

                if(ch==' ') {
                    words++;
                    totalWords++;
                }

                if(text.charAt(j)!=' ' || text.charAt(j)==' ')
                    charCount++;

                if(text.charAt(j)=='e' && text.charAt(j+1)=='d')
                    edCount++;

                if(i==0)
                    shortest=text;
                else
                    if(text.length()<shortest.length())
                        shortest=text;


            }

            System.out.println("\n\n\t\t********Text Data********\n\nNumber of characters: " + charCount +"\nNumber of lowercase vowels: " + lowerVowels
                             +"\nNumber of words: " + (words+1) + "\nNumber of times 'ed' appears in the text: " + edCount + "\n\n");

            i++;
            words=0;
            lowerVowels=0;
            charCount=0;
            edCount=0;

        }while(i<3);

        System.out.println("\n\n\n\t\t*******Overall Results*******\n\nShortest piece of text: " + shortest + "\nAverage number of words: " + (totalWords+3)/3);
    }
}
