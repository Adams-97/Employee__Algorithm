import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lab1 {

// Public Attributes 
public static double arr[];
public static double hired;
public static int pos;

// Convert and Copy values of .csv file to public arr
	public static void fileToArr(String fileName, int n) throws FileNotFoundException {
		
		arr = new double[n];
		System.out.println("Number of inputs: " + arr.length );
	Scanner scanner = new Scanner(new File(fileName));
       scanner.useDelimiter(", *|[\r\n]+");
        for (int i = 0; i<arr.length;i++)
      {
      
     	arr[i] = scanner.nextDouble();
      }
        
       
       scanner.close();

	}
	
// Normal Find
public static void find() {
	double best = arr[0];
	pos = 0;
	for (int i = 0; i<arr.length;i++)
	{
		if (best < arr[i]) {
			best = arr[i];
			pos = i;
		}
		
	}
	 
}
	
	
// Best Employee algorithm
public static void algfind() {
	double best = arr[0];
	pos = 0;
	for (int i = 0; i<(arr.length/Math.E);i++)
	{
		if (best < arr[i]) {
			best = arr[i];
			pos = i;
		}
		
	}
	int j = (int) Math.floor(arr.length/Math.E);
	while (arr[pos] > arr[j]) {
		j++;
	}
	pos = j;
	 
}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		fileToArr("C:\\Users\\adams\\eclipse-workspace\\Algo1\\doc\\us4.csv", 1000); // file path
		find(); // using the normal finding function 
		System.out.println("The best value is: " + arr[pos] + ", this is at pos: " + (pos+1));
		algfind(); //using the best employee function
		System.out.println("The best value is using the algorithm: " + arr[pos] + ", this is at pos: " + (pos+1));
	}

}
