public class Calci {
    public void addition(int a,int b){
        int result = a + b;
        System.out.println("addition of two no is " + result);
    }

    public static void main(String[] args) {
        Calci obj=new Calci();
        obj.addition(11,88);
    }
}
