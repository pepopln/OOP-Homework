package RectangleIntersection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by pepo on 29.6.2016 г..
 */
public class RectangleIntersectionMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Rectangle> rectangles = new HashMap<>();
        String[] params = reader.readLine().trim().split("\\s+");
        int n = Integer.valueOf(params[0]);
        int m = Integer.valueOf(params[1]);

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().trim().split("\\s+");
            String id = input[0];
            double width = Double.valueOf(input[1]);
            double height= Double.valueOf(input[2]);
            double x = Double.valueOf(input[3]);
            double y = Double.valueOf(input[4]);

            Rectangle rectangle = new Rectangle(id,width,height,x,y);
            rectangles.put(id,rectangle);
        }
        for (int i = 0; i < m; i++) {
            String[] input = reader.readLine().trim().split("\\s+");
            String firstId = input[0];
            String secondId = input[1];

            Rectangle first = rectangles.get(firstId);
            Rectangle second = rectangles.get(secondId);

            System.out.println(first.intersects(second));
        }
    }
}
