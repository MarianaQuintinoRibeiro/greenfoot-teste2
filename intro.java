import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{   
    public int temp = 9;
    public int temp1 = 9;
    public int temp2 = 9;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act() {
        temp--;
        //Dialogo Naruto
        if (Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("Naruto.png"));
            temp1--;
        }

        //Dialogo Sasuke
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("Sasuke.png"));
            temp2--;
        }

        //Iniciar Jogo
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            folha world = new folha();
            Greenfoot.setWorld(world);
        }

    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}

