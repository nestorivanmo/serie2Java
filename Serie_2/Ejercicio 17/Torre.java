public class Torre{
	private int topN;
	private char from, inter, to;
	public Torre(int topN, char from,
    char inter, char to){
		this.topN = topN;
		this.from = from;
		this.inter = inter;
		this.to = to;
	}

	public void resolver(int topN, char from, char to, char inter){
		if (topN == 1){
            System.out.println("Disco 1 de " + from + " a " + to);
        }else {

            resolver(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " de " + from + " a " + to);
            resolver(topN - 1, inter, from, to);
        }
	}
}