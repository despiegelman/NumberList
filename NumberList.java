import java.util.*;
public class NumberList{
    public static void main(String[]args){
        ArrayList<Integer> multiplesOf3 = new ArrayList<>();
        for (int i = 0; i<300; i+=3){
            multiplesOf3.add(i);
        }
        for (int multiple : multiplesOf3){
            System.out.print(multiple + ", ");
        }
        for (int n = multiplesOf3.size()-1; n >= 0; n--){
            if (multiplesOf3.get(n)%2 == 0){
                multiplesOf3.remove(n);
            }
        }
        System.out.print("\n\n");
        for (int multiple : multiplesOf3){
            System.out.print(multiple + ", ");
        }
    }
}