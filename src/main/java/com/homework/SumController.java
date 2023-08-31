package com.homework;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	private ArrayList<Sum> repo = new ArrayList<>();

    public void addSum(Sum sum) {
        repo.add(sum);
    }

    public ArrayList<Sum> searchSum(int sum, boolean ascending) {
		if (sum <= 0 || sum >= 100) {
			System.out.println("Integers have to be between 0 and 100 (included).");
			return repo;
		}

		ArrayList<Integer> sumList = new ArrayList<>();

		if (sum >= 0 & sum <= 100) {
			for (int index = 0; index < repo.size(); index++) {
				Sum nr = repo.get(index);

				if (nr.a == sum || nr.b == sum || nr.sum == sum) {
					//System.out.println(nr.sum);
					sumList.add(nr.sum);
				}
            	
        	};
		}

		if (ascending) {
			Collections.sort(sumList);
		} else {
			Collections.sort(sumList, Collections.reverseOrder());
		}

		for (int index = 0; index < sumList.size(); index++) {
			System.out.println(sumList.get(index));
		}
		
        return repo;
    }

	@GetMapping("/sum")
	public Sum sum(@RequestParam(value = "sum", required = true) int a, int b) {
		Sum sum = new Sum(a, b);
		addSum(sum);
		return sum;
	}

	@GetMapping("/sumsearch")
	public ArrayList<Sum> sumSearch(@RequestParam(value = "search", required = false) int nr, boolean ascending) {
		return searchSum(nr, ascending);
	}
}
