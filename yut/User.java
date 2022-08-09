package yut;

import java.util.Arrays;

public class User {
	
	int userTotal = 0;  
	int [] count =new int [4];
	int sum = 0;
	void userplay() {			
		
		do {sum = 0;
	for(int i=0; i<4; i++) {
		count[i]=(int)(Math.random()*2);		 
		sum+=count[i];		
	}
	userTotal+=sum;
	System.out.println();
	System.out.println("--------- user 1 ---------");
	System.out.println(Arrays.toString(count));
	
	if(sum==0) {userTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}		
	if(sum==1) {System.out.println("[도] 나왔습니다.");}
	if(sum==2) {System.out.println("[개] 나왔습니다.");}
	if(sum==3) {System.out.println("[걸] 나왔습니다.");}
	if(sum==4) {userTotal+=1; System.out.println("!!![모]!!!입니다. 한번더~!");}
			
	System.out.println("현재 위치는 "+ userTotal +"입니다.");
		}while(sum==0||sum==4);
		
		if(userTotal>=20) {
			System.out.println("****** 유저 Win~! ******");
			System.exit(0);			
		}
	}	
}

  class User2 extends User {
	
	void userplay2() {			
		
		do {sum = 0;
	for(int i=0; i<4; i++) {
		count[i]=(int)(Math.random()*2);		 
		sum+=count[i];		
	}
	userTotal+=sum;
	System.out.println();
	System.out.println("--------- user 2 ---------");
	System.out.println(Arrays.toString(count));
	
	if(sum==0) {userTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}		
	if(sum==1) {System.out.println("[도] 나왔습니다.");}
	if(sum==2) {System.out.println("[개] 나왔습니다.");}
	if(sum==3) {System.out.println("[걸] 나왔습니다.");}
	if(sum==4) {userTotal+=1; System.out.println("!!![모]!!!입니다. 한번더~!");}
	System.out.println("현재 위치는 "+ userTotal +"입니다.");
		}while(sum==0||sum==4);
		
		if(userTotal>=20) {
			System.out.println("****** 유저 Win~! ******");
			System.exit(0);			
		}
	}	
}  
    class User3 extends User{
		void userplay3() {
							
			do {sum = 0;
		for(int i=0; i<4; i++) {
			count[i]=(int)(Math.random()*2);		 
			sum+=count[i];		
		}
		userTotal+=sum;
		System.out.println();
		System.out.println("--------- user 3 ---------");
		System.out.println(Arrays.toString(count));
		
		if(sum==0) {userTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}			
		if(sum==1) {System.out.println("[도] 나왔습니다.");}
		if(sum==2) {System.out.println("[개] 나왔습니다.");}
		if(sum==3) {System.out.println("[걸] 나왔습니다.");}
		if(sum==4) {userTotal+=1; System.out.println("!!![모]!!!입니다. 한번더~!");}
						
		System.out.println("현재 위치는 "+ userTotal +"입니다.");
			}while(sum==0||sum==4);
			
			if(userTotal>=20) {
				System.out.println("****** 유저 Win~! ******");
				System.exit(0);				
			}
		}		
	}     
     class User4 extends User{
    	
    	void userplay4() {    			
    	
    		do {sum = 0;
    	for(int i=0; i<4; i++) {
    		count[i]=(int)(Math.random()*2);		 
    		sum+=count[i];		
    	}
    	userTotal+=sum;
    	System.out.println();
    	System.out.println("--------- user 4 ---------");
    	System.out.println(Arrays.toString(count));
    	
    	if(sum==0) {userTotal+=4; System.out.println("!!![윷]!!!입니다. 한번더~!");}    		
    	if(sum==1) {System.out.println("[도] 나왔습니다.");}
    	if(sum==2) {System.out.println("[개] 나왔습니다.");}
    	if(sum==3) {System.out.println("[걸] 나왔습니다.");}
    	if(sum==4) {userTotal+=1; System.out.println("!!![모]!!!입니다. 한번더~!");}
    	System.out.println("현재 위치는 "+ userTotal +"입니다.");
    		}while(sum==0||sum==4);
    		
    		if(userTotal>=20) {
    			System.out.println("****** 유저 Win~! ******");
    			System.exit(0);   			
    		}
    	}    	
    }   