import java.awt.*;

public class Main {
    public static void main(String[] args) {
        import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */
        public class Astronaut {

            //VARIABLE DECLARATION SECTION
            //Here's where you state which variables you are going to use.
            public String name;
            public int xpos;                //the x position
            public int ypos;                //the y position
            public int dx;
            public int dy;
            public int width;
            public int height;
            public boolean isAlive;
            public Rectangle rec;
            public boolean isCrashing;

            // METHOD DEFINITION SECTION

            // Constructor Definition
            // A constructor builds the object when called and sets variable values.


            //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
            // if you put in a String, an int and an int the program will use this constructor instead of the one above.
            public Astronaut(int pXpos, int pYpos) {
                xpos = pXpos;
                ypos = pYpos;
                dx =-3;
                dy =-3;
                width = 100;
                height = 60;
                isAlive = true;
                rec = new Rectangle(xpos,ypos,width,height);
                isCrashing=false;

            } // constructor

            //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
            public void move() {
                xpos = xpos + dx;
                ypos = ypos + dy;

            }
            public void bounce() {
                if (xpos > 990) { //bounce off east wall
                    dx=-dx;
                    rec = new Rectangle(xpos,ypos,width,height);

                    //bounce off west wall
                    //bounce off south wall
                    //bounce off north wall
                }

                if(xpos<1000){
                    dx=-dx;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                if(ypos>1000){
                    dy=-dy;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                if(ypos<100){
                    dy=-dy;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                xpos = xpos + dx;
                ypos = ypos + dy;
                rec = new Rectangle(xpos,ypos,width,height);



            }

            public void wrap() {
                if (xpos > 1000) {
                    xpos = 0;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                if (xpos < 0) {
                    xpos = 1000;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                if (ypos > 700) {
                    ypos = 0;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                if (ypos < 0) {
                    ypos = 700;
                    rec = new Rectangle(xpos,ypos,width,height);
                }

                xpos = xpos + dx;
                ypos = ypos + dy;
                rec = new Rectangle(xpos,ypos,width,height);

            }

        }











    }
}