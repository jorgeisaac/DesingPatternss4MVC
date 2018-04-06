package com.caveofprogramming.designpatterns.demo1.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jorgeisaac on 6/4/18.
 */
public class View  extends JFrame{

private Model model;

    public View(Model model) throws HeadlessException {
        super("MV DEMO")
        this.model = model;
    }
}
