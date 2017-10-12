package test.hackerrank.here;

import java.util.*;
import java.util.Map.Entry;

public class BuyingShowTickets {
	
	public static void main(String[] args) {
		
		Integer tickets[] = {2,6,3,4,5};
		int p = 2;
		
		long waitTime = waitingTime(tickets, p);
		System.out.println("Wait Time: "+waitTime);
	}

	 static long waitingTime(Integer[] tickets, int p) {

		long waitTime = 0L;

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for(int i = 0; i < tickets.length; i++){
			map.put(i, tickets[i]);
		}
		System.out.println("Map of users: "+map);

		while(!map.isEmpty() && map.get(p)>0){
			for(Integer entryKey: map.keySet()){	
			if(map.get(entryKey)>0 && map.get(p)>0){	
				waitTime++;
				map.put(entryKey, map.get(entryKey) - 1);
				System.out.println("wait: "+waitTime);
			}
			}
			System.out.println("Map after round: "+map);
		}
		
		return waitTime;
	}

}