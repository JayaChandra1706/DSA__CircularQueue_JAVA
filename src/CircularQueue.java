import java.util.Scanner;
public class CircularQueue {
	private int cq[];
	private int size;
	private int f=0;
	private int r=-1;
	private int count=0;
	private Scanner scan=new Scanner(System.in);
	public CircularQueue(int len){
		cq=new int[len];
		size=cq.length;
	}
	public void insert(){
		if(count==size){
			System.out.println("Insertion is not Posiible because Queue is FULL");
		}else{
			System.out.print("Enter Element to insert :");
			int ele=scan.nextInt();
			System.out.println();
			r=(r+1)%size;
			cq[r]=ele;
			count++;
			System.out.println("Insertion is Successful");
		}
	}
	public void delete(){
		if(count==0){
			System.out.println("Deletion not Possible because Queue is Empty");
		}else{
			System.out.println("Deleted Element is "+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display(){
		int f1=f;
		if(count==0){
			System.out.println("No Elements to Display");
		}else{
			for(int i=1;i<=count;i++){
				System.out.println(cq[f1]);
				f1=(f1+1)%size;
			}
		}
	}
}
