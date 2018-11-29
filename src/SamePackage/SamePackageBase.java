package SamePackage;

public class SamePackageBase {
	
	
	private String pvt_SPB_var="pvt_SPB_var";
	String def_SPB_var="def_SPB_var";
	protected String pro_SPB_var="pro_SPB_var";
	public String pub_SPB_var ="pub_SPB_var";
	
	private static String pvt_static_SPC_var = "pvt_static_SPC_var";
	
	
	private void pvt_SPB_method() {
		System.out.println("SamePakagebase pvt_SPB_var > "+pvt_SPB_var);
	}
	
	void def_SPB_method() {
		System.out.println("SamePakagebase def_SPB_var > "+def_SPB_var);
	}
	
	protected void pro_SPB_method() {
		System.out.println("SamePakagebase pro_SPB_var > "+pro_SPB_var);
	}
	
	
	public void pub_SPB_method() {
		System.out.println("SamePakagebase pub_SPB_var > "+pub_SPB_var);
		System.out.println("calling from pub_SPB_var method > pvt_SPB_method");
		pvt_SPB_method();
	}
	
	protected SamePackageBase() {
		System.out.println("Base package protected class constructor");
	}
	
	private static void pvtStaticSamePackageBaseMethod() {
		System.out.println("pvt Static SamePackageBase Method");
		
		
	}
	
	

}
