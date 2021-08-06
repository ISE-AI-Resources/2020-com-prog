public class DataTypeExample {
    public static String getDataType(Object obj){
        return " - " + ((Object) obj).getClass().getName().toString();
    }
	
    public static void main(String[] args) throws Exception{
        System.out.println(3/4 + getDataType(3/4));
        System.out.println(40L + 7F + getDataType(40L + 7F));
        System.out.println(9.2%6 + getDataType(9.2%6));
        System.out.println(4.5%3.1 + getDataType(4.5%3.1));
        System.out.println(13%5 + getDataType(13%5));
        System.out.println(9+(double)4 + getDataType(9+(double)4));
        System.out.println(1.5f+3 + getDataType(1.5f+3));
        System.out.println((int)5.7+4.5 + getDataType((int)5.7+4.5));
        System.out.println((double)5+"6" + getDataType((double)5+"6"));
        System.out.println((int)3.4+4.2f-3d + getDataType((int)3.4+4.2f-3d));
    }
}

