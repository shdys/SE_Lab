package anyuanzhi;

import java.util.	*;

public class Polynomialarithmetic {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner lalala = new Scanner(System.in);
		String Input ;
		int la=0;
		Expression a=new Expression();
		System.out.println("Welcome to the PolynomialaArithmetic monitor.\nServer version: 1.0.9\nCopyright (c) 2016。\nType '!h' for help. Type '!q' for exit.\n ");
		while(true){
			Input = lalala.nextLine();
			try{
			if(Input.length()>0&&Input.charAt(0)=='!')
			{
				if(Input.equals("!q")){
					System.out.println("end");
					break;
				}
				else if (Input.equals("!h"))
					System.out.println("啦啦啦懒得写啦就跟\n!例如：!simplify a=1  !d/dx \n必须严格按照规则输入！");

				else if(Input.substring(0,4).equals("!d/d")||Input.substring(0,9).equals("!simplify"))
				{
					if(la==0)
						System.out.println("尚未输入任何表达式，无法执行命令。\n");
					else 
						a.Command(Input);
				}
			}
			else 
			{
				la=1;
				a.Set(Input);
				a.printout();
				System.out.print("\n");
			}
		}
			catch(Exception e)
			{
				System.out.println("输入不合法！\n"+e);
			}
		}
		lalala.close();
	}
}
