public class LabWork1 {
	public static void main(String[] args){
		double[][] d = new double[15][10];
		
		short[] k = getKArray();
		double[] x = getXArray();

		for(int i = 0; i<d.length; i++){
			for(int j = 0; j<d[i].length; j++){
				if(k[i] == 15){
					d[i][j] = Math.pow((Math.cos(Math.pow(x[j], 2*x[j]))), (Math.pow(Math.E, Math.sin(x[j]))*(Math.pow(((Math.pow(x[j]*((2/3)+x[j]), 2)-(3/4))/Math.pow(Math.E, x[j])),2)+1)));
				}
				else if(isInList(k[i])){
					d[i][j] = Math.cos(Math.log(Math.pow(Math.E, x[j])));
				}
				else{
					d[i][j] = Math.pow(Math.pow((((Math.pow((x[j]+(1/3)), 2) + (2/3))/1)/4),(Math.pow((x[j] - 1), (Math.pow((1/4)*(x[j]-(3/4)), 2)*(Math.cbrt(x[j])-1))/0.25)))/(Math.tan(Math.asin((x[j]-4.5)/15)/4)-3), 2);
				}
			}
		}
	
		out(d);
	}

	private static double[] getXArray() {
		double[] x = new double[10];
			for(int i = 0; i<x.length; i++){
			x[i] = -12 + Math.abs(-12-3)*Math.random();
		}
		return x;
	}

	private static short[] getKArray(){
		short[] k = new short[17-3+1];
		for(int i = 0; i<k.length; i++){
			k[i] = (short)(i + 3);
		}
		return k;
	}

	private static void out(double inputList[][]){
		for(int i = 0; i<inputList.length; i++){
			for(int j = 0; j<inputList[i].length; j++){
				System.out.printf("%8.2f", inputList[i][j]);	
			}
			System.out.println();
		}
	}


	private static Boolean isInList(short input){
		int[] listToCheck = {4, 6, 10, 14, 16, 17};
		for(int numberToCheck : listToCheck){
			if(input == numberToCheck){
				return true;
			}	
		}
		return false;
	}
}