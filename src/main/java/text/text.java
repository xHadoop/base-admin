package text;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import oshi.json.util.JsonUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class text {
    public static void main(String[] args) {

        Comparator<Integer> inta = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> integers2 = new TreeSet<>((x,y)->Integer.compare(x,y));

//        Consumer<String> m= x-> System.out.println(x);
        Consumer<String> m=System.out::println;
        m.accept("consumer");

        Function1<String,String> f = x -> x+"是我";
        String meishi = f.apply("meishi");
        System.out.println( meishi);


        ArrayList<Studen> sts = new ArrayList<Studen>();
        sts.add(new Studen("zs",12));
        sts.add(new Studen("ls",16));
        sts.add(new Studen("ww",18));


        Stream<Studen> stream = sts.stream();

        stream.filter(x->x.getAge()<17).parallel()
                .forEach(System.out::print);
        Stream.of("aaa","bbb","ccc").map(x->x.toUpperCase()+" ").forEach(System.out::print);





    }
}
