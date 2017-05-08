/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

/**
 *
 * @author Aruni
 */
public abstract class ShapeDecorator implements Shape {

    private Shape shapeToBeDecorated;

    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
    
    @Override
    public void draw() {
        this.shapeToBeDecorated.draw();
    }
    
}
