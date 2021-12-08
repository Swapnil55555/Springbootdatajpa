package com.example.demo.exceptionhandling;

public class Record {
private int recordno;

public Record(int recordno) throws RecordNotFoundException
{
	if(recordno<0)
	{
		throws new RecordNotFoundException("Record Can Not Have negative number"+age);
	}
	else
	{
		this.recordno=recordno;
		System.out.println("you have found record");
	}
}
}
