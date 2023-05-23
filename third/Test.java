import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" enter a sentence(any english sentence)");
        String sentence=input.nextLine();
        System.out.println("enter a letter(any letter from A to Z)");
        String letter=input.nextLine();
        int index= sentence.indexOf(letter);
        if(index== -1){
            System.out.println(" the letter does not exist in the sentence");
        }else{
            System.out.println(sentence.substring(index+1));
        }
    }
}