package com.tnsif.interfaces;

public interface Interface2Interface {
	// Interface 1
	    void draw();
	}

	// Interface 2 extending Shape
	interface ColoredShape extends Interface2Interface {
	    void fillColor(String color);
	}

	// Class implementing ColoredShape
	class Circle implements ColoredShape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle");
	    }

	    @Override
	    public void fillColor(String color) {
	        System.out.println("Filling the circle with " + color);
	    }
	}

	

