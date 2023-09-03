package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);
    private static int money = 20_000;

    public static int getMoney() {
        return money;
    }

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }

    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        ArrayList<Food> foodList = foodStand.getFoods();
        ArrayList<BuyList.Item> itemList = buyList.getItems();
        for (BuyList.Item item : itemList) {
            Food food = new Food(item.getName());
            if (foodList.contains(food)) {
                for (int i = 0; i < item.getAmount(); i++) {
                    basket.add(food);
                }
            } else {
                logger.warn("매대에 없는 상품 구매 시도함!");
                throw new IllegalArgumentException("상품이 존재하지 않습니다");

            }


        }

    }


    // TODO payTox 메서드 구현


    public void payTox(Counter counter) {
        logger.trace("메서드 카운터에 넘겨줌 pay({},{}) ", basket, money);
        counter.pay(basket, money);
    }

}
