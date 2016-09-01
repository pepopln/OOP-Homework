package genericBox;


import genericBox.interfaces.CustomList;
import genericBox.interfaces.Sorter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> elements = new CustomListImpl<>();
        while (true){
            String line = reader.readLine();
            if (line.equals("END")){
                break;
            }
            String[] params = line.split("\\s+");
            switch (params[0]){
                case "Add":
                    elements.add(params[1]);
                    break;
                case "Remove":
                    elements.remove(Integer.valueOf(params[1]));
                    break;
                case "Contains":
                    System.out.println(elements.contains(params[1]));
                    break;
                case "Swap":
                    elements.swap(Integer.valueOf(params[1]),Integer.valueOf(params[2]));
                    break;
                case "Greater":
                    System.out.println(elements.countGreaterThat(params[1]));
                    break;
                case "Min":
                    System.out.println(elements.getMin());
                    break;
                case "Max":
                    System.out.println(elements.getMax());
                    break;
                case "Print":
                    for (String element : elements) {
                        System.out.println(element);
                    }
                    break;
                case "Sort":
                    Sorter<String> sorter = new SorterImpl<>();
                    sorter.sort(elements);
                    break;


            }
            List<Integer> ints = new LinkedList<>();

            Iterator iterator = ints.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());

            }
        }
    }


}
