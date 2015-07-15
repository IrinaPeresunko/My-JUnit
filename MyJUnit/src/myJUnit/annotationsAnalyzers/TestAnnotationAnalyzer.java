package myJUnit.annotationsAnalyzers;

import java.lang.reflect.Method;
import java.util.Arrays;

import myJUnit.annotations.Test;


public class TestAnnotationAnalyzer {
	public void parseAnnotation(Class<?> parsingClass){
		Method[] methods = parsingClass.getMethods();
		System.out.println(Arrays.toString(methods));
		int passAnnotation=0;
		int failAnnotation=0;
		for(int i=0;i<methods.length;i++){
			if(methods[i].isAnnotationPresent(Test.class)){
				Test test = methods[i].getAnnotation(Test.class);
				System.out.println("test="+test);
				//Class<?> expected = test.expected();
				//System.out.println("expected="+expected);
				try {
					methods[i].invoke(null);
					passAnnotation++;
				} catch (Exception e) {
					//if(Exception.class!= expected){
						failAnnotation++;
					//}
//					else{
//						passAnnotation++;
//					}
					e.printStackTrace();
				} 
			}
			System.out.println("pass="+passAnnotation);
			System.out.println("fail="+failAnnotation);
		}
	}

}
