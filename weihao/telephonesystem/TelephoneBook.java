package com.weihao.telephonesystem;

public class TelephoneBook {
    private Person[] items =new Person[100];
    //private Person[] items;
    //public TelephoneBook(){
    //    this.items =new Person[100];-----------
    //}
    public boolean add(Person item){
        for( int i =0; i<items.length;i++){
            if(items[i]==null){
                items[i]  = item;
                return true;
            }
        }
        return false;
    }
    public Person[] findAll(){
        return items;
    }

    public boolean del(String name){
        for (int i = 0;i<items.length;i++){
            if(items[i]!=null && items[i].getName().equals(name)){
                items[i]=null;
                return true;
            }
        }
        return false;
    }
    public void chg(String name , Person item){
        findByName(name);
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null && items[i].getName().equals(name)) {
                items[i] = item;
                return ;
            }
        }
        //return false;
    }
    public Person findByName(String name){
        for(int i = 0; i< items.length ;i++){
            if(items[i]!=null&&items[i].getName().equals(name)){
                return items[i];
            }
        }
        return null;
    }
}
