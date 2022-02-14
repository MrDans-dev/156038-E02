import java.util.*;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println(jestPalindromem(arrayList));


        ArrayList array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        wypiszCoDrugi(array);

        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        wypiszCoDrugi(linkedList);
        System.out.println();

        File file = new File("src/folder1");
        File[] listFile = file.listFiles();
        Arrays.stream(listFile).filter(File::isDirectory).forEach(System.out::println);

        System.out.println();
        File file2 = new File("src");
        File[] listFile2 = file2.listFiles();
        Arrays.stream(listFile2).filter(File::isDirectory).forEach(System.out::println);

    }


    public static  <T extends Iterable<E>,E> void wypiszCoDrugi(T o){
        System.out.println();
        Iterator iter = o.iterator();
        int i =1;
        while (iter.hasNext()){
            Object new_iter = iter.next();
            if (i%2==0){
                System.out.print(new_iter.toString()+",");
            }
            i++;
        }
    }

    public static <T extends Comparable<T>> boolean jestPalindromem(List<T> o1){
        for(int i=0;i<o1.size();i++)
        {
            for(int o=o1.size();o>=0;o--){
                if (o1.indexOf(i)==o1.indexOf(o)){
                    return false;
                }
            }
        }
        return true;
    }
}
