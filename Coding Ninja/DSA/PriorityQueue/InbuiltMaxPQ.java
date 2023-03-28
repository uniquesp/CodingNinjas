import java.util.Comparator;
import java.util.PriorityQueue;

class MaxPQComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
            return 1;
        }
        else if(o1>o2){
            return -1;
        }
            return 0;
    }
}

class MinPQComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2){
            return -1;
        }
        else if(o1>o2){
            return 1;
        }
            return 0;
    }
}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        if(o1.length()<o2.length()){
            return -1;
        }
        else if(o1.length()>o2.length()){
            return 1;
        }
        return 0;
    }
 }

public class InbuiltMaxPQ{
public static void main(String[] args) {
   MinPQComparator minPQComparator = new MinPQComparator();
    PriorityQueue<Integer> pq = new PriorityQueue<>(minPQComparator);

    // MaxPQComparator maxPQComparator = new MaxPQComparator();
    // PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQComparator);
    int arr[] = {9,1,0,4,7,3};
    for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
    }

    while(!pq.isEmpty()){
        System.out.print(pq.remove()+" ");
    }
        System.out.println();

    StringLengthComparator stringLengthComparator = new StringLengthComparator();
    PriorityQueue<String> st  = new PriorityQueue<>(stringLengthComparator);
    String arr1[] = {"this","an","the","queues","there"};
    for(int i=0;i<arr1.length;i++){
        st.add(arr1[i]);
    }
        while(!st.isEmpty()){
        System.out.print(st.remove()+" ");
    }

}

}