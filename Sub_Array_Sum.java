//Given one Array find out sub array form given array which ElementSum is equl to given Number.

public class Sub_Array_Sum{
public static void main(String args[]){
int arr[]={2,3,5,6,8,10};
int Target=18;
int start=0;
int end=0;
int sum=0;
while(end<arr.length){
  sum=sum+arr[end];
  if(sum==Target){
          System.out.println("Start index is:"+start+"End index is:"+end);
return;
       }

while(sum>Target && start<=end){
   sum=sum-arr[start];
start++;
    if(sum==Target){
      System.out.println("Start index is:"+start+"End index is:"+end);
return;
     }
  
}
end++;
}

}
}


