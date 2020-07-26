package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(10);
		Scanner sc = new Scanner(System.in);
		System.out.println("\tElements\nAdd\nFetch\nDelete");
		String ip;
		for(int i = 0;; ++i) {
			
			ip = sc.nextLine();
			if(ip.equals("exit") == true)
				 break;
			switch(ip) {
			case "Add" : list.add(sc.nextInt());
					  sc.nextLine();break;
			case "Fetch" : try{
						int x = list.get(sc.nextInt());
						System.out.println("Fetched ELEMENT:"+x);
						sc.nextLine(); 
						
						}
						catch(Exception e) {
							System.out.println("No such element is present");
							
						}	
						break;
			case "Delete": try{
						int x = list.remove(sc.nextInt());
						System.out.println("Removed ELEMENT:"+x);
						sc.nextLine(); 
				
						}
						catch(Exception e) {
							System.out.println("No such element is there to remove");
					
						}	
						break;
			default: System.out.println("INVALID");break;
			}
		}
		
		System.out.println("Printing Elements:");
		
		for(int i : list) System.out.println(i);
		sc.close();
	}

}
