import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringAdditionCalculatorTest {
	private StringAdditionCalculator stringAdditionCalculator;

	@BeforeEach
	void setUp() {
		stringAdditionCalculator = new StringAdditionCalculator();
	}

	@ParameterizedTest
	@MethodSource
	void 쉼표_또는_콜론을_구분자로_가지는_문자열을_extractNumber함수의_인자로_전달할때_그_구분자_기준으로_숫자를_나눈다(String[] argument) {
		// System.out.println("input : " + input);
		// System.out.println("expected : " + expected);
		String input = argument[0];
		// String[] numberStringArray = stringAdditionCalculator.extractNumber(input);
		// Assertions.assertThat(numberStringArray).containsExactly(expected);
	}

	private static Stream<Arguments> 쉼표_또는_콜론을_구분자로_가지는_문자열을_extractNumber함수의_인자로_전달할때_그_구분자_기준으로_숫자를_나눈다() {
		return Stream.of(
			Arguments.of("1,2", "1", "2"),
			Arguments.of("1,2,3", "1", "2", "3"),
		);
	}
}
