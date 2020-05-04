aspect loging {
	void around():call(* *.ar(..))
	{
		System.out.println("before");
		proceed();
		System.out.println("After");
	}
}