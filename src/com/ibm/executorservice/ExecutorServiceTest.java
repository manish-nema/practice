package com.ibm.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(1);
		for(int i=0;i<500;i++)
		{
			service.execute(new RunnableTaskForExecutorService());
			
		}
		System.out.println("First task executed");
		for(int i=0;i<200;i++)
		{
			service.execute(new RunnableTaskForExecutorServiceTwo());
		}
		System.out.println("Second task executed");
		for(int i=0;i<100;i++)
		{
			service.execute(new RunnableTaskForExecutorServiceThree());
		}
		System.out.println("Third task executed");
	}

}
