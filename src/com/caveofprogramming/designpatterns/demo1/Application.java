package com.caveofprogramming.designpatterns.demo1;

import javax.swing.*;

import com.caveofprogramming.designpatterns.demo1.Controller.Controller;
import com.caveofprogramming.designpatterns.demo1.Model.*;
import com.caveofprogramming.designpatterns.demo1.View.*;


/**
 * Created by jorgeisaac on 6/4/18.
 */
public class Application {

    public  static  void main(String[] arg){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {


                runApp();
            }
        });


    }

    public static void runApp(){

        Model model = new Model();
        View view = new View(view);
        Controller controller = new Controller(model,view);





    }


}
