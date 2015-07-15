package myJUnit.asserts;

public class MyAsserts {
	public static boolean assertEquals(int a,int b){
		return a==b;
	}
	public static boolean assertEquals(String str1,String str2){
		return str1.equals(str2);
	}
	public static boolean assertEquals(boolean bool1,boolean bool2){
		return bool1==bool2;
	}
	public static boolean assertEquals(double d1,double d2){
		return d1==d2;
	}
	public static boolean assertEquals(char c1,char c2){
		return c1==c2;
	}
}
