import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchWord {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/Users/preet/IdeaProjects/Oslash/oslash.txt");
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        System.out.println("enter word to be searched");
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //
        int count = 0;
        while ((s = br.readLine()) != null) {
            words = s.split(" ");
            for (String word : words) {
                if (word.equals(input)) {

                    count++;
                    String res = Arrays.toString(words);
                    String[] a;
                    String[] b;
                    a = res.split("\\.");

                    String q=(res.replace(",","").replace("[","").replace("]",""));
                    //System.out.println(Arrays.toString(a));
                    String[] c=q.split("\\.");
                    for (int i=0;i<c.length;i++) {
                        if (c[i].contains(input)) {
                            System.out.println("The paragraph is ");
                            System.out.println(c[i]+"\n");
                        }
                    }
//                    System.out.println(q);
//                    System.out.println("\n");

                }
                }
            }
            if (count != 0) {
                System.out.println("The given word is present " + count + " times in the file");
            } else {
                System.out.println("The given word is not present in the file");
            }

            fr.close();
        }


    }

