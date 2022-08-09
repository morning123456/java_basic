package yut;
import java.util.Arrays;
   
public class Computer {

	int comTotal = 0;
	int [] count =new int [4];
	int comsum = 0;
	void complay() {
		
		do {comsum = 0;
		for(int i=0; i<4; i++) {
			count[i]=(int)(Math.random()*2);
			comsum+=count[i];
		} 		
		comTotal+=comsum;
		System.out.println(); 	
		System.out.println("------- computer 1 -------");
		System.out.println(Arrays.toString(count));
		
		if(comsum==0) {comTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}			
		if(comsum==1) {System.out.println("[도] 나왔습니다.");}
		if(comsum==2) {System.out.println("[개] 나왔습니다.");}
		if(comsum==3) {System.out.println("[걸] 나왔습니다.");}
		if(comsum==4) {comTotal+=1;System.out.println("!!![모]!!!입니다. 한번더~!");}
		System.out.println("현재 위치는 "+ comTotal +"입니다.");
		
		}while(comsum==0||comsum==4);
			
		if(comTotal>=20) {
			System.out.println("****** 컴퓨터 Win~! ******");
			System.exit(0);			
		}		
	}		
}

 class Computer2 extends Computer{

	
	void complay2() {
		
		do {comsum = 0;
		for(int i=0; i<4; i++) {
			count[i]=(int)(Math.random()*2);
			comsum+=count[i];
		} 
		
		comTotal+=comsum;
		System.out.println(); 	
		System.out.println("------- computer 2 -------");
		System.out.println(Arrays.toString(count));
		
		if(comsum==0) {comTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}			
		if(comsum==1) {System.out.println("[도] 나왔습니다.");}
		if(comsum==2) {System.out.println("[개] 나왔습니다.");}
		if(comsum==3) {System.out.println("[걸] 나왔습니다.");}
		if(comsum==4) {comTotal+=1;System.out.println("!!![모]!!!입니다. 한번더~!");}
		System.out.println("현재 위치는 "+ comTotal +"입니다.");
		
		}while(comsum==0||comsum==4);
		
	
		if(comTotal>=20) {
			System.out.println("****** 컴퓨터 Win~! ******");
			System.exit(0);			
		}		
	}		
}
  
 class Computer3 extends Computer{

		
		
		void complay3() {
			
			do {comsum = 0;
			for(int i=0; i<4; i++) {
				count[i]=(int)(Math.random()*2);
				comsum+=count[i];
			} 
			
			comTotal+=comsum;
			System.out.println(); 	
			System.out.println("------- computer 3 -------");
			System.out.println(Arrays.toString(count));
			
			if(comsum==0) {comTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}				
			if(comsum==1) {System.out.println("[도] 나왔습니다.");}
			if(comsum==2) {System.out.println("[개] 나왔습니다.");}
			if(comsum==3) {System.out.println("[걸] 나왔습니다.");}
			if(comsum==4) {comTotal+=1;System.out.println("!!![모]!!!입니다. 한번더~!");}
			System.out.println("현재 위치는 "+ comTotal +"입니다.");
			
			}while(comsum==0||comsum==4);
					
			if(comTotal>=20) {
				System.out.println("****** 컴퓨터 Win~! ******");
				System.exit(0);				
			}			
		}			
	}

 class Computer4 extends Computer{

		void complay4() {
			
			do {comsum = 0;
			for(int i=0; i<4; i++) {
				count[i]=(int)(Math.random()*2);
				comsum+=count[i];
			} 
			
			comTotal+=comsum;
			System.out.println(); 	
			System.out.println("------- computer 4 -------");
			System.out.println(Arrays.toString(count));
			
			if(comsum==0) {comTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}				
			if(comsum==1) {System.out.println("[도] 나왔습니다.");}
			if(comsum==2) {System.out.println("[개] 나왔습니다.");}
			if(comsum==3) {System.out.println("[걸] 나왔습니다.");}
			if(comsum==4) {comTotal+=1;System.out.println("!!![모]!!!입니다. 한번더~!");}
			System.out.println("현재 위치는 "+ comTotal +"입니다.");
			
			}while(comsum==0||comsum==4);
					
			if(comTotal>=20) {
				System.out.println("****** 컴퓨터 Win~! ******");
				System.exit(0);				
			}			
		}			
	}