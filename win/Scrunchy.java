class Scrunchy{
	public static void strech()
	{
		System.out.println("running strech in scrunchy");
	}
	public static void style()
	{
		System.out.println("running style in scrunchy");
	}
	public static void hold()
	{
		System.out.println("running hold in scrunchy");
		tie();
	}
	public static void tie()
	{
		System.out.println("running tie in scrunchy");
		hold();
	}
}
