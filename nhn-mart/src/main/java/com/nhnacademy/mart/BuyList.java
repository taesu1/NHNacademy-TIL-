package com.nhnacademy.mart;

import java.util.ArrayList;

public class BuyList {

    private final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public void add(String[] str) {
        items.add(new Item(str[0], str[1]));
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, String amount) {
            this.name = name;
            this.amount = Integer.parseInt(amount);
        }

        public String getName() {
            return name;
        }

        public int getAmount() {
            return amount;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Item) {
                Item item = (Item) obj;
                return this.getName().equals(item.getName());
            } else if (obj instanceof Food) {
                Food food = (Food) obj;
                return this.getName().equals(food.getName());
            } else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            return this.getName().hashCode();

        }
    }
}
