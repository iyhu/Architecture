package Pipe;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args,String name) throws IOException {
        /*File inFile = new File("E:\\input.txt");*/
        File inFile = new File(name);
        File outFile = new File("E:\\output.txt");
        pipe pipe1 = new pipe();
        pipe pipe2 = new pipe();
        pipe pipe3 = new pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}
