package solution;

import java.util.ArrayList;

public class Terminal
{

    private ArrayList<String> options;

    public void addOption(String value) {
        this.options.add(value);
    }

    public void clearOptions() {
        this.options.clear();
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void displayMenu() {
        IO.println("Terminalmeny:");

        for (int i = 0; i < this.options.size(); i ++) {
            IO.println("- " + (i + 1) + ") " + this.options.get(i));
        }
    }
}
