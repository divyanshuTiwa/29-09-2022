package com.collection.demo.bll;

import java.util.Comparator;

public class Comparator03 {
	public class NameComparator1 implements Comparator<Student002>  {

		@Override
		public int compare(Student002 std1, Student002 std2) {
			String name1 = std1.getStudentName();
			String name2 = std2.getStudentName();

			return name1.compareTo(name2);
			
		}

	}

}
