import java.nio.Buffer;
import java.util.Arrays;

public class MainMethod {

    public static void main(String[] args) {
        int arrayList[] = {2000,2350,2600,2130,2190};

        // 1. In Feb, how many dollars you spent extra compare to January?

        int answer1=arrayList[1]-arrayList[0];
        System.out.println("In Feb,"+answer1+" dollars i spent extra compare to January");

        // 2. Find out your total expense in first quarter (first three months) of the year.

        int total_expense_for_first_quater = arrayList[0]+arrayList[1]+arrayList[2];
        System.out.println("Total expense in first quarter of the year is "+total_expense_for_first_quater);

        // 3. Find out if you spent exactly 2000 dollars in any month
        
        for (int i=0; i<=arrayList.length; i++){
            if(arrayList[i]==2000)
            {
                System.out.println("Spent exactly 2000 dollars");
                break;
            }
            else{
              System.out.println("Not Spent exactly 2000 dollars");  
            }
        }

        // 4. June month just finished and your expense is 1980 dollar. Add this item to our monthly expense list

        arrayList=addElement(arrayList, 1990);
        System.out.println(arrayList[5]);

        // # 5. You returned an item that you bought in a month of April and got a refund of 200$. Make a correction to your monthly expense list based on this

        int answer5= arrayList[3]-200 ;
        System.out.println(answer5);


        





        
    }
    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}