package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	int stock = 0;
    	
    	System.out.println("상품을 입력해주세요.(종료: q)");
    	
    	//정보 입력받고 fList에 넣기
    	while(true) {
	    	String gInfo = sc.nextLine();
	    	
	    	if(gInfo.equals("q")) {
	    		System.out.println("[입력완료]");
	    		System.out.println("=================================");
	    		break;
	    	}//if
	    	
	    	String[] splitInfo = gInfo.split(",");
	    	Goods goods = new Goods(splitInfo[0],Integer.parseInt(splitInfo[1]),Integer.parseInt(splitInfo[2]));
	    	gList.add(goods);
	    	stock += Integer.parseInt(splitInfo[2]);
    	}//while
    	
    	
    	//출력
    	for(Goods gg: gList) {
    		gg.showStock();
    	}
    	
    	
    	//총 재고 출력
    	System.out.println("모든 상품의 갯수는 "+stock+"개 입니다.");
    	
       sc.close();
    }

}
