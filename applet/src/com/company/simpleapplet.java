package com.company;

import java.applet.Applet;
import java.awt.*;

public class simpleapplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("A simple applet",20,20);
    }

    public static void main(String[] args) {

    }
}
