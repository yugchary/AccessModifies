package SamePackage;

public class SamePackageChildClass extends SamePackageBase{
	
	
	private String pvt_SPC_var="pvt_SPC_var";
	String def_SPC_var="def_SPC_var";
	protected String pro_SPC_var="pro_SPC_var";
	public String pub_SPC_var ="pub_SPC_var";
	
	
	
	
	
	
	private void pvt_SPC_method() {
		System.out.println("SamePakagebase pvt_SPC_var > "+pvt_SPC_var);
	}
	
	void def_SPC_method() {
		System.out.println("SamePakagebase def_SPC_var > "+def_SPC_var);
	}
	
	
	protected void pro_SPC_method() {
		System.out.println("SamePakagebase pro_SPC_var > "+pro_SPC_var);
	}
	
	
	public void pub_SPC_method() {
		System.out.println("SamePakagebase pub_SPC_var > "+pub_SPC_var);
		System.out.println("calling from pub_SPC_var method > pvt_SPC_method");
		pvt_SPC_method();
		pub_def_SPC_mehtod();
	}
	
	
	public void pub_def_SPC_mehtod() {
		
		System.out.println(def_SPB_var);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SamePackageChildClass spc = new SamePackageChildClass();
		SamePackageBase spb = new SamePackageBase();
		
		System.out.println(spb.def_SPB_var);
		
		System.out.println(spc.def_SPB_var);
		
	
		
		spc.pub_def_SPC_mehtod();
		
		//String  x = SamePackageBase.pvt_static_SPC_var
	}

}
