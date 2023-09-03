package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodStand {
    private static final Logger logger = LoggerFactory.getLogger(FoodStand.class);
    private final ArrayList<Food> foods = new ArrayList<>();

    // TODO add 메서드 구현
    public void add(Food food) {
        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }


    // TODO 장바구니에 담은 Food 삭제 구현
    public void removeFood(Food food) {

        for (Food f : foods) {
            if (f.equals(food)) {
                foods.remove(f);
                return;
            }
        }
        try {
            logger.warn("장바구니에 없는 상품 제거 시도");
            throw new ClassNotFoundException("장바구니에 없는 상품입니다.");

        } catch (ClassNotFoundException e) {
            logger.trace("에러 설명");
            System.out.println(e.getMessage());
        }
    }

}
