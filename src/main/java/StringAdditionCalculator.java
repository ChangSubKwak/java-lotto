public class StringAdditionCalculator {
	public String[] extractNumber(String numberIncludeCommaOrSemiColon) {
		return numberIncludeCommaOrSemiColon.split(",|;");
	}
}
