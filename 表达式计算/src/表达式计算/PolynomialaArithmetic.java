package 表达式计算;

import java.util.*;

public class PolynomialaArithmetic {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner lalala = new Scanner(System.in);
		String expressionInput ;
		
		//System.out.println(expressionInput);
		//while(true){
			expressionInput = lalala.nextLine();
			Expression a=new Expression();
			a.Set(expressionInput);
			a.printout();
		//}
		String commandInput = lalala.nextLine();
		a.Command(commandInput);
	}

}
