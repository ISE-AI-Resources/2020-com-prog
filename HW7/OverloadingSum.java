public class OverloadingSum{
	public static void main(String[] args){
		try{
			switch(args.length){
			case 1:
				System.out.println(sum(Integer.parseInt(args[0])));
				break;
			case 2:
				System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
				break;
			case 3:
				System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
				break;
			case 4:
				System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])));
				break;
			default:
				System.out.println("ERROR: incorrect inputs!");
				System.exit(0);
			}
		}
		catch(NumberFormatException e){
			System.out.println("ERROR: incorrect inputs!");
			System.exit(0);
		}
	}
	public static int sum(int start, int end, int step, int bias){
		int sum = 0;
		for(int i = start; i <= end; i += step){
			sum += i;
		}
		return sum + bias;
	}
	public static int sum(int start, int end, int step){
		return sum(start,end,step,0);
	}
	public static int sum(int start, int end){
		return sum(start,end,1,0);
	}
	public static int sum(int end){
		return sum(1,end,1,0);
	}
}