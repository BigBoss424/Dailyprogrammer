import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterSumSolution {
    public static void main(String[] args) throws Exception 
    {
        List<String> enable1 = Files.readAllLines(Paths.get("enable1.txt"));

        System.out.println(lettersum(""));
        System.out.println(lettersum("a"));
        System.out.println(lettersum("z"));
        System.out.println(lettersum("cab"));
        System.out.println(lettersum("excellent"));
        System.out.println(lettersum("microspectrophotometries"));

        int oddCount = 0;
        HashMap<Integer,Integer> Countmap =  new HashMap<Integer, Integer>();

        for (String s : enable1) 
        {
            int sum = lettersum(s);

            //Bonus 1
            if(sum == 319){
                System.out.println("Bonus 1: " + s);
            }

            //Bonus 2
            if(sum % 2 != 0)
            {
                oddCount++;
            }

            //Bonus 3
            if(Countmap.containsKey(sum)){
                Countmap.put(sum, (int)Countmap.get(sum) + 1);
            } else {
                Countmap.put(sum, 1);
            }
        }

        //Bonus 3
        Map.Entry<Integer, Integer> max = null;
        for(Map.Entry<Integer, Integer> e : Countmap.entrySet()){
            if(max == null || e.getValue().compareTo(max.getValue()) > 0){
                max = e;
            }
        }

        System.out.println("Bonus 2: " + oddCount);
        System.out.println("Bonus 3: " + max);
    }

    public static int lettersum(String sumstr)
    {
        int sum = 0;
        for(int i=0; i<sumstr.toCharArray().length;i++){
            sum = sum + ((int)sumstr.toCharArray()[i] - 96);
        }
        return sum;
    }
}