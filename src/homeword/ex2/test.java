package homeword.ex2;

public class test {
    public static void main(String[] args) {
        brand[] arr=new brand[3];
        arr[0]=new brand("001","哇哈哈",3.5,100);
        arr[1]=new brand("002","福德",6.8,99);
        arr[2]=new brand("003","罗浮山泉",2.0,999);
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
    }
}
