import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vensa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vensa extends World
{
    public int fina = 0;
    /**
     * Constructor for objects of class vensa.
     * 
     */
    public vensa()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        act();
    }
    public void act() {
    if (Greenfoot.isKeyDown("enter") && (fina == 0)){
            cred world = new cred();
            Greenfoot.setWorld(world);
        }
    
    }
}
