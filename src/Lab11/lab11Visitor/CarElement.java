/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11.lab11Visitor;

/**
 *
 * @author boonjv
 */
interface CarElement {
    void accept(CarElementVisitor visitor);
}
