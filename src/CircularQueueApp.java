import java.util.Scanner;
public class CircularQueueApp {
	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        System.out.print("Enetr Circular Queue Length :");
	        int len=scan.nextInt();
	        CircularQueue circularQueue=new CircularQueue(len);
	        while(true){
	            System.out.println("Enetr 1 for insert");
	            System.out.println("Enter 2 for delete");
	            System.out.println("Enter 3 for display");
	            System.out.println("Enter another any number to Exit");
	            System.out.println("Enter your choice");
	            int choice=scan.nextInt();
	            switch(choice){
	                case 1:
	                   circularQueue.insert();
	                   break;
	                case 2:
	                   circularQueue.delete();
	                   break;
	                case 3:
	                   circularQueue.display();
	                   break;
	                default:
	                   System.exit(0);
	            }
	        }
	    }
}
