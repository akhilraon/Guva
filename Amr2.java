import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Amr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={2,3,4,2,3};
ArrayList<Integer> num=new ArrayList<Integer>();
num.add(2);
num.add(3);
num.add(4);
num.add(2);
num.add(3);
int large=Collections.max(num);
int index=num.indexOf(large);
Collections.sort(num,Collections.reverseOrder());
int diff=num.get(0)-num.get(num.size()-1);
System.out.println("Largest element is "+large+" in index "+index+" with difference "+diff);



	}

}
