package com.caveofprogramming.designpatterns.demo1.Controller;

import com.caveofprogramming.designpatterns.demo1.Model.Model;
import com.caveofprogramming.designpatterns.demo1.View.View;

/**
 * Created by jorgeisaac on 6/4/18.
 */
public class Controller {

    private View view;
    private Model model;


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}
