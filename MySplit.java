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
        while (i <= str.length()){
            str = str.substring(i, str.length());
            if(str.indexOf('&') == -1){
                list.add(str);
            }else {
                i = str.indexOf('&');
                String s = str.substring(0, i);
                i = i + 2;
                list.add(s);
//                list.add(str);
            }
        }
        return list;
    }
}
