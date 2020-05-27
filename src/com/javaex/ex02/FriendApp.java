package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구 3명을 등록해 주세요");

    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	//친구 정보 입력받고 fList에 넣기
    	for(int i = 0; i<3; i++) {
	    	String fInfo = sc.nextLine();
	    	String[] splitInfo = fInfo.split(" ");
	    	Friend friend = new Friend(splitInfo[0],splitInfo[1],splitInfo[2]);
	    	fList.add(friend);
    	}
    	
    	for(Friend ff: fList) {
    		ff.showInfo();
    	}

    	
    			
    			
    	sc.close();
    }

}



