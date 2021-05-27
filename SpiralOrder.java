import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        list.add(new ArrayList<Integer>(List.of(1, 2)));
        list.add(new ArrayList<Integer>(List.of(3, 4)));
        list.add(new ArrayList<Integer>(List.of(5, 6)));

        System.out.println(spiralOrder(list));
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int m = A.size();
        int n = m == 0 ? 0 : A.get(0).size() -1;

        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n;
        int dir = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){
            if(dir == 0){

                for(int i=left ; i <= right; i++){
//                    System.out.println("i : " + i + " ---> right :" + right) ;

                    list.add(A.get(top).get(i));
                }
                top++;
                dir++;
            }
            else if(dir == 1){
                for(int i=top ;  i <= bottom; i++){
                       list.add(A.get(i).get(right));
                }
                right--;
                dir++;
            }
            else if(dir == 2){
                for(int i=right ; i >= left; i--){
                    list.add(A.get(bottom).get(i));
                }
                bottom--;
                dir++;
            }
            else if(dir == 3){
                for(int i=bottom ; i >= top; i--){
                    list.add(A.get(i).get(left));
                }
                left++;
                dir = 0;
            }
        }
        return list;
    }

}
