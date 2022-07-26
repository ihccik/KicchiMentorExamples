package interview_tasks.string_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S20_String_ReturnDuplicatedChars {

    /*
        create method return duplicated unique value

        EXAMPLE:
        input: inteerrrviiew
        output:  ier
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution1("inteerrrviiew"));
        System.out.println(defaultSolution2("inteerrrviiew"));
    }

    public static String defaultSolution1(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency >1 && !result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String defaultSolution2(String str){
        List<String> list = new ArrayList<>();
        String[] arr = str.split("");
        Arrays.stream(arr).distinct().forEach( a -> {  if( Arrays.stream(arr).filter(b -> b.equals(a)).count()>1){ list.add(a);}} );
        return list.toString();
    }
}
