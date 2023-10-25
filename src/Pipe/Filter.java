package Pipe;

import java.io.IOException;

public abstract class Filter {
    protected pipe input;
    protected pipe output;

    public Filter(pipe input, pipe output) {
        this.input = input;
        this.output = output;
    }
    protected abstract void transform() throws IOException;
}
