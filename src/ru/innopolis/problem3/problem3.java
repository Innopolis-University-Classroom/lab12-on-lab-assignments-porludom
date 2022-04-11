package ru.innopolis.problem3;

import java.util.Iterator;

// your solution here
//fix all the errors including package errors
class Item{

}
class Chest implements Iterator<Item>{
    ItemEntry first;

    @Override
    public boolean hasNext() {
        return first.next != null;
    }

    @Override
    public Item next() {
        Item t = first.val;
        first = first.next;
        return t;
    }

    static class ItemEntry{
        Item val;
        ItemEntry next;

        public ItemEntry(Item val) {
            this.val = val;
        }
        public void setNext(ItemEntry entry){
            next = entry;
        }
    }
}