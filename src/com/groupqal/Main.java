package com.groupqal;

import com.groupqal.model.Circle;
import com.groupqal.model.Rectangle;
import com.groupqal.model.Shape;
import com.groupqal.model.Triangle;
import com.groupqal.view.ColorComparator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		{
    	Shape[] shapes = new Shape[9];
	shapes[0] = new Triangle("red", 3, 4, 5);
	shapes[1] = new Triangle("blue", 6, 4, 5);
	shapes[2] = new Circle("white", 3);
	shapes[3] = new Circle("black", 4);
	shapes[4] = new Circle("grey", 5);
	shapes[5] = new Rectangle("pink", 2, 6);
	shapes[6] = new Rectangle("green", 4, 7);
	shapes[7] = new Rectangle("purple", 5, 4);
	shapes[8] = new Rectangle("brown", 3, 1);
			Arrays.sort(shapes, new ColorComparator());
			for (Shape term : shapes) {
				System.out.println(term);
			}

    }

    }
}
