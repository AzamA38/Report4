package jp.ac.uryukyu.ie.e185731;

public class main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println(e + "が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}
