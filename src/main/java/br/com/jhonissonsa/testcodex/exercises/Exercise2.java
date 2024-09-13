package br.com.jhonissonsa.testcodex.exercises;

public class Exercise2 {

    public boolean intersects(Rectangle rect1, Rectangle rect2) {
        Rectangle newRect1 = order(rect1);
        Rectangle newRect2 = order(rect2);

        if (newRect1.finalX < newRect2.initialX || newRect2.finalX < newRect1.initialX) {
            return false;
        }
        if (newRect1.finalY < newRect2.initialY || newRect2.finalY < newRect1.initialY) {
            return false;
        }
        return true;
    }

    private Rectangle order(Rectangle rect) {
        if (rect.initialX > rect.finalX) {
            return new Rectangle(rect.finalX, rect.finalY, rect.initialX, rect.initialY);
        }
        return rect;
    }

    public static class Rectangle {

        int initialX;
        int initialY;
        int finalX;
        int finalY;

        public Rectangle(int initialX, int initialY, int finalX, int finalY) {
            this.initialX = initialX;
            this.initialY = initialY;
            this.finalX = finalX;
            this.finalY = finalY;
        }
    }
}
