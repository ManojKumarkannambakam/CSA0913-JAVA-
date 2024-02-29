import java.util.Scanner;
public class squarecube{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
double givenNumber = scanner.nextDouble();
double squareResult = givenNumber * givenNumber;
double cubeResult = givenNumber * givenNumber * givenNumber;
System.out.println("Square Number: " + roundToThreeDecimalPlaces(squareResult));
System.out.println("Cube Number: " + roundToThreeDecimalPlaces(cubeResult));
}
private static double roundToThreeDecimalPlaces(double value) {
return Math.round(value * 1000.0) / 1000.0;
}
}