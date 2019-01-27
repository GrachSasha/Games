class mainClass{
	
	int x,player;
	static int arr[][] = new int[3][3];	
	
	mainClass(int i){
		//System.out.println("in_mainClass()");
		player = i;
		System.out.println("You player is # " + player);
	}
	
	void setValue(int i, int j, int z){
		//System.out.println("in_setValue()");
		arr[i][j] = z;
	}
	
	
	void getValue(){
		//System.out.println("in_getValue()");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
			System.out.print("[ " + arr[i][j] + " ]");
			System.out.print(" "); 
			}
			System.out.println();
		}
	}
	
    int check(){
		//System.out.println("in_check()");
		if((arr[0][0] == player)&&(arr[0][1] == player)&&(arr[0][2] == player))
		{System.out.println("Player # " + player + "wins");
		return -1;}
		else
		    if((arr[1][0] == player)&&(arr[1][1] == player)&&(arr[1][2] == player))
				{System.out.println("Player # " + player + "wins");
		         return -1;}
			else
				if((arr[2][0] == player)&&(arr[2][1] == player)&&(arr[2][2] == player))
				    {System.out.println("Player # " + player + "wins");
		            return -1;}
			    else
					if((arr[0][0] == player)&&(arr[1][0] == player)&&(arr[2][0] == player))
				        {System.out.println("Player # " + player + "wins");
		                return -1;}
			        else
						if((arr[0][1] == player)&&(arr[1][1] == player)&&(arr[2][1] == player))
				            {System.out.println("Player # " + player + "wins");
		                     return -1;}
			            else
							if((arr[0][2] == player)&&(arr[1][2] == player)&&(arr[2][2] == player))
				                {System.out.println("Player # " + player + "wins");
		                         return -1;}
			                else
							    if((arr[0][0] == player)&&(arr[1][1] == player)&&(arr[2][2] == player))
				                    {System.out.println("Player # " + player + "wins");
	                             	return -1;}
			                    else
									if((arr[0][2] == player)&&(arr[1][1] == player)&&(arr[2][0] == player))
				                       {System.out.println("Player # " + player + "wins");
		                                return -1;}
								   else
									   return 0;	
	}
	//int consoleCleaner(){}
	
}
