package com.nhnacademy.mart;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요");
        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        Customer kimTaeSu = new Customer(buyList);

        // 장바구니를 챙긴다.
        kimTaeSu.bring(mart.provideBasket());

        // 식품을 담는다.
        kimTaeSu.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        kimTaeSu.payTox(mart.getCounter());
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        StringTokenizer st = new StringTokenizer(data, " ");
        BuyList buyList = new BuyList();

        while (st.hasMoreTokens()) {
            String[] str = new String[2];
            for (int i = 0; i < str.length; i++) {
                str[i] = st.nextToken();
            }
            buyList.add(str);
        }

        return buyList;
    }
}
