package OOP;

public class Main {
    public static void main(String[] args,String name) {
        Input input = new Input();
        /*input.input("E:\\input.txt");*/
        input.input(name);
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("E:\\output.txt");

    }
}
