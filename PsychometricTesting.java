static int[] jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
		
		int lenScore=scores.length;
		int lenLower=lowerLimits.length;
		int count=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<lenLower;i++){
			for(int j=0;j<lenScore;j++){
				if((lowerLimits[i]<=scores[j])&&(scores[j]<=upperLimits[i])){
					count ++;
				}
			}
			al.add(count);
			count=0;
		}
		
		int[] op=new int[al.size()];
		for(int k=0;k<op.length;k++){
			op[k]=al.get(k);
		}
		
		return op;
		
	}