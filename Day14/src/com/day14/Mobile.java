package com.day14;

public class Mobile {
    String[] outdatedModels = {"note4","note5","note6","note7"};
    void searchOutdatedModel(String name,String... models){

        for(String x:outdatedModels){
            for(String y:models){
                if(x==y){
                    System.out.println("outdated");
                }

            }
        }
    }

    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.searchOutdatedModel("samsung","note5","note10");
    }

}
