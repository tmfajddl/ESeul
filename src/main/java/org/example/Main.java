package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        game();
    }

    static int random(){
        return (int) (Math.random()*10);
    }

    static List<Integer> re() {
        List<Integer> arr = new ArrayList<>();
        int a = random();
        arr.add(a);
        while (true) {
            int b =random();
            for(int i = 0; i < arr.size(); i++){
                if(arr.size()==1){
                    break;
                }
                if(arr.get(i)==b || arr.get(i)==a){
                    arr.remove(i);
                }
            }
            arr.add(b);
            if(arr.size()==4){
                break;
            }
        }
        return arr;
    }

    static void game(){
        List<Integer> jungdop = re();
        System.out.println(jungdop);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num < 10){
            List<Integer> me = new ArrayList<>();
            int strick = 0;
            int ball = 0;
            System.out.print("0-9까지의 숫자 4개를 입력하세요:");
            me.add(sc.nextInt());
            me.add(sc.nextInt());
            me.add(sc.nextInt());
            me.add(sc.nextInt());
            for(int i = 0; i < me.size(); i++) {
                for(int j = 0; j < jungdop.size(); j++) {
                    if(me.get(i)==jungdop.get(j)) {
                        if(i==j){
                            strick++;
                            break;
                        }
                        ball++;
                        break;
                    }
                }
            }
            System.out.println(ball + " ball " + strick + " strick");
            num++;
            if(strick==4){
                break;
            }
        }
        System.out.println(jungdop);
    }
}


