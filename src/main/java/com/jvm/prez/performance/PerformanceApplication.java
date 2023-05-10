package com.jvm.prez.performance;

import java.util.Date;

public class PerformanceApplication {

	public static void main(String[] args) throws InterruptedException {
		var start = new Date();

		RunMemoryLeaks r = new RunMemoryLeaks(Integer.valueOf(args[0]));
		r.run();

		var end = new Date();

		Thread.sleep(60000);

		System.out.println("Temps écoulé = " + (end.getTime() - start.getTime()) + "ms");
	}


}
