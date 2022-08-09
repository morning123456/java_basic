package yut;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

  
public class yut {

	public static void main(String[] args) {
		
		System.out.println("--------------------< 윷놀이 게임 >-----------------------"

			+ "\n- 도착지점(20번)에 유저 와 컴퓨터 중 누가 더 빨리 도착하는지 대결\n"
			+ "- 도:1칸, 개:2칸, 걸:3칸, 윷:4칸 모:5칸 움직인다.\n"
			+ "- 랜덤으로 윷을 던진다. \n"
			+ "- ex) [1,1,1,0] -> 걸, [1,1,1,1] -> 모\n"
			+ "- 윷,모가 나오면 자동으로 한번 더 실행!\n"
			+ "- 유저,컴퓨터 말은 각각 총 4개\n"
			+ "- 컴퓨터는 랜덤으로 말을 움직인다.\n"
			+ "- 상대 방 말을 잡으면 한번 더 실행!\n"
			+ "- 잡힌 상대방의 말은 1번 부터 다시 시작한다.");

	System.out.println("====================< 게임시작 >======================");
	
	
	User user = new User();
	User2 user2 = new User2();
	User3 user3 = new User3();
	User4 user4 = new User4();
	Computer com = new Computer();
	Computer2 com2 = new Computer2(); 
	Computer3 com3 = new Computer3(); 
	Computer4 com4 = new Computer4(); 
	Scanner sc = new Scanner(System.in);
	
	
	int player=0;
	while(player==0) {
	System.out.println();
		System.out.print("선공 결정 : 1.가위 2.바위 3.보 : ");
	 player = sc.nextInt()-1;   

	int computer=0;
	int calculate = (player-computer+3)%3;	

	System.out.print("user : "+ player);
	System.out.print(" / computer : "+computer);
	switch(calculate) {
	case 0 : System.out.println (" =>> 동점입니다. 다시 숫자를 입력해주세요"); break;				
	case 1 : System.out.println (" =>> 컴퓨터가 이겼습니다. 컴퓨터 먼저 시작하겠습니다.");		
	         System.out.println(); com.complay();   break;	                           
	case 2 : System.out.println(" =>> 유저가 이겼습니다. 유저 먼저 시작하겠습니다."); break; 
	}} ; 	
	while (true) {
		System.out.println();
		System.out.print("어떤 말을 움직일까요? <  1번 말   2번 말   3번 말   4번 말   9. 모든 말 위치 정보  0.종료 > ");
			
		int input = sc.nextInt();
	
		
		switch (input) {		
		case 1:
			user.userplay();
			if (user.userTotal ==com.comTotal) { 					 
				System.out.println("***** 컴퓨터의 1번 말을 잡았습니다. *****\n*****한번더~!*****");
				com.comTotal = 0; user.userplay(); }							
		
		    if (user.userTotal ==com2.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 2번 말을 잡았습니다. *****\n*****한번더~!*****");
			     com2.comTotal = 0; user.userplay(); }			     
		    
		    if (user.userTotal ==com3.comTotal) { 					 
			    System.out.println("***** 컴퓨터의 3번 말을 잡았습니다. *****\n*****한번더~!*****");
			    com3.comTotal = 0;  user.userplay(); }
			    		    
		    if (user.userTotal ==com4.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 4번 말을 잡았습니다. *****\n*****한번더~!*****");
			      com4.comTotal = 0; user.userplay(); }
			break;
						
		case 2:
			user2.userplay2();
			if (user2.userTotal ==com.comTotal) { 					 
				System.out.println("***** 컴퓨터의 1번 말을 잡았습니다. *****\n*****한번더~!*****");
				com.comTotal = 0; user2.userplay2(); }
									
		    if (user2.userTotal ==com2.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 2번 말을 잡았습니다. *****\n*****한번더~!*****");
			     com2.comTotal = 0; user2.userplay2();  }
			     		   
		    if (user2.userTotal ==com3.comTotal) { 					 
			    System.out.println("***** 컴퓨터의 3번 말을 잡았습니다. *****\n*****한번더~!*****");
			    com3.comTotal = 0;  user2.userplay2(); }
			    		    
		    if (user2.userTotal ==com4.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 4번 말을 잡았습니다. *****\n*****한번더~!*****");
			      com4.comTotal = 0;  user2.userplay2(); }			     	
			break;
		
		case 3:
			user3.userplay3();
			if (user3.userTotal ==com.comTotal) { 					 
				System.out.println("***** 컴퓨터의 1번 말을 잡았습니다. *****\n*****한번더~!*****");
				com.comTotal = 0; user3.userplay3(); }
		
		    if (user3.userTotal ==com2.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 2번 말을 잡았습니다. *****\n*****한번더~!*****");
			     com2.comTotal = 0; user3.userplay3(); }
			     		    
		    if (user3.userTotal ==com3.comTotal) { 					 
			    System.out.println("***** 컴퓨터의 3번 말을 잡았습니다. *****\n*****한번더~!*****");
			    com3.comTotal = 0; user3.userplay3();  }
			     		   
		    if (user3.userTotal ==com4.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 4번 말을 잡았습니다. *****\n*****한번더~!*****");
			      com4.comTotal = 0;   user3.userplay3(); }			    
			break;
		
		case 4:
			user4.userplay4();
			if (user4.userTotal ==com.comTotal) { 					 
				System.out.println("***** 컴퓨터의 1번 말을 잡았습니다. *****\n*****한번더~!*****");
				com.comTotal = 0; user4.userplay4(); }
		
		    if (user4.userTotal ==com2.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 2번 말을 잡았습니다. *****\n*****한번더~!*****");
			     com2.comTotal = 0;  user4.userplay4(); }			    
		   
		    if (user4.userTotal ==com3.comTotal) { 					 
			    System.out.println("***** 컴퓨터의 3번 말을 잡았습니다. *****\n*****한번더~!*****");
			    com3.comTotal = 0;  user4.userplay4(); }			    
		    
		    if (user4.userTotal ==com4.comTotal) { 					 
			     System.out.println("***** 컴퓨터의 4번 말을 잡았습니다. *****\n*****한번더~!*****");
			      com4.comTotal = 0; user4.userplay4(); }			
			break;		
		
		case 9: System.out.println();
			  System.out.println(" 유저 현재위치는 : 1번 : "+user.userTotal+" / 2번 : "+user2.userTotal+
				                     " / 3번 : "+user3.userTotal+" / 4번 : "+user4.userTotal);
		        System.out.println("컴퓨터 현재위치는  : 1번 : "+com.comTotal+" / 2번 : "+com2.comTotal+  
                " / 3번 : "+com3.comTotal+" / 4번 : "+com4.comTotal); break;                                                               
			
		case 0:
			System.out.println("종료되었습니다."); System.exit(0);
		}	
		
	//컴퓨터 랜덤 플레이
		
		if(input!=9) {
		try{Thread.sleep(2500);}catch(InterruptedException e) {}		 
	   int random = (int)(Math.random()*4)+1;
	   switch (random) {
	  
			   case 1: com.complay(); 
			   if (user.userTotal ==com.comTotal) { 					 
					System.out.println("*****유저의 1번 말을 잡았습니다.*****\n*****한번더~!*****");
					user.userTotal=0; com.complay(); }
			   
			   if (user2.userTotal ==com.comTotal) { 					 
					System.out.println("*****유저의 2번 말을 잡았습니다.*****\n*****한번더~!*****");
					user2.userTotal=0; com.complay(); }
			   
			   if (user3.userTotal ==com.comTotal) { 					 
					System.out.println("*****유저의 3번 말을 잡았습니다.*****\n*****한번더~!*****");
					user3.userTotal=0; com.complay(); }
			   
			   if (user4.userTotal ==com.comTotal) { 					 
					System.out.println("*****유저의 4번 말을 잡았습니다.*****\n*****한번더~!*****");
					user4.userTotal=0; com.complay(); } 
			   break;
		   
			  case 2: com2.complay2(); 
				    if (user.userTotal ==com2.comTotal) { 					 
						System.out.println("*****유저의 1번 말을 잡았습니다.*****\n*****한번더~!*****");
						user.userTotal=0; com2.complay2(); }
				   
				   if (user2.userTotal ==com2.comTotal) { 					 
						System.out.println("*****유저의 2번 말을 잡았습니다.*****\n*****한번더~!*****");
						user2.userTotal=0; com2.complay2(); }
				   
				   if (user3.userTotal ==com2.comTotal) { 					 
						System.out.println("*****유저의 3번 말을 잡았습니다.*****\n*****한번더~!*****");
						user3.userTotal=0; com2.complay2(); }
				   
				   if (user4.userTotal ==com2.comTotal) { 					 
						System.out.println("*****유저의 4번 말을 잡았습니다.*****\n*****한번더~!*****");
						user4.userTotal=0; com2.complay2(); } 
				     break;
				   
     		   case 3: com3.complay3(); 
     		   if (user.userTotal ==com3.comTotal) { 					 
					System.out.println("*****유저의 1번 말을 잡았습니다.*****\n*****한번더~!*****");
					user.userTotal=0; com3.complay3(); }
			   
			   if (user2.userTotal ==com3.comTotal) { 					 
					System.out.println("*****유저의 2번 말을 잡았습니다.*****\n*****한번더~!*****");
					user2.userTotal=0; com3.complay3(); }
			   
			   if (user3.userTotal ==com3.comTotal) { 					 
					System.out.println("*****유저의 3번 말을 잡았습니다.*****\n*****한번더~!*****");
					user3.userTotal=0; com3.complay3(); }
			   
			   if (user4.userTotal ==com3.comTotal) { 					 
					System.out.println("*****유저의 4번 말을 잡았습니다.*****\n*****한번더~!*****");
					user4.userTotal=0; com3.complay3(); } 
				     break;
				   
     		    case 4: com4.complay4(); 
     		   if (user.userTotal ==com4.comTotal) { 					 
					System.out.println("*****유저의 1번 말을 잡았습니다.*****\n*****한번더~!*****");
					user.userTotal=0; com4.complay4(); }
			   
			   if (user2.userTotal ==com4.comTotal) { 					 
					System.out.println("*****유저의 2번 말을 잡았습니다.*****\n*****한번더~!*****");
					user2.userTotal=0; com4.complay4(); }
			   
			   if (user3.userTotal ==com4.comTotal) { 					 
					System.out.println("*****유저의 3번 말을 잡았습니다.*****\n*****한번더~!*****");
					user3.userTotal=0; com4.complay4(); }
			   
			   if (user4.userTotal ==com4.comTotal) { 					 
					System.out.println("*****유저의 4번 말을 잡았습니다.*****\n*****한번더~!*****");
					user4.userTotal=0; com4.complay4(); } 
			         break;	
 			
	   } //switch 	
		} //if
		else ;
	} //while 
	 
	
		
	 }	 

	}
