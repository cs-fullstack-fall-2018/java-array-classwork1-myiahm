import java.util.ArrayList;

public class EX24 {

    public static void main(String[] args)
    {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(5);//[0]
        numberList.add(3);//[1]
        numberList.add(7);//[2]
        System.out.println(numberList.get(1));
        System.out.println(numberList.remove(2));
        System.out.println(numberList.get(1));
    }
}
