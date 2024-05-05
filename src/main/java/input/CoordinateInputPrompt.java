package input;

import input.dto.ConsoleInput;
import util.Console;

public class CoordinateInputPrompt implements InputPrompt {

    private static final String INPUT_COORDINATE_NAVIGATION_STRING = "> 좌표를 입력하세요.";

    @Override
    public ConsoleInput prompt() {
        System.out.println(INPUT_COORDINATE_NAVIGATION_STRING);
        String userInput = Console.readLine();

        ConsoleInput coordinateConsoleInput = ConsoleInputCoordinatePatternMatcher.match(userInput);
        ConsoleInputCoordinateValidChecker consoleInputCoordinateValidChecker = new ConsoleInputCoordinateValidChecker();
        consoleInputCoordinateValidChecker.check(coordinateConsoleInput);

        return coordinateConsoleInput;
    }
}
