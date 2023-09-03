package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public void pay(Basket basket, int money) {
        int price = 0;

        ArrayList<Food> foodList = basket.getFoods();

        for (Food f : foodList) {
            price += Integer.parseInt(f.getPrice());
        }


        if (price > money) {
            logger.warn("계산 실패");
            throw new IllegalArgumentException("소지금이 부족합니다.");
        } else {
            money -= price;
            logger.info("물건 가격 ");
            System.out.printf("총 가격은 %d원 입니다.%n고객님 결제 후 잔액 : %d  ", price, money);
        }


    }

}
