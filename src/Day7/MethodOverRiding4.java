package Day7;

class bank
{
	double rateofintrest()
	{
		return 0;
	}
}

class SBI extends bank
{
	double rateofintrest()
	{
		return 10.5;
	}
}

class ICIC extends bank
{
	double rateofintrest()
	{
		return 8.5;
	}
}

class HDFC extends bank
{
	double rateofintrest()
	{
		return 7.9;
	}
}


public class MethodOverRiding4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI sbi=new SBI();
		System.out.println(sbi.rateofintrest());
		
		ICIC icic=new ICIC();
		System.out.println(icic.rateofintrest());
		
		HDFC hdfc=new HDFC();
		System.out.println(hdfc.rateofintrest());
		
	}

}
