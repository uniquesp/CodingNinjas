import java.util.PriorityQueue;

public class InbuiltPriorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr[]={9,1,0,4,7,3};
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}
