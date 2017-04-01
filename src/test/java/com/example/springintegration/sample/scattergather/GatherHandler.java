package com.example.springintegration.sample.scattergather;

import java.util.List;

public class GatherHandler {

	public Integer sum(List<Integer> values) {
		int result = 0;
		for (Integer value : values) {
			result += value;
		}
		return result;
	}
}
