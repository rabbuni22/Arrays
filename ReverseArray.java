public class ReverseArray{
public static void main(String args[]){

//Array declaration
int arr[]={2,5,61,7,8,9,22,44};
System.out.println("Before sorting array: ");
for(int a:arr){

System.out.print(a+" ");
}
int i=0;
int j=arr.length-1;
int temp=0;
while(i<j){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;

}
System.out.println();

System.out.println("After sorting array: ");

for(int b:arr){
System.out.print(b+" ");
}






}
}
