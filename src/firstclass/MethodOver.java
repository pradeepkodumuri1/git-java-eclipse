package firstclass;

public class MethodOver {

	public static void main(String[] args) {
		int A,B,radius;
        float d;	
        Explainn a= new Explainn();
        A=10;
        B=12;
        radius= 5;
        d= 3.14f;
        System.out.println("Area of rectangle" + a.area(A,B));
        System.out.println("Area of square" + a.area(A));
        System.out.println("Area of circle" + a.area(d,radius));
        

	}

}
