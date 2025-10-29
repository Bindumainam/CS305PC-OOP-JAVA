class AnnoP{
	
	@Deprecated
	public void depM(){
		System.out.println("Deprecated Method...");
	}
	
	public void ovR(){
		System.out.println("AnnoP");
	}
}
@MyAnno
class AnnoC extends Annop{
	@Override
	public void ovR(){
		System.out.println("Annoc");
	}
}

public class AnnoDemo{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
		Class<?> ct =AnnoP.class;
		AnnoC ac = new AnnoC();
		ac.ovR();
		ac.depM();
	MyAnno ma = MyAnno.class;
		System.out.println(ct.isAnnotationPresent(MyAnno.class));
		System.out.println(ct.getAnnotationType(MyAnno.class).usage());
	}
}
