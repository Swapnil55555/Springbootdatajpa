package com.example.demo.exceptionhandling;

public class Record {
	private int recordno;

	public Record(int recordno) throws RecordNotFoundException {
		if (recordno < 0) {
			throw new RecordNotFoundException("Record Can Not Have negative number" + recordno);
		} else {
			this.recordno = recordno;
			System.out.println("you have found record");
		}
	}
}
