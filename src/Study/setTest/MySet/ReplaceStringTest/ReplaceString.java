package Study.setTest.MySet.ReplaceStringTest;

public class ReplaceString {
    public static <T> void Replace(T[] t,int a,int b){
        T temp=t[a];
        t[a]=t[b];
        t[b]=temp;
    }
    public static <E> void reserveWays(E[] e){
        for (int i = 0,j=e.length-1; i <j ; i++,j--) {
            E temp=e[i];
            e[i]=e[j];
            e[j]=temp;
        }
    }
}
