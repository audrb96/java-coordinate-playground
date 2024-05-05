import domain.Polygon;
import domain.PolygonCalculator;
import domain.PolygonCalculatorCreator;
import domain.PolygonCreator;
import input.ConsoleInputPrompt;
import input.InputPrompt;
import input.dto.ConsoleInput;
import output.OutputPrompt;
import output.OutputPromptCreator;
import output.dto.CalculateOutput;

public class Application {

    public static void main(String[] args) {
        InputPrompt inputPrompt = new ConsoleInputPrompt();
        ConsoleInput consoleInput = inputPrompt.prompt();

        Polygon polygon = PolygonCreator.create(consoleInput.toDomainCoordinates());
        PolygonCalculator polygonCalculator = PolygonCalculatorCreator.create(polygon);
        CalculateOutput output = polygonCalculator.calculate(polygon);

        OutputPrompt outputPrompt = OutputPromptCreator.create(output);
        outputPrompt.prompt(output);
    }
}
