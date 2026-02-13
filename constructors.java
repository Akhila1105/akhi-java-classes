class dress{
    int length;
    int width;
 dress () {
          length = 39;
          width =  32;
    }
public int getdress(){
    return (length * width);
}
}
public class constructors {
    public static void main(String[] args) {
        dress frock =new dress();
        System.out.println(frock.getdress());
 }
    
}
