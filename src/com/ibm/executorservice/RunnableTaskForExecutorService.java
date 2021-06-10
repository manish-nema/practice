package com.ibm.executorservice;

public class RunnableTaskForExecutorService implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableTaskForExecutorService one "+getThreadNo());
		
	}

	int threadNo=0;

	public int getThreadNo() {
		return threadNo;
	}

	public void setThreadNo(int threadNo) {
		this.threadNo = threadNo;
	}
}
