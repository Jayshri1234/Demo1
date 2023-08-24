package type_casting;

public class Test1 {
public int m1() {
	return 10;
}
public Object m2() {
	return 30;
}
public static void main(String[] args) {
	Test1 t=new Test1();
	int x=t.m1();
	//int y=(int) t.m2();
	int y=(int) t.m2();
	System.out.println(x);
	System.out.println(y);
}
}
