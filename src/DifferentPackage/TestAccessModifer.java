package DifferentPackage;

import SamePackage.SamePackageBase;
import SamePackage.SamePackageChildClass;

public class TestAccessModifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamePackageBase spb = new DifferentPackageChildClass();
		
		
		System.out.println("Testing SamePackageBase VARIABLES using BASE class object");
		
		System.out.println("Not able to access pvt_SPB_var");
		//System.out.println(spb.def_SPB_var);
		//System.out.println(spb.pro_SPB_var);
		System.out.println(spb.pub_SPB_var);
		
		System.out.println("*********");
		
		System.out.println("Testing SamePackageBase METHODS using BASE class object");
		
		System.out.println("Not able to access pvt_SPB_method");
		//spb.def_SPB_method();
		//spb.pro_SPB_method();
		spb.pub_SPB_method();
		
		System.out.println("*********");
		
		System.out.println("Testing SamePackageChildClass VARIABLES using CHILD class object");
		
		System.out.println("*********");
		SamePackageChildClass spc = new SamePackageChildClass();
		
		System.out.println("****CHILD CLASS Variables****");
		
		//System.out.println(spc.def_SPC_var);
		//System.out.println(spc.pro_SPC_var);
		System.out.println(spc.pub_SPC_var);
		
		System.out.println("****Inherited BASE CLASS Variables****");
		
		//System.out.println(spc.def_SPB_var);
		//System.out.println(spc.pro_SPB_var);
		System.out.println(spc.pub_SPB_var);
		
		System.out.println("*********");
		System.out.println("****CHILD CLASS Methods****");
		
		//spc.def_SPC_method();
		//spc.pro_SPC_method();
		spc.pub_SPC_method();
		
		System.out.println("*********");
		System.out.println("****Inherited BASE CLASS Methods****");
		
		//spc.def_SPB_method();
		//spc.pro_SPB_method();
		spc.pub_SPB_method();
	}

}
