package com.bawei.lvwenjing.ctriy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Created by muhanxi on 17/5/16.
 */

public class Test {



    public static void main(String [] args){

        List<Person> list  = new ArrayList<Person>();

        for(int i=0;i<10;i++){
            list.add(new Person(new Random().nextInt(10)," "+ i));
        }

        Collections.sort(list,new TestComparator());

        for(int i=0;i<10;i++){
            System.out.println("list = " + list.get(i).toString());
        }

    }


    static class Person  {

        public Person(int age,String name){
            this.age = age;
            this.name = name;
        }
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

   static class TestComparator implements Comparator<Person> {


        @Override
        public int compare(Person o1, Person o2) {

            if(o1.getAge() > o2.getAge()){
                return  1 ;
            } else if(o1.getAge() < o2.getAge()){
                return  -1;
            } else {
                return  0 ;
            }


        }
    }

}
