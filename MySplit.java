package suanfa.string;

import java.util.ArrayList;
import java.util.List;

public class MySplit {
    public static void main(String[] args) {
        String str = "zwl&&male&&123aaaa&&www&&jijaaaaa";
//        int i = str.indexOf("&");   //-1
//        System.out.println(i);
        List<String> list = doSplit(str);
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static List<String> doSplit(String str) {
        List<String> list = new ArrayList<>();

        int i = 0;
        while (true){
            str = str.substring(i, str.length());
            i = str.indexOf('&');
            if(i == -1){
                list.add(str);
                break;
            }else {
                String s = str.substring(0, i);
                i = i + 2;
                list.add(s);
            }
        }
        return list;
    }
}
