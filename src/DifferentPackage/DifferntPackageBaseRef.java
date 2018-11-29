package DifferentPackage;

import SamePackage.SamePackageBase;

public class DifferntPackageBaseRef extends SamePackageBase {

	private String pvt_DPC_var = "pvt_DPC_var";
	String def_DPC_var = "def_DPC_var";
	protected String pro_DPC_var = "pro_DPC_var";
	public String pub_DPC_var = "pub_DPC_var";

	private void pvt_DPC_method() {
		System.out.println("SamePakagebase pvt_DPC_var > " + pvt_DPC_var);
	}

	void def_DPC_method() {
		System.out.println("SamePakagebase def_DPC_var > " + def_DPC_var);
	}

	protected void pro_DPC_method() {
		System.out.println("SamePakagebase pro_DPC_var > " + pro_DPC_var);
	}

	public void pub_DPC_method() {
		System.out.println("SamePakagebase pub_DPC_var > " + pub_DPC_var);
		System.out.println("calling from pub_DPC_var method > pvt_DPC_method");
		pvt_DPC_method();
	}

	public static void main(String[] args) {

		SamePackageBase dpc = new DifferntPackageBaseRef();
		
		//SamePackageBase dpc1 = new SamePackageBase();
		

		System.out.println("****CHILD CLASS Variables****");

		
//		System.out.println(dpc.pvt_DPC_var);
//		System.out.println(dpc.def_DPC_var);
//		System.out.println(dpc.pro_DPC_var);
//		System.out.println(dpc.pub_DPC_var);

		System.out.println("****Inherited BASE CLASS Variables****");

		//System.out.println(dpc.pvt_SPB_var);
		//System.out.println(dpc.def_SPB_var);
		//System.out.println(dpc.pro_SPB_var);
		System.out.println(dpc.pub_SPB_var);

		System.out.println("*********");
		System.out.println("****CHILD CLASS Methods****");

//		dpc.pvt_DPC_method();
//		dpc.def_DPC_method();
//		dpc.pro_DPC_method();
//		dpc.pub_DPC_method();

		System.out.println("*********");
		System.out.println("****Inherited BASE CLASS Methods****");

		//dpc.pvt_SPB_method();
		//dpc.def_SPB_method();
		//dpc.pro_SPB_method();
		dpc.pub_SPB_method();
	}

}
