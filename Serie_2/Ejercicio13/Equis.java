public class Equis{
	int equis(int n){
		if(n%2 == 0)
			return 2;
		else if(n%3 == 0)
			return 3;
		else if(n%5 == 0)
			return 5;
		else
			return n;
	}
}