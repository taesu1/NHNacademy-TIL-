package com.nhnacademy.mart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Food {
    private static final Logger logger = LoggerFactory.getLogger(Food.class);
    private final String name;
    private final int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Food(String name) {
        switch (name) {
            case "양파":
                this.name = name;
                this.price = 1_000;
                break;
            case "계란":
                this.name = name;
                this.price = 5_000;
                break;
            case "파":
                this.name = name;
                this.price = 500;
                break;
            case "사과":
                this.name = name;
                this.price = 2_000;
                break;
            default:
                logger.warn("존재하지 않는 상품 추가 시도");
                throw new IllegalArgumentException("없는 상품 입니다.");
        }
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return Integer.toString(price);
    }


    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Food) {
            Food food = (Food) obj;
            return this.getName().equals(food.getName());
        } else if (obj instanceof BuyList.Item) {
            BuyList.Item item = (BuyList.Item) obj;
            return this.getName().equals(item.getName());
        } else {
            return false;
        }
    }
}
