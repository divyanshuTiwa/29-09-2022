package com.collection.demo.bll;

import java.util.Comparator;

public class StateComparator04 implements Comparator<Student002> {

				@Override
				public int compare(Student002 std1, Student002 std2) {
					String state1 = std1.getState();
					String state2 = std2.getState();

					return state1.compareTo(state2);

			}

}
