/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;


/**
 *
 * @author user
 */
class BaseBall extends Ball {

    @Override
    public void hit() {
        System.out.println("You tore the cover off!");
        super.hit();
    }
}
