package myJUnit.runner;

import myJUnit.annotations.Test;
import myJUnit.annotationsAnalyzers.TestAnnotationAnalyzer;

public class Runner {

	public static void main(String[] args) {
		TestAnnotationAnalyzer testAnotAnalyz = new TestAnnotationAnalyzer();
		testAnotAnalyz.parseAnnotation(Test.class);
	}

}
