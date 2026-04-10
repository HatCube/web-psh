package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; set.size() < 25; i++) {
			set.add(new Random().nextInt(50) + 1);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(iter.next() + " ");
			}
			System.out.println();
		}
	}
}
