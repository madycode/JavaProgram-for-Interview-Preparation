package com.ms;

import java.util.Comparator;

public class IdComparator implements Comparator<Eng> {


	

	@Override
	public int compare(Eng o1, Eng o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
