aspect MyAspect{
	pointcut p1():set(String Hello.*);
	pointcut p2():get(* Hello.*);
	before():p1(){
		System.out.println("String variables are about to be initialized");
	}
	after():p2(){
		System.out.println("All variables have been printed");
	}
}