package p2Produto;
import java.util.*;
public class Utils {
    public static boolean existe (List x, Produto y){
        if (x.contains(y)){
            return true;
        }

        return false;
    }
    public static List getList(){
        List<Object> x= new ArrayList<>();
        String a= "a";
        String b= "b";
        Produto airfrier= new Produto("aifrier");
        x.add(a);
        x.add(b);
        x.add(airfrier);

        x.add("abc");


        return x;
    }
}
