package zad32;
//Korzystajšc z klas: Pair oraz Triple (mo¿esz je tu wkleiæ) - stwórz klasê Quadruple,
//która jest uniwersalnym kontenerem dla 4 typów generycznych. 
// W main poka¿ u¿ycie.

public class Quadruple<A,B,C,D>
{
	private A alpha;
	private B beta;
	private C gamma;
	private D delta;
	
	public void set1(A alpha)
	{
		this.alpha=alpha;
	}
	public void set2(B beta)
	{
		this.beta=beta;
	}
	public void set3(C gamma)
	{
		this.gamma=gamma;
	}
	public void set4(D delta)
	{
		this.delta=delta;
	}
	public A get1()
	{
		return alpha;
	}
	public B get2()
	{
		return beta;
	}
	public C get3()
	{
		return gamma;
	}
	public D get4()
	{
		return delta;
	}
	public static void main(String[] args)
	{
		Quadruple<String,String,String,String> vvv = new Quadruple();
		vvv.set1("2");
		vvv.set2("1");
		vvv.set3("3");
		vvv.set4("7");
		System.out.println(vvv.get1()+vvv.get2()+vvv.get3()+vvv.get4());
	}
}
