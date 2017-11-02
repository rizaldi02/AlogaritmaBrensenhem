/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garisbresenhem;


import java.awt.Graphics;

/**
 *
 * @author RIZAL
 */
public class Garis {
    
    public void Garisku(Graphics g,int x1,int x2,int y1,int y2){
        int x,y,x_akhir;
        int dx=Math.abs(x2-x1);
        int dy=Math.abs(y2-y1);
        int p=2*dy-dx;
        int duaDy=2*dy;
        int duaDyDx=2*dy-dx;
        
        if (x1>x2){
            x=x2;
            y=y2;
            x_akhir=x1;
         }
        else{
            x=x1;
            y=y1;
            x_akhir=x2;
        }
        
        g.drawRect(x, y, 1, 1);
        
        while(x<x_akhir){
            x++;
            if(p<0){
                p+=duaDy;
            
            }
            else{
                y++;
                p+=duaDyDx;
            }
            g.drawRect(x, y, 1, 1);
            
        }
        
    
    }
    
}
