package events;

import java.awt.event.MouseEvent;
import java.util.List;
import javafx.scene.Scene;

import java.awt.event.*;
import ui.shapes.Drawables;
import ui.shapes.Shape;
import xshape.JfxScene;

import java.awt.geom.Point2D;

public class JfxMoveShape extends MouseAdapter {
    
        private Shape drawable;
        private Scene scene;

        private Drawables drawables;

        
        public JfxMoveShape(JfxScene jfxscene) {
            super();
            this.scene = jfxscene.getWindow();
            this.drawables = jfxscene.getDrawables();
        }       


        public void mouseDragged(MouseEvent e) {
            this.scene.setOnMouseDragged(mouseEvent -> {            
                    Shape tmp;
                    if (drawable != null) {
                        tmp = drawable.position(new Point2D.Double(mouseEvent.getX(),mouseEvent.getY()));  
                        //canvas.repaint();
                        tmp.draw();
                    }
                });
            }


       
        public void mousePressed(MouseEvent e) {
                this.scene.setOnMousePressed(mouseEvent -> {
                    System.out.printf("Bouton %s cliqué sur le nœud, %d click(s) %f x %f.", mouseEvent.getButton(), mouseEvent.getClickCount(), mouseEvent.getX(), mouseEvent.getY()).println();
                    List selectedDrawables = this.drawables.findDrawables(new Point2D.Double(mouseEvent.getX(), mouseEvent.getY()) ); 
                    if (selectedDrawables.size() == 0)
                        return;
                    drawable = (Shape) selectedDrawables.get(0);     
            });
        }
    
        public void mouseReleased(MouseEvent e) {
            drawable = null;
        }
    
    }

