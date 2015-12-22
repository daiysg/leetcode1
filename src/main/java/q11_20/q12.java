package q11_20;

public class q12 {

	//easy quiz, need to know how to get the third digit of the number;
	public String intToRoman(int num) {

		String result="";
		String[] aryM={"","M","MM","MMM"};
		String[] aryC={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] aryX={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] aryI={"","I","II","III","IV","V","VI","VII","VIII","IX"};

		int thousand=num/1000;
		int hundred=(num%1000)/100;
		int ten=(num%100)/10;
		int digit=num%10;

		result=aryM[thousand]+aryC[hundred]+aryX[ten]+aryI[digit];

		return result;
	}
}
