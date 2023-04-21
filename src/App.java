import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

            HashMap <String,Integer> box = new HashMap<>();
            box.put("blue",2);
            box.put("green",6);
            box.put("yellow",5);
            int maxVal;
            int ballsRemoved = 0;

            ArrayList<Integer> values = new ArrayList<>();

            for(int value : box.values()) {
                values.add(value);
            }
            maxVal = values.get(0);

            for(int i = 1; i < values.size(); i++) {
                if(maxVal < values.get(i)) {
                    maxVal = values.get(i);
                }
            }
            

            values.remove(Integer.valueOf(maxVal));
            for(int i = 0; i < values.size(); i++) {
                ballsRemoved += values.get(i);
            }

            System.out.println("Balls removed to get one color: " + ballsRemoved);   
    }
}